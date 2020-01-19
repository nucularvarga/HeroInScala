
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import forms.SignUpForm.Data

/**/
class signUp @javax.inject.Inject() /*8.6*/()(implicit webJarsUtil: WebJarsUtil, assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Data],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(signUpForm: Form[Data])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*11.2*/implicitFieldConstructor/*11.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*9.79*/("""

"""),format.raw/*11.64*/("""

"""),_display_(/*13.2*/main(messages("sign.up.title"))/*13.33*/ {_display_(Seq[Any](format.raw/*13.35*/("""
    """),format.raw/*14.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*15.18*/messages("sign.up.account")),format.raw/*15.45*/("""</legend>
        """),_display_(/*16.10*/helper/*16.16*/.form(action = controllers.routes.SignUpController.submit())/*16.76*/ {_display_(Seq[Any](format.raw/*16.78*/("""
            """),_display_(/*17.14*/helper/*17.20*/.CSRF.formField),format.raw/*17.35*/("""
            """),_display_(/*18.14*/b4/*18.16*/.text(signUpForm("firstName"), '_hiddenLabel -> messages("first.name"), 'placeholder -> messages("first.name"), 'class -> "form-control input-lg")),format.raw/*18.162*/("""
            """),_display_(/*19.14*/b4/*19.16*/.text(signUpForm("lastName"), '_hiddenLabel -> messages("last.name"), 'placeholder -> messages("last.name"), 'class -> "form-control input-lg")),format.raw/*19.159*/("""
            """),_display_(/*20.14*/b4/*20.16*/.text(signUpForm("email"), '_hiddenLabel -> messages("email"), 'placeholder -> messages("email"), 'class -> "form-control input-lg")),format.raw/*20.148*/("""
            """),_display_(/*21.14*/passwordStrength(signUpForm("password"), '_hiddenLabel -> messages("password"), 'placeholder -> messages("password"), 'class -> "form-control input-lg")),format.raw/*21.166*/("""
            """),format.raw/*22.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*24.112*/messages("sign.up")),format.raw/*24.131*/("""</button>
                </div>
            </div>
            <div class="sign-in-now">
                <p>"""),_display_(/*28.21*/messages("already.a.member")),format.raw/*28.49*/(""" """),format.raw/*28.50*/("""<a href=""""),_display_(/*28.60*/controllers/*28.71*/.routes.SignInController.view),format.raw/*28.100*/("""">"""),_display_(/*28.103*/messages("sign.in.now")),format.raw/*28.126*/("""</a></p>
            </div>
        """)))}),format.raw/*30.10*/("""
    """),format.raw/*31.5*/("""</fieldset>
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(signUpForm:Form[Data],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(signUpForm)(request,messages)

  def f:((Form[Data]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (signUpForm) => (request,messages) => apply(signUpForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 18 23:19:06 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/signUp.scala.html
                  HASH: 4dcdb10ffb67daf93fb2bd7c608a35ab9ac10742
                  MATRIX: 28->1|61->29|98->61|139->97|182->135|221->169|299->206|676->268|841->350|874->374|942->345|974->412|1005->417|1045->448|1085->450|1118->456|1207->518|1255->545|1302->565|1317->571|1386->631|1426->633|1468->648|1483->654|1519->669|1561->684|1572->686|1740->832|1782->847|1793->849|1958->992|2000->1007|2011->1009|2165->1141|2207->1156|2381->1308|2423->1322|2611->1482|2652->1501|2793->1615|2842->1643|2871->1644|2908->1654|2928->1665|2979->1694|3010->1697|3055->1720|3125->1759|3158->1765|3202->1779
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|12->8|15->9|19->11|19->11|20->9|22->11|24->13|24->13|24->13|25->14|26->15|26->15|27->16|27->16|27->16|27->16|28->17|28->17|28->17|29->18|29->18|29->18|30->19|30->19|30->19|31->20|31->20|31->20|32->21|32->21|33->22|35->24|35->24|39->28|39->28|39->28|39->28|39->28|39->28|39->28|39->28|41->30|42->31|43->32
                  -- GENERATED --
              */
          