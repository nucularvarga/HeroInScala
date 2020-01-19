
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import b4.inline.fieldConstructor

/**/
class changePassword @javax.inject.Inject() /*8.6*/()(implicit webJarsUtil: WebJarsUtil, assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[scala.Tuple2[String, String]],models.User,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(changePasswordForm: Form[(String, String)], user: models.User)(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*11.2*/implicitFieldConstructor/*11.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*9.118*/("""

"""),format.raw/*11.64*/("""

"""),_display_(/*13.2*/main(messages("change.password.title"), Some(user))/*13.53*/ {_display_(Seq[Any](format.raw/*13.55*/("""
    """),format.raw/*14.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*15.18*/messages("change.password")),format.raw/*15.45*/("""</legend>
        """),_display_(/*16.10*/helper/*16.16*/.form(action = controllers.routes.ChangePasswordController.submit, 'autocomplete -> "off")/*16.106*/ {_display_(Seq[Any](format.raw/*16.108*/("""
            """),format.raw/*17.13*/("""<p class="info">"""),_display_(/*17.30*/messages("strong.password.info")),format.raw/*17.62*/("""</p>
            """),_display_(/*18.14*/helper/*18.20*/.CSRF.formField),format.raw/*18.35*/("""
            """),_display_(/*19.14*/b4/*19.16*/.password(changePasswordForm("current-password"), '_hiddenLabel -> messages("current.password"), 'placeholder -> messages("current.password"), 'class -> "form-control input-lg")),format.raw/*19.193*/("""
            """),_display_(/*20.14*/passwordStrength(changePasswordForm("new-password"), '_hiddenLabel -> messages("new.password"), 'placeholder -> messages("new.password"), 'class -> "form-control input-lg")),format.raw/*20.186*/("""
            """),format.raw/*21.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*23.112*/messages("change")),format.raw/*23.130*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*26.10*/("""
    """),format.raw/*27.5*/("""</fieldset>
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(changePasswordForm:Form[scala.Tuple2[String, String]],user:models.User,request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(changePasswordForm,user)(request,messages)

  def f:((Form[scala.Tuple2[String, String]],models.User) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (changePasswordForm,user) => (request,messages) => apply(changePasswordForm,user)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 18 23:19:05 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/changePassword.scala.html
                  HASH: eace75ab4211d0e3f4509b011f4d29cabf59e8e0
                  MATRIX: 28->1|61->29|98->61|139->97|182->135|221->169|312->211|725->273|929->394|962->418|1031->389|1063->456|1094->461|1154->512|1194->514|1227->520|1316->582|1364->609|1411->629|1426->635|1526->725|1567->727|1609->741|1653->758|1706->790|1752->809|1767->815|1803->830|1845->845|1856->847|2055->1024|2097->1039|2291->1211|2333->1225|2521->1385|2561->1403|2656->1467|2689->1473|2733->1487
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|12->8|15->9|19->11|19->11|20->9|22->11|24->13|24->13|24->13|25->14|26->15|26->15|27->16|27->16|27->16|27->16|28->17|28->17|28->17|29->18|29->18|29->18|30->19|30->19|30->19|31->20|31->20|32->21|34->23|34->23|37->26|38->27|39->28
                  -- GENERATED --
              */
          