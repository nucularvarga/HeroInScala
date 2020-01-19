
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import java.util.UUID

/**/
class resetPassword @javax.inject.Inject() /*8.6*/()(implicit webJarsUtil: WebJarsUtil, assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[String],UUID,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(form: Form[String], token: UUID)(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.88*/("""

"""),_display_(/*11.2*/main(messages("reset.password.title"))/*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""
    """),format.raw/*12.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*13.18*/messages("reset.password")),format.raw/*13.44*/("""</legend>
        """),_display_(/*14.10*/helper/*14.16*/.form(action = controllers.routes.ResetPasswordController.submit(token), 'autocomplete -> "off")/*14.112*/ {_display_(Seq[Any](format.raw/*14.114*/("""
            """),format.raw/*15.13*/("""<p class="info">"""),_display_(/*15.30*/messages("strong.password.info")),format.raw/*15.62*/("""</p>
            """),_display_(/*16.14*/helper/*16.20*/.CSRF.formField),format.raw/*16.35*/("""
            """),_display_(/*17.14*/passwordStrength(form("password"), '_hiddenLabel -> messages("password"), 'placeholder -> messages("password"), 'class -> "form-control input-lg")),format.raw/*17.160*/("""
            """),format.raw/*18.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*20.112*/messages("reset")),format.raw/*20.129*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*23.10*/("""
    """),format.raw/*24.5*/("""</fieldset>
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(form:Form[String],token:UUID,request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(form,token)(request,messages)

  def f:((Form[String],UUID) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (form,token) => (request,messages) => apply(form,token)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 18 23:19:06 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/resetPassword.scala.html
                  HASH: 79f59c97e2e9dad688fc4308ceb913687ea85809
                  MATRIX: 28->1|61->29|98->61|139->97|182->135|221->169|299->199|683->261|864->347|895->352|942->390|982->392|1015->398|1104->460|1151->486|1198->506|1213->512|1319->608|1360->610|1402->624|1446->641|1499->673|1545->692|1560->698|1596->713|1638->728|1806->874|1848->888|2036->1048|2075->1065|2170->1129|2203->1135|2247->1149
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|12->8|15->9|20->9|22->11|22->11|22->11|23->12|24->13|24->13|25->14|25->14|25->14|25->14|26->15|26->15|26->15|27->16|27->16|27->16|28->17|28->17|29->18|31->20|31->20|34->23|35->24|36->25
                  -- GENERATED --
              */
          