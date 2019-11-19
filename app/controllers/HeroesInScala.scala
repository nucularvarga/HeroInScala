package controllers

import javax.inject._
import play.api.mvc._
import de.htwg.se.heroes.main
import de.htwg.se.heroes.controllerComponent.controllerBaseImpl.gamemode.GameMode
import de.htwg.se.heroes.controllerComponent.controllerBaseImpl.gamemode
import de.htwg.se.heroes.controllerComponent.controllerBaseImpl.gamemode.UIEvent.UIEvent
import de.htwg.se.heroes.controllerComponent.controllerBaseImpl.gamemode.UIEvent


@Singleton
class HeroesInScala @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
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

  def getjson = Action {
    Ok(gameController.getJson);
  }

  def moveUp = Action {
    gameController.action(UIEvent.MoveUp)
    Ok(views.html.heroes(gameController))
  }

  def moveLeft = Action {
    gameController.action(UIEvent.MoveLeft)
    Ok(views.html.heroes(gameController))
  }

  def moveRight = Action {
    gameController.action(UIEvent.MoveRight)
    Ok(views.html.heroes(gameController))
  }

  def moveDown = Action {
    gameController.action(UIEvent.MoveDown)
    Ok(views.html.heroes(gameController))
  }

  def lookUp = Action {
    //gameController.show(UIEvent.MoveUp)
    Ok(gameController.show(UIEvent.MoveUp))
  }

  def lookLeft = Action {
    gameController.show(UIEvent.MoveLeft)
    Ok(views.html.heroes(gameController))
  }

  def lookRight = Action {
    gameController.show(UIEvent.MoveRight)
    Ok(views.html.heroes(gameController))
  }

  def lookDown = Action {
    //gameController.show(UIEvent.MoveDown)
    Ok(gameController.show(UIEvent.MoveDown))
  }

  def heroes = Action {
    Ok(HeroesAsText)
  }

}
