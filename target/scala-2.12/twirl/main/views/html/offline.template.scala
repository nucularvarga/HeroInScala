
package views.html


object offline extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Offline</title>
        <div class="header">
            </div>
        <div class="topnav">
            <p>Offline Page</p>
        </div>
    </head>
    <style>
        html                          """),format.raw/*14.39*/("""{"""),format.raw/*14.40*/(""" """),format.raw/*14.41*/("""-moz-osx-font-smoothing: grayscale; """),format.raw/*14.77*/("""}"""),format.raw/*14.78*/("""
        """),format.raw/*15.9*/("""body                          """),format.raw/*15.39*/("""{"""),format.raw/*15.40*/(""" """),format.raw/*15.41*/("""margin: 0; padding: 0; font-family: Verdana, Helvetica, Arial; color: white; font-size: 14px; line-height: 1.42; letter-spacing: 0.01em; min-width: 320px; """),format.raw/*15.196*/("""}"""),format.raw/*15.197*/("""
        """),format.raw/*16.9*/("""h1, h2, h3                    """),format.raw/*16.39*/("""{"""),format.raw/*16.40*/(""" """),format.raw/*16.41*/("""font-family: Verdana, Helvetica, Arial; font-size: 22px; font-weight: 300; margin: 0.75em auto 0.4em; letter-spacing: 0.01em; """),format.raw/*16.167*/("""}"""),format.raw/*16.168*/("""
        """),format.raw/*17.9*/(""".layout                       """),format.raw/*17.39*/("""{"""),format.raw/*17.40*/(""" """),format.raw/*17.41*/("""width: 100%; display: -webkit-box; display: -ms-flexbox; display: flex; -webkit-box-align: center; -ms-flex-align: center; align-items: center; -webkit-box-pack: center; -ms-flex-pack: center; justify-content: center; padding: 38px 0 60px; """),format.raw/*17.281*/("""}"""),format.raw/*17.282*/("""
        """),format.raw/*18.9*/(""".layout__content              """),format.raw/*18.39*/("""{"""),format.raw/*18.40*/(""" """),format.raw/*18.41*/("""width: 90%; max-width: 950px; """),format.raw/*18.71*/("""}"""),format.raw/*18.72*/("""
        """),format.raw/*19.9*/(""".layout.blue                  """),format.raw/*19.39*/("""{"""),format.raw/*19.40*/(""" """),format.raw/*19.41*/("""background: #56c6d9; """),format.raw/*19.62*/("""}"""),format.raw/*19.63*/("""
        """),format.raw/*20.9*/(""".text-center                  """),format.raw/*20.39*/("""{"""),format.raw/*20.40*/(""" """),format.raw/*20.41*/("""text-align: center; """),format.raw/*20.61*/("""}"""),format.raw/*20.62*/("""
        """),format.raw/*21.9*/(""".kitchensink                  """),format.raw/*21.39*/("""{"""),format.raw/*21.40*/(""" """),format.raw/*21.41*/("""max-width: 950px; width: 100%; """),format.raw/*21.72*/("""}"""),format.raw/*21.73*/("""

    """),format.raw/*23.5*/("""</style>
    <body class="unknown-domain">
        <div class="layout blue">
            <div class="layout__content">
                <div class="kitchensink text-center">
                    <h1>Oops! That's not the site<br>you're looking&nbsp;for.</h1>
                    <h2>We're sorry, you've landed on a page that shows something is wrong with our servers, we will be up and running in no&nbsp;time!</h2>
                </div>
            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 18 23:58:50 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/offline.scala.html
                  HASH: 07479d3e413c09224f1ab05745cab2ed410cf145
                  MATRIX: 320->1|416->3|444->5|776->309|805->310|834->311|898->347|927->348|964->358|1022->388|1051->389|1080->390|1264->545|1294->546|1331->556|1389->586|1418->587|1447->588|1602->714|1632->715|1669->725|1727->755|1756->756|1785->757|2054->997|2084->998|2121->1008|2179->1038|2208->1039|2237->1040|2295->1070|2324->1071|2361->1081|2419->1111|2448->1112|2477->1113|2526->1134|2555->1135|2592->1145|2650->1175|2679->1176|2708->1177|2756->1197|2785->1198|2822->1208|2880->1238|2909->1239|2938->1240|2997->1271|3026->1272|3061->1280
                  LINES: 8->1|13->1|14->2|26->14|26->14|26->14|26->14|26->14|27->15|27->15|27->15|27->15|27->15|27->15|28->16|28->16|28->16|28->16|28->16|28->16|29->17|29->17|29->17|29->17|29->17|29->17|30->18|30->18|30->18|30->18|30->18|30->18|31->19|31->19|31->19|31->19|31->19|31->19|32->20|32->20|32->20|32->20|32->20|32->20|33->21|33->21|33->21|33->21|33->21|33->21|35->23
                  -- GENERATED --
              */
          