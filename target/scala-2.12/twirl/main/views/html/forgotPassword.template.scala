
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder

/**/
class forgotPassword @javax.inject.Inject() /*7.6*/()(implicit webJarsUtil: WebJarsUtil, assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[String],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(forgotPasswordForm: Form[String])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*10.2*/implicitFieldConstructor/*10.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*8.89*/("""

"""),format.raw/*10.64*/("""

"""),_display_(/*12.2*/main(messages("forgot.password.title"))/*12.41*/ {_display_(Seq[Any](format.raw/*12.43*/("""
    """),format.raw/*13.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*14.18*/messages("forgot.password")),format.raw/*14.45*/("""</legend>
        """),_display_(/*15.10*/helper/*15.16*/.form(action = controllers.routes.ForgotPasswordController.submit(), 'autocomplete -> "off")/*15.108*/ {_display_(Seq[Any](format.raw/*15.110*/("""
            """),format.raw/*16.13*/("""<p class="info">"""),_display_(/*16.30*/messages("forgot.password.info")),format.raw/*16.62*/("""</p>
            """),_display_(/*17.14*/helper/*17.20*/.CSRF.formField),format.raw/*17.35*/("""
            """),_display_(/*18.14*/b4/*18.16*/.text(forgotPasswordForm("email"), '_hiddenLabel -> messages("email"), 'placeholder -> messages("email"), 'class -> "form-control input-lg")),format.raw/*18.156*/("""
            """),format.raw/*19.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*21.112*/messages("send")),format.raw/*21.128*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*24.10*/("""
    """),format.raw/*25.5*/("""</fieldset>
""")))}),format.raw/*26.2*/("""
"""))
      }
    }
  }

  def render(forgotPasswordForm:Form[String],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(forgotPasswordForm)(request,messages)

  def f:((Form[String]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (forgotPasswordForm) => (request,messages) => apply(forgotPasswordForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 18 23:19:06 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/forgotPassword.scala.html
                  HASH: d8af5c6ee46c882b2811c658e33e51166f87cfb9
                  MATRIX: 28->1|61->29|98->61|139->97|182->135|271->175|650->237|825->329|858->353|926->324|958->391|989->396|1037->435|1077->437|1110->443|1199->505|1247->532|1294->552|1309->558|1411->650|1452->652|1494->666|1538->683|1591->715|1637->734|1652->740|1688->755|1730->770|1741->772|1903->912|1945->926|2133->1086|2171->1102|2266->1166|2299->1172|2343->1186
                  LINES: 4->1|5->2|6->3|7->4|8->5|11->7|14->8|18->10|18->10|19->8|21->10|23->12|23->12|23->12|24->13|25->14|25->14|26->15|26->15|26->15|26->15|27->16|27->16|27->16|28->17|28->17|28->17|29->18|29->18|29->18|30->19|32->21|32->21|35->24|36->25|37->26
                  -- GENERATED --
              */
          