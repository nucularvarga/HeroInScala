
package views.txt.emails

/*1.2*/import play.api.i18n.Messages

object resetPassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with _root_.play.twirl.api.Template3[models.User,String,Messages,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: models.User, url: String)(implicit messages: Messages):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.63*/("""
"""),_display_(/*4.2*/messages("email.reset.password.hello", user.name.getOrElse("user"))),format.raw/*4.69*/("""

"""),_display_(/*6.2*/messages("email.reset.password.txt.text", url)),format.raw/*6.48*/("""
"""))
      }
    }
  }

  def render(user:models.User,url:String,messages:Messages): play.twirl.api.TxtFormat.Appendable = apply(user,url)(messages)

  def f:((models.User,String) => (Messages) => play.twirl.api.TxtFormat.Appendable) = (user,url) => (messages) => apply(user,url)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 18 23:19:05 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/emails/resetPassword.scala.txt
                  HASH: 630276eab8154099ec6b4c45c372c96cb7b7546f
                  MATRIX: 34->1|393->35|548->96|576->99|663->166|693->171|759->217
                  LINES: 4->1|9->3|14->3|15->4|15->4|17->6|17->6
                  -- GENERATED --
              */
          