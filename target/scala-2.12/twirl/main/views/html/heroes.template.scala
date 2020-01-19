
package views.html

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import org.webjars.play.WebJarsUtil
/*4.2*/import controllers.AssetsFinder
/*5.2*/import play.api.data._
/*6.2*/import forms.TotpSetupForm.Data
/*7.2*/import com.mohiva.play.silhouette.impl.providers.GoogleTotpCredentials
/*8.2*/import com.mohiva.play.silhouette.impl.providers.GoogleTotpInfo

object heroes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[de.htwg.se.heroes.controllerComponent.ControllerInterface,models.User,Option[GoogleTotpInfo],Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]],RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(controller:de.htwg.se.heroes.controllerComponent.ControllerInterface, user: models.User, totpInfoOpt: Option[GoogleTotpInfo], totpDataOpt: Option[(Form[Data], GoogleTotpCredentials)] = None)(implicit request: RequestHeader,
        messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*13.2*/implicitFieldConstructor/*13.26*/ = {{
    b4.vertical.fieldConstructor()
}};
Seq[Any](format.raw/*11.76*/("""

"""),format.raw/*15.2*/("""


"""),_display_(/*18.2*/main("heroes")/*18.16*/{_display_(Seq[Any](format.raw/*18.17*/("""
    """),format.raw/*19.5*/("""<script src='"""),_display_(/*19.19*/assets/*19.25*/.path("javascripts/vue.js")),format.raw/*19.52*/("""'></script>
    <script src='"""),_display_(/*20.19*/assets/*20.25*/.path("javascripts/heroesVue.js")),format.raw/*20.58*/("""'></script>
    <script src='"""),_display_(/*21.19*/assets/*21.25*/.path("stylesheets/wui.css")),format.raw/*21.53*/("""'></script>
    <div id="heroes-game" class="pagecontainer">

        <heroes-field></heroes-field>

    </div>
   """),format.raw/*104.13*/("""

""")))}),format.raw/*106.2*/("""
"""))
      }
    }
  }

  def render(controller:de.htwg.se.heroes.controllerComponent.ControllerInterface,user:models.User,totpInfoOpt:Option[GoogleTotpInfo],totpDataOpt:Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]],request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(controller,user,totpInfoOpt,totpDataOpt)(request,messages,webJarsUtil,assets)

  def f:((de.htwg.se.heroes.controllerComponent.ControllerInterface,models.User,Option[GoogleTotpInfo],Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]]) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (controller,user,totpInfoOpt,totpDataOpt) => (request,messages,webJarsUtil,assets) => apply(controller,user,totpInfoOpt,totpDataOpt)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jan 19 10:49:17 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/heroes.scala.html
                  HASH: 6aebd052f793c9d7334f82efac2382a26001748a
                  MATRIX: 28->1|65->33|106->69|149->107|188->141|218->166|257->200|335->273|895->341|1284->647|1317->671|1392->642|1423->715|1456->722|1479->736|1518->737|1551->743|1592->757|1607->763|1655->790|1713->821|1728->827|1782->860|1840->891|1855->897|1904->925|2054->5697|2090->5702
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|11->8|16->10|21->13|21->13|24->11|26->15|29->18|29->18|29->18|30->19|30->19|30->19|30->19|31->20|31->20|31->20|32->21|32->21|32->21|38->104|40->106
                  -- GENERATED --
              */
          