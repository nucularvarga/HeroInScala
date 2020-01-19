
package views.html

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import play.twirl.api.Html
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder

/**/
class activateAccount @javax.inject.Inject() /*7.6*/()(implicit webJarsUtil: WebJarsUtil, assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(email: String)(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.70*/("""

"""),_display_(/*10.2*/main(messages("activate.account.title"))/*10.42*/ {_display_(Seq[Any](format.raw/*10.44*/("""
    """),format.raw/*11.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*12.18*/messages("activate.account")),format.raw/*12.46*/("""</legend>
        <div class="info">
            <p>"""),_display_(/*14.17*/messages("activate.account.text1")),format.raw/*14.51*/("""</p>
            <p><b>"""),_display_(/*15.20*/email),format.raw/*15.25*/("""</b></p>
            <p>"""),_display_(/*16.17*/messages("activate.account.text2")),format.raw/*16.51*/("""</p>
            <p>"""),_display_(/*17.17*/Html(messages("activate.account.text3", controllers.routes.ActivateAccountController.send(helper.urlEncode(email))))),format.raw/*17.133*/("""</p>
        </div>
    </fieldset>
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(email:String,request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(email)(request,messages)

  def f:((String) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (email) => (request,messages) => apply(email)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 18 23:19:04 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/activateAccount.scala.html
                  HASH: f687e5b6c6aee512e457cdb7e3eb0717e4f50f5a
                  MATRIX: 28->1|65->33|106->69|140->98|183->136|273->176|646->238|809->306|840->311|889->351|929->353|962->359|1051->421|1100->449|1182->504|1237->538|1289->563|1315->568|1368->594|1423->628|1472->650|1610->766|1680->806
                  LINES: 4->1|5->2|6->3|7->4|8->5|11->7|14->8|19->8|21->10|21->10|21->10|22->11|23->12|23->12|25->14|25->14|26->15|26->15|27->16|27->16|28->17|28->17|31->20
                  -- GENERATED --
              */
          