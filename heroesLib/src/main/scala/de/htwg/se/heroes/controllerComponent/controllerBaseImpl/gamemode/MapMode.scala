package de.htwg.se.heroes.controllerComponent.controllerBaseImpl.gamemode

import de.htwg.se.heroes.controllerComponent.controllerBaseImpl.gamemode.UIEvent.{ StartCombat, UIEvent }
import de.htwg.se.heroes.model.fieldComponent.FieldInterface
import de.htwg.se.heroes.model.fieldComponent.fieldBaseImpl._
import de.htwg.se.heroes.model.playerComponent.PlayerListInterface

case class MapMode(playField: FieldInterface, var playerBase: PlayerListInterface) extends GameMode {
  var enemy: EnemyCell = EnemyCell(0)
  private var t: GameMode = this
  override def handle(e: UIEvent): GameMode = {
    e match {
      case UIEvent.StartCombat => CombatMode(new Arena(9, 9), playerBase, enemy, this).handle(StartCombat)
      case UIEvent.WinEndCombat => winMove
      case UIEvent.LoseEndCombat => MapMode(playField, playerBase)
      case UIEvent.MoveUp => action(UIEvent.MoveUp)
      case UIEvent.MoveLeft => action(UIEvent.MoveLeft)
      case UIEvent.MoveRight => action(UIEvent.MoveRight)
      case UIEvent.MoveDown => action(UIEvent.MoveDown)
    }
  }

  def winMove: GameMode = {
    t
  }

  def updateField(play: FieldInterface): MapMode = copy(play, playerBase)

  override def updatePlayerBase(base: PlayerListInterface): MapMode = copy(playField, base)

  def move(e: UIEvent): GameMode = {
    val (x, y) = calcDir(e)
    var f = this
    f = f.updateField(f.playField.set(f.playerBase.getPlayer.x, f.playerBase.getPlayer.y, Leer()))
    f = f.updateField(f.playField.set(f.playerBase.getPlayer.x + x, f.playerBase.getPlayer.y + y, HeroCell(f.playerBase.getPlayer.name)))
    f = f.updatePlayerBase(f.playerBase.updatePlayer(0, x, y))
    f.updatePlayerBase(f.playerBase.nextPlayer) // TODO next? iterator?
  }

  def pickupGold(event: UIEvent.UIEvent): GameMode = {
    playerBase = playerBase.updatePlayerGold(50)
    move(event)
  }

  def action(d: UIEvent): GameMode = {
    val (x, y) = calcDir(d)
    val cell = playField.cell(playerBase.getPlayer.x + x, playerBase.getPlayer.y + y)
    cell match {
      case GoldCell() => pickupGold(d)
      case Leer() => move(d)
      case Stop() => MapMode(playField, playerBase)
      case f: EnemyCell =>
        t = t.asInstanceOf[MapMode].move(d); startBattle(f)
      case _ => MapMode(playField, playerBase)
    }
  }

  def startBattle(enemys: EnemyCell): GameMode = {
    enemy = enemys
    handle(StartCombat) //CombatMode(playerBase, enemy)
  }

  override def toString: String = playField.toString

  override def cell(x: Int, y: Int): Cell = playField.cell(x, y)

  override def playlist: PlayerListInterface = playerBase

}
