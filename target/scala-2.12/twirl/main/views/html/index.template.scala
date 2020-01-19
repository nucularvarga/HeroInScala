
package views.html

/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import play.api.data._
/*7.2*/import forms.TotpSetupForm.Data
/*8.2*/import com.mohiva.play.silhouette.impl.providers.GoogleTotpCredentials
/*9.2*/import com.mohiva.play.silhouette.impl.providers.GoogleTotpInfo

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[models.User,Option[GoogleTotpInfo],Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]],RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*11.2*/(user: models.User, totpInfoOpt: Option[GoogleTotpInfo], totpDataOpt: Option[(Form[Data], GoogleTotpCredentials)] = None)(implicit request: RequestHeader,
        messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*14.2*/implicitFieldConstructor/*14.26*/ = {{
    b4.vertical.fieldConstructor()
}};
Seq[Any](format.raw/*12.76*/("""

"""),format.raw/*16.2*/("""

    """),_display_(/*18.6*/main("HTWG Heroes")/*18.25*/ {_display_(Seq[Any](format.raw/*18.27*/("""
        """),format.raw/*19.9*/("""<style>
                h1 """),format.raw/*20.20*/("""{"""),format.raw/*20.21*/("""font:20px "Helvetica Nueue",sans-serif;"""),format.raw/*20.60*/("""}"""),format.raw/*20.61*/("""
        """),format.raw/*21.9*/("""</style>
        <div class="container">
            <div class="row">
                <div class="col-4 mx-auto text-center">
                    <a href="https://en.wikipedia.org/wiki/Heroes_of_Might_and_Magic:_A_Strategic_Quest">
                        <img id="heroesImg" src="""),_display_(/*26.50*/assets/*26.56*/.path("images/heroes.png")),format.raw/*26.82*/(""">
                    </a>
                </div>
            </div>
        </div>
        <h1 class = "display-4">
            Historic Background
        </h1>

        <table class = "table table-hover">
            <thead class = "thead-dark">
            <tr>
                <th>  <b>Name </b> </th>
                <th>  <b>Release Date </b></th>
                <th>  <b>Compatibility </b> </th>
            </tr>
            </thead>
            <tr>
                <td>Heroes:Might and Magic</td>
                <td>1995</td>
                <td>DOS, Windows 95, Mac OS</td>
            </tr>
            <tr>
                <td>Heroes:Might and Magic &#8545;</td>
                <td>1996</td>
                <td>DOS, Microsoft Windows 95, Mac OS, RISC OS, GBC</td>
            </tr>
            <tr>
                <td>Heroes:Might and Magic &#8546;</td>
                <td>1999</td>
                <td>Windows, Macintosh, Linux (PowerPC/x86), iOS, Android</td>
            </tr>
            <tr>
                <td>Heroes:Might and Magic &#8547;</td>
                <td>2002</td>
                <td>Microsoft Windows, Mac OS</td>
            </tr>
            <tr>
                <td>Heroes:Might and Magic &#8548;</td>
                <td>2006</td>
                <td>Microsoft Windows, OS X</td>
            </tr>
            <tr>
                <td>Heroes:Might and Magic &#8549;</td>
                <td>2011</td>
                <td>Microsoft Windows</td>
            </tr>
        </table>

        <br>
        <h1 class = "display-4">
          Gameplay
        </h1>
        <p class="lead">
            Heroes of Might and Magic takes place in a medieval fantasy world filled with creatures frequently associated with myth and legend. These creatures compose the military forces (troops) with which the player attempts to conquer opponents. The player leads generals through the game world at the head of armies of troops. These generals, called <b>"heroes,"</b> provide a means to explore, attack, defeat, and acquire, the four basic principles in the game. The ultimate goal of the game is usually to capture all enemy castles and defeat all enemy heroes. However, the game comes with many different play scenarios, and some of these scenarios have unique victory conditions, such as accumulating a certain amount of gold, or finding a particular artifact.[citation needed]

            There are four different classes of heroes and castles, each with their own units and strengths/weaknesses. The two "might" classes, Knight and Barbarian, earn skill points in attack or defense more often than in spell power or knowledge. The two <b>"magic"</b> classes, Sorceress and Warlock, earn skill points in spell power or knowledge more often than in attack or defense. There is also a neutral, "wandering" class of troops, including Rogues, Nomads, Ghosts (the only one that can not be hired) and Genies.
        </p>
        <br>
        <h1 class = "display-4">
            About Heroes Universe
        </h1>
        <p class="lead">
            Up until Heroes of Might and Magic V &reg;
            , the Heroes series took place in the same fictional universe as the Might and Magic series, and later Might and Magic installments heavily referenced the games, with some taking place in the same world.
            Heroes I and II take place on the planet of Enroth, on a northerly continent of the same name, and chronicle the adventures of the Ironfist dynasty. The protagonist of Heroes I is Lord Morglin Ironfist, a knight who discovers a portal to the realm of Enroth while fleeing from his throne's usurpers, and goes on to conquer and dominate the continent, establishing a unified kingdom and a new rule.
            Heroes II featured a two-sided conflict between Morglin's sons, Roland and Archibald, both vying for their deceased father's throne. Canonically, Roland defeats Archibald, though the player can choose to align themself with either side. It was the first game in the series to feature playable heroes as campaign characters—the main characters of Heroes I were represented by the player's presence rather than as commanders on the battlefield.
            The storylines of Heroes III and the Heroes Chronicles shift focus to the Gryphonheart dynasty on the southern continent of Antagarich, and introduces the Kreegan as playable characters and enemies. In Heroes III, Queen Catherine Gryphonheart, King Roland's wife, is called home to attend her father's funeral, to discover Antagarich being torn apart by various factions. Heroes III's expansions build on the setting with more prominent character development, featuring new and old heroes from the series in differing roles.
            The events preceding Heroes IV precipitated the destruction of Enroth due to a clash between Armageddon's Blade and the Sword of Frost. The ensuing destruction brings about portals leading to another world, Axeoth, through which many characters escape. Heroes IV's campaigns focus on the scattered survivors from Enroth and Antagarich as they form new kingdoms and alliances in the new world.
        </p>
        <button type="button" class="btn btn-dark">
            Back
            <a href="http://localhost:9000/">
            </a>
        </button>
    """)))}),format.raw/*101.6*/("""
"""))
      }
    }
  }

  def render(user:models.User,totpInfoOpt:Option[GoogleTotpInfo],totpDataOpt:Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]],request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(user,totpInfoOpt,totpDataOpt)(request,messages,webJarsUtil,assets)

  def f:((models.User,Option[GoogleTotpInfo],Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]]) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (user,totpInfoOpt,totpDataOpt) => (request,messages,webJarsUtil,assets) => apply(user,totpInfoOpt,totpDataOpt)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jan 19 00:15:59 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/index.scala.html
                  HASH: 02a1843463096537b1ef3b1e4e4368c9c7b8c4d6
                  MATRIX: 28->3|65->35|106->71|149->109|188->143|218->168|257->202|335->275|836->343|1155->579|1188->603|1263->574|1294->647|1329->656|1357->675|1397->677|1434->687|1490->715|1519->716|1586->755|1615->756|1652->766|1966->1053|1981->1059|2028->1085|7452->6478
                  LINES: 4->2|5->3|6->4|7->5|8->6|9->7|10->8|11->9|16->11|21->14|21->14|24->12|26->16|28->18|28->18|28->18|29->19|30->20|30->20|30->20|30->20|31->21|36->26|36->26|36->26|111->101
                  -- GENERATED --
              */
          