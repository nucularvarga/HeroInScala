package controllers

import javax.inject._
import play.api.mvc._
import de.htwg.se.heroes.main
import de.htwg.se.heroes.controllerComponent.controllerBaseImpl.gamemode.UIEvent
import de.htwg.se.heroes.controllerComponent.FieldChanged
import play.api.libs.streams.ActorFlow
import org.webjars.play.WebJarsUtil
import akka.actor.ActorSystem
import akka.stream.Materializer
import akka.actor._

import scala.swing.Reactor



@Singleton
class HeroesInScala @Inject()(cc: ControllerComponents)(implicit webJarsUtil: WebJarsUtil, system: ActorSystem, mat: Materializer) extends AbstractController(cc) {
  var gameController = main.controller
  gameController.init("2")
  def HeroesAsText =  gameController.playgroundToString //+ GameStatus.message(gameController.gameStatus)

  def about= Action {
    Ok(views.html.index())
  }

  def command(cmd: String) = Action {
  /*  val inputsplit = cmd.split(",")
    var typ = UIEvent.BuyMelee
    var input = inputsplit(0)
    input match {
    case "MoveUp" => gameController.action(UIEvent.MoveUp)
    case "MoveLeft" => gameController.action(UIEvent.MoveLeft)
    case "MoveDown" => gameController.action(UIEvent.MoveDown)
    case "MoveRight" => gameController.action(UIEvent.MoveRight)
    case "b" => gameController.openShop(typ, inputsplit(1).toInt)
    }

    Ok(gameController.playgroundToString)
    */
   Ok(views.html.heroes(gameController))

  }

  def init = Action {
    Ok(views.html.heroes(gameController))
  }

  def getjson = Action {
    Ok(gameController.getJson);
  }

  def moveUp = Action {

    Ok( gameController.action(UIEvent.MoveUp))
  }

  def moveLeft = Action {
    Ok(gameController.action(UIEvent.MoveLeft))
  }

  def moveRight = Action {

    Ok(gameController.action(UIEvent.MoveRight))
  }

  def moveDown = Action {

    Ok(gameController.action(UIEvent.MoveDown))
  }

  def lookUp = Action {
    //gameController.show(UIEvent.MoveUp)
    Ok(gameController.show(UIEvent.MoveUp))
  }

  def lookLeft = Action {
    //gameController.show(UIEvent.MoveLeft)
    Ok(gameController.show(UIEvent.MoveLeft))
  }

  def lookRight = Action {
    //gameController.show(UIEvent.MoveRight)
    Ok(gameController.show(UIEvent.MoveRight))
  }

  def lookDown = Action {
    //gameController.show(UIEvent.MoveDown)
    Ok(gameController.show(UIEvent.MoveDown))
  }

  def heroes = Action {
    Ok(HeroesAsText)
  }

  def offline() = Action {
    implicit request: Request[AnyContent] =>
      Ok(views.html.offline())
  }

  var participants: Array[ActorRef] = Array.empty[ActorRef]
  def socket = WebSocket.accept[String, String] { request =>

    ActorFlow.actorRef { out =>
      participants = participants :+ out
      println(out)
      println("Connect received")
      HeroesWebSocketActorFactory.create(out)
    }
  }

  object HeroesWebSocketActorFactory {

    def create(out: ActorRef) = {
      Props(new HeroesWebSocketActor(out))
    }

  }

  class HeroesWebSocketActor(out: ActorRef) extends Actor with Reactor {
    listenTo(gameController)

    def receive = {
      case msg: String =>
        for (name <- participants) {name ! (gameController.getJson.toString)}
        println("Sent Json to Client"+ msg)
    }

    reactions += {
      case event: FieldChanged  => sendJsonToClient
    }

    def sendJsonToClient = {
      println("Received event from Controller")
      for (name <- participants) {println(name) + gameController.toString}
      //for (name <- participants) {name ! (gameController.getJson.toString)}
      out ! (gameController.getJson.toString)
    }
  }

}
