
package views.html

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import org.webjars.play.WebJarsUtil
/*4.2*/import controllers.AssetsFinder
/*5.2*/import play.api.data._
/*6.2*/import forms.TotpSetupForm.Data
/*7.2*/import com.mohiva.play.silhouette.impl.providers.GoogleTotpCredentials
/*8.2*/import com.mohiva.play.silhouette.impl.providers.GoogleTotpInfo

object mainheroes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[models.User,Option[GoogleTotpInfo],Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]],RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(user: models.User, totpInfoOpt: Option[GoogleTotpInfo], totpDataOpt: Option[(Form[Data], GoogleTotpCredentials)] = None)(implicit request: RequestHeader,
        messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*13.2*/implicitFieldConstructor/*13.26*/ = {{
    b4.vertical.fieldConstructor()
}};
Seq[Any](format.raw/*11.76*/("""

"""),format.raw/*15.2*/("""
"""),format.raw/*16.39*/("""

"""),format.raw/*18.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*21.93*/("""

        """),format.raw/*23.9*/("""<link rel="stylesheet" media="screen" href='"""),_display_(/*23.54*/assets/*23.60*/.path("stylesheets/main.css")),format.raw/*23.89*/("""'>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*24.59*/assets/*24.65*/.path("images/favicon.png")),format.raw/*24.92*/("""">
        <link rel="stylesheet" href=""""),_display_(/*25.39*/assets/*25.45*/.path("stylesheets/wui.css")),format.raw/*25.73*/(""""/>
        <link rel="manifest" href="/manifest.json" crossorigin="use-credentials"/>
        <script src=""""),_display_(/*27.23*/assets/*27.29*/.path("javascripts/hello.js")),format.raw/*27.58*/("""" type="text/javascript"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src='"""),_display_(/*32.23*/assets/*32.29*/.path("javascripts/vue.js")),format.raw/*32.56*/("""'></script>
        <script src='"""),_display_(/*33.23*/assets/*33.29*/.path("javascripts/heroesVue.js")),format.raw/*33.62*/("""'></script>
        <script src='"""),_display_(/*34.23*/assets/*34.29*/.path("javascripts/sw.js")),format.raw/*34.55*/("""'></script>
        <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
        <div class="header">
            </div>
        <div class="topnav">
            <a href="http://localhost:9000/">Game</a>
            <a href="http://localhost:9000/about">About</a>
        </div>
    </head>
    <body>
        """),format.raw/*45.32*/("""
        """),_display_(/*46.10*/main),format.raw/*46.14*/("""
    """),format.raw/*47.5*/("""</body>
    <footer class="footer">
        <div class="footer-copyright text-center py-3">© Source Code on:
            <a href="https://github.com/nucularvarga/HeroInScala"> Github.com</a>
        </div>
    </footer>
</html>
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
                  DATE: Sun Jan 19 00:21:55 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/mainheroes.scala.html
                  HASH: ca1e630c4e22863264fb53dee22b1afc8a938321
                  MATRIX: 28->1|65->33|106->69|149->107|188->141|218->166|257->200|335->273|841->341|1160->577|1193->601|1268->572|1299->645|1329->685|1360->689|1443->828|1482->840|1554->885|1569->891|1619->920|1708->982|1723->988|1771->1015|1840->1057|1855->1063|1904->1091|2042->1202|2057->1208|2107->1237|2960->2063|2975->2069|3023->2096|3085->2131|3100->2137|3154->2170|3216->2205|3231->2211|3278->2237|3642->2664|3680->2675|3705->2679|3738->2685
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|11->8|16->10|21->13|21->13|24->11|26->15|27->16|29->18|32->21|34->23|34->23|34->23|34->23|35->24|35->24|35->24|36->25|36->25|36->25|38->27|38->27|38->27|43->32|43->32|43->32|44->33|44->33|44->33|45->34|45->34|45->34|55->45|56->46|56->46|57->47
                  -- GENERATED --
              */
          