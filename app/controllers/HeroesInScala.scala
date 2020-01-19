package controllers

import akka.actor.{ ActorSystem, _ }
import akka.stream.Materializer
import com.mohiva.play.silhouette.api.{ HandlerResult, Silhouette }
import com.mohiva.play.silhouette.api.actions.SecuredRequest
import com.mohiva.play.silhouette.api.repositories.AuthInfoRepository
import com.mohiva.play.silhouette.impl.providers.GoogleTotpInfo
import utils.auth.DefaultEnv
import play.api.i18n.I18nSupport
import de.htwg.se.heroes.controllerComponent.FieldChanged
import de.htwg.se.heroes.controllerComponent.controllerBaseImpl.gamemode.UIEvent
import de.htwg.se.heroes.main

import scala.concurrent.{ ExecutionContext, Future }
import javax.inject._
import models.User
import org.webjars.play.WebJarsUtil
import play.api.libs.streams.ActorFlow
import play.api.mvc._

import scala.swing.Reactor
import scala.collection.mutable.ArrayBuffer
import scala.util.{ Failure, Success, Try }

@Singleton
class HeroesInScala @Inject() (cc: ControllerComponents, silhouette: Silhouette[DefaultEnv],
  authInfoRepository: AuthInfoRepository)(implicit webJarsUtil: WebJarsUtil, assets: AssetsFinder, system: ActorSystem, mat: Materializer, ec: ExecutionContext) extends AbstractController(cc) with I18nSupport {
  var gameController = main.controller
  gameController.init("2")
  def HeroesAsText = gameController.playgroundToString //+ GameStatus.message(gameController.gameStatus)

  def about = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(views.html.index(request.identity, totpInfoOpt))
    }
  }

  def command(cmd: String) = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(views.html.heroes(gameController, request.identity, totpInfoOpt))
    }
  }

  def init = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(views.html.heroes(gameController, request.identity, totpInfoOpt))
    }
  }

  def getjson = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(gameController.getJson);
    }
  }

  def moveUp = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(gameController.action(UIEvent.MoveUp))
    }
  }

  def moveLeft = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(gameController.action(UIEvent.MoveLeft))
    }
  }

  def moveRight = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(gameController.action(UIEvent.MoveRight))
    }
  }

  def moveDown = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(gameController.action(UIEvent.MoveDown))
    }
  }

  def lookUp = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(gameController.show(UIEvent.MoveUp))
    }
    //gameController.show(UIEvent.MoveUp)

  }

  def lookLeft = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(gameController.show(UIEvent.MoveLeft))
    }
    //gameController.show(UIEvent.MoveLeft)

  }

  def lookRight = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(gameController.show(UIEvent.MoveRight))
    }
    //gameController.show(UIEvent.MoveRight)

  }

  def lookDown = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(gameController.show(UIEvent.MoveDown))
    }
    //gameController.show(UIEvent.MoveDown)

  }

  def heroes = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(HeroesAsText)
    }

  }

  def offline() = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(views.html.offline())
    }
  }

  var participants: Array[ActorRef] = Array.empty[ActorRef]

  object HeroesWebSocketActorFactory {

    def props(user: User)(out: ActorRef) = {
      Props(new HeroesWebSocketActor(user, out))
    }

  }

  class HeroesWebSocketActor(user: User, out: ActorRef) extends Actor with Reactor {
    listenTo(gameController)

    def receive = {
      case msg: String =>
        for (name <- participants) { name ! (gameController.getJson.toString) }
        println("Sent Json to Client" + msg)
        sendJsonToClient()
    }

    reactions += {
      case event: FieldChanged => sendJsonToClient()
    }

    def sendJsonToClient(): Unit = {
      println("Received event from Controller")
      for (name <- participants) { println(name) + gameController.toString }
      //for (name <- participants) {name ! (gameController.getJson.toString)}
      out ! (gameController.getJson.toString)
    }
  }

  def socket = WebSocket.acceptOrResult[String, String] { request =>
    //participants = participants :+ out
    implicit val req = Request(request, AnyContentAsEmpty)
    silhouette.SecuredRequestHandler { securedRequest =>
      Future.successful(HandlerResult(Ok, Some(securedRequest.identity)))
    }.map {
      case HandlerResult(r, Some(user)) => Right(ActorFlow.actorRef(HeroesWebSocketActorFactory.props(user)))
      case HandlerResult(r, None) => Left(r)
    }
  }

}
