
package views.html.emails

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.twirl.api.Html

object resetPassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.User,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(user: models.User, url: String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.63*/("""

"""),format.raw/*6.1*/("""<html>
    <body>
        <p>"""),_display_(/*8.13*/messages("email.reset.password.hello", user.name.getOrElse("user"))),format.raw/*8.80*/("""</p>
        <p>"""),_display_(/*9.13*/Html(messages("email.reset.password.html.text", url))),format.raw/*9.66*/("""</p>
    </body>
</html>
"""))
      }
    }
  }

  def render(user:models.User,url:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user,url)(messages)

  def f:((models.User,String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (user,url) => (messages) => apply(user,url)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 18 23:19:05 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/emails/resetPassword.scala.html
                  HASH: 24c8e82b81681f8ff7b5f9260a952110f9ea17f7
                  MATRIX: 35->1|72->33|432->64|588->125|618->129|676->161|763->228|807->246|880->299
                  LINES: 4->1|5->2|10->4|15->4|17->6|19->8|19->8|20->9|20->9
                  -- GENERATED --
              */
          