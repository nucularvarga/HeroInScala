
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import forms.TotpForm.Data
/*7.2*/import forms.TotpRecoveryForm
/*8.2*/import java.util.UUID

/**/
class totp @javax.inject.Inject() /*10.6*/()(implicit webJarsUtil: WebJarsUtil, assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Data],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*11.2*/(totpForm: Form[Data])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*13.2*/implicitFieldConstructor/*13.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*11.77*/("""

"""),format.raw/*13.64*/("""

"""),_display_(/*15.2*/main(messages("sign.in.title"))/*15.33*/ {_display_(Seq[Any](format.raw/*15.35*/("""
    """),format.raw/*16.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*17.18*/messages("sign.in.totp")),format.raw/*17.42*/("""</legend>
        """),_display_(/*18.10*/helper/*18.16*/.form(action = controllers.routes.TotpController.submit())/*18.74*/ {_display_(Seq[Any](format.raw/*18.76*/("""
            """),_display_(/*19.14*/helper/*19.20*/.CSRF.formField),format.raw/*19.35*/("""
            """),_display_(/*20.14*/b4/*20.16*/.text(totpForm("verificationCode"), '_hiddenLabel -> messages("totp.verification.code"), 'placeholder -> messages("totp.verification.code"), 'autocomplete -> "off", 'class -> "form-control input-lg")),format.raw/*20.215*/("""
            """),_display_(/*21.14*/b4/*21.16*/.hidden(totpForm("userID"))),format.raw/*21.43*/("""
            """),_display_(/*22.14*/b4/*22.16*/.hidden(totpForm("sharedKey"))),format.raw/*22.46*/("""
            """),_display_(/*23.14*/b4/*23.16*/.hidden(totpForm("rememberMe"))),format.raw/*23.47*/("""
            """),format.raw/*24.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*26.112*/messages("totp.verify")),format.raw/*26.135*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*29.10*/("""

        """),_display_(/*31.10*/messages("totp.open.the.app.for.2fa")),format.raw/*31.47*/("""
        """),format.raw/*32.9*/("""<div>
            <p class="enter-recovery-code">"""),_display_(/*33.45*/messages("totp.dont.have.your.phone")),format.raw/*33.82*/(""" """),format.raw/*33.83*/("""<a href=""""),_display_(/*33.93*/controllers/*33.104*/.routes.TotpRecoveryController.view(UUID.fromString(totpForm("userID").value.get), totpForm("sharedKey").value.get, totpForm("rememberMe").value.get.toBoolean)),format.raw/*33.263*/("""">"""),_display_(/*33.266*/messages("totp.use.recovery.code")),format.raw/*33.300*/("""</a></p>
        </div>
    </fieldset>
""")))}),format.raw/*36.2*/("""
"""))
      }
    }
  }

  def render(totpForm:Form[Data],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(totpForm)(request,messages)

  def f:((Form[Data]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (totpForm) => (request,messages) => apply(totpForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 18 23:19:06 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/totp.scala.html
                  HASH: 7b241b1e70e324249ec03a05d1a5b95628f8b712
                  MATRIX: 28->1|61->29|98->61|139->97|182->135|221->169|255->198|292->230|362->260|740->322|903->402|936->426|1005->397|1037->464|1068->469|1108->500|1148->502|1181->508|1270->570|1315->594|1362->614|1377->620|1444->678|1484->680|1526->695|1541->701|1577->716|1619->731|1630->733|1851->932|1893->947|1904->949|1952->976|1994->991|2005->993|2056->1023|2098->1038|2109->1040|2161->1071|2203->1085|2391->1245|2436->1268|2531->1332|2571->1345|2629->1382|2666->1392|2744->1443|2802->1480|2831->1481|2868->1491|2889->1502|3070->1661|3101->1664|3157->1698|3231->1742
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|11->8|14->10|17->11|21->13|21->13|22->11|24->13|26->15|26->15|26->15|27->16|28->17|28->17|29->18|29->18|29->18|29->18|30->19|30->19|30->19|31->20|31->20|31->20|32->21|32->21|32->21|33->22|33->22|33->22|34->23|34->23|34->23|35->24|37->26|37->26|40->29|42->31|42->31|43->32|44->33|44->33|44->33|44->33|44->33|44->33|44->33|44->33|47->36
                  -- GENERATED --
              */
          