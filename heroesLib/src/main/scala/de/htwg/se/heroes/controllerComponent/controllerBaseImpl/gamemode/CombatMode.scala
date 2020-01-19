package de.htwg.se.heroes.controllerComponent.controllerBaseImpl.gamemode

import UIEvent.UIEvent
import de.htwg.se.heroes.model.fieldComponent._
import de.htwg.se.heroes.model.fieldComponent.fieldBaseImpl.{ Cell, EnemyCell, Leer, Stop }
import de.htwg.se.heroes.model.playerComponent.PlayerListInterface
import de.htwg.se.heroes.model.soldier.SoldierInterface
import de.htwg.se.heroes.model.soldier.soldierBaseImpl.Soldier

case class CombatMode(playArena: ArenaInterface, playerBase: PlayerListInterface, enemy: EnemyCell, map: MapMode) extends GameMode {

  var unitVector: Vector[Soldier] = Vector.empty
  var selectX: Int = 0
  var selectY: Int = 0
  override def handle(e: UIEvent): GameMode = {
    e match {
      case UIEvent.Selected => executeRange()
      case UIEvent.WinEndCombat => map.handle(UIEvent.WinEndCombat)
      case UIEvent.LoseEndCombat => map.handle(UIEvent.LoseEndCombat)
      case UIEvent.StartCombat => initArena()
      case UIEvent.MoveUp => action(UIEvent.MoveUp)
      case UIEvent.MoveLeft => action(UIEvent.MoveLeft)
      case UIEvent.MoveRight => action(UIEvent.MoveRight)
      case UIEvent.MoveDown => action(UIEvent.MoveDown)
    }
  }

  def executeRange(): GameMode = {
    if (playArena.cell(selectX, selectY).asInstanceOf[EnemyCell].strength > playerBase.getAttackUnit.getStrength)
      handle(UIEvent.LoseEndCombat)
    else
      handle(UIEvent.WinEndCombat)
  }

  def updateArena(arena: ArenaInterface): CombatMode = copy(arena, playerBase, enemy)

  def initArena(): CombatMode = {
    println("action init")
    val f = updateArena(playArena.initArena)
    f.setSoldier(f.enemy)
  }

  def action(d: UIEvent): GameMode = {
    val (x, y) = calcDir(d)
    val cell = playArena.cell(playerBase.getAttackUnit.getX + x, playerBase.getAttackUnit.getY + y)
    cell match {
      case Leer() => move(d)
      case Stop() => CombatMode(playArena, playerBase, enemy, map)
      case f: EnemyCell => fight(f, d)
      case _ => this
    }
  }

  def fight(soldir: EnemyCell, d: UIEvent): GameMode = {
    if (soldir.strength > playerBase.getAttackUnit.getStrength)
      handle(UIEvent.LoseEndCombat)
    else
      handle(UIEvent.WinEndCombat)
  }

  def meleeAttack(soldir: EnemyCell): Boolean = {
    soldir.strength > playerBase.getAttackUnit.getStrength
  }

  //def rangeAttack(): GameMode = {}

  def move(e: UIEvent): CombatMode = {
    val (x, y) = calcDir(e)
    var f = this
    f = updateArena(playArena.set(playerBase.getAttackUnit.getX, playerBase.getAttackUnit.getY, Leer()))
    f = f.updateArena(f.playArena.set(f.playerBase.getAttackUnit.getX + x, f.playerBase.getAttackUnit.getY + y, f.playerBase.getAttackUnit.asInstanceOf[Cell]))
    f = f.updatePlayerBase(f.playerBase.moveunit(f.playerBase.getAttackUnit.getX + x, f.playerBase.getAttackUnit.getY + y, f.playerBase.getAttackUnit))
    println("x= " + f.playerBase.getAttackUnit.getX + " y= " + f.playerBase.getAttackUnit.getY)
    //f = f.updatePlayerBase(f.playerBase.nextAttackUnit)
    println("attacknumber =" + f.playerBase.getAttackUnit)
    f
  }

  override def updatePlayerBase(base: PlayerListInterface): CombatMode = copy(playArena, base)

  def setSoldier(enemy: EnemyCell): CombatMode = {
    var f = this
    for (e <- playerBase.getPlayer.units) unitVector = unitVector :+ e._1
    for { list <- 0 until playerBase.getPlayer.units.size } {
      f = f.updateArena(f.playArena.set(unitVector(list).getX, unitVector(list).getY, unitVector(list).asInstanceOf[Cell]))
      f = f.updateArena(f.playArena.set(7, 1 + list, enemy))
    }
    //CombatMode(playArena, playerBase, enemy)
    f
  }
  override def toString: String = playArena.toString

  override def cell(x: Int, y: Int): Cell = playArena.cell(x, y)

  override def playlist: PlayerListInterface = playerBase

}
