package de.htwg.se.heroes.model


import de.htwg.se.heroes.model.playerComponent.playerListBaseImpl.Player
import de.htwg.se.heroes.model.soldier.SoldierInterface
import de.htwg.se.heroes.model.soldier.soldierBaseImpl.{MeleeSoldier, RangeSoldier, Soldier}
import org.scalatest.{Matchers, WordSpec}

import scala.collection.immutable.ListMap

class PlayerSpec extends WordSpec with Matchers {

  "A Player" when {
    "not set to any value " should {
      val emptyPlayer = Player("", 0 , 0, new ListMap[Soldier, Int], 0, 0)
      "have value '' and 0" in {
        emptyPlayer.name should be("")
        emptyPlayer.gold should be(0)
        emptyPlayer.strength should be(0)
        emptyPlayer.x should be(0)
        emptyPlayer.y should be(0)
      }
    }
    "set to a specific values" should {
      var nonEmptyPlayer = Player("test", 100, 10, new ListMap[Soldier, Int], 1, 1)
      "return the values" in {
        nonEmptyPlayer.name should be("test")
        nonEmptyPlayer.gold should be(100)
        nonEmptyPlayer.strength should be(10)
      }
      "player walks right" in {
        nonEmptyPlayer.walk(1, 0) should be(Player("test", 100, 10, new ListMap[Soldier, Int], 2, 1))
      }
      "player grows stronger" in {
        nonEmptyPlayer.powerUp(200) should be(Player("test", 100, 210, new ListMap[Soldier, Int], 1, 1))
      }
      "player adds units" in {
        val list = new ListMap[Soldier, Int]()
        nonEmptyPlayer = nonEmptyPlayer.addUnit(new Soldier(1,1), 1, 5)
        nonEmptyPlayer.units.toString() should be(list.updated(new Soldier(1,1), 1).toString())
      }
      "player adds again units" in {
        val list = new ListMap[Soldier, Int]()
        nonEmptyPlayer = nonEmptyPlayer.addUnit(new Soldier(1,1), 1, 5)
        //nonEmptyPlayer.units should be(list.updated(new Soldier(1,1), 2))
        nonEmptyPlayer.toString should be("test: Gold: 90 Strength: 10 Units: ListMap(S -> 1, S -> 1)")
      }
      "move units" in {
        var Player1 = Player("nargh", 100, 10, new ListMap[Soldier, Int], 1, 1)
        Player1 = Player1.addUnit(new RangeSoldier(2,2), 1, 5)

        var Player2 = Player("nargh", 100, 10, new ListMap[Soldier, Int], 1, 1)
        Player2 = Player2.addUnit(new RangeSoldier(2,2), 1, 5)
        Player2 = Player2.addUnit(new RangeSoldier(2,2), 0, 0)
        Player1.moveUnit(2,2, new RangeSoldier(2,2)).toString should be(Player2.toString)
      }
      "move unit" in {
        var Player1 = Player("nargh", 100, 10, new ListMap[Soldier, Int], 1, 1)
        Player1 = Player1.addUnit(new Soldier(2,2), 1, 5)

        var Player2 = Player("nargh", 100, 10, new ListMap[Soldier, Int], 1, 1)
        Player2 = Player2.addUnit(new Soldier(2,2), 1, 5)
        Player2 = Player2.addUnit(new MeleeSoldier(2,2), 0, 0)
        Player1.moveUnit(2,2, new Soldier(2,2)).toString should be(Player2.toString)
      }
    }
  }
}
