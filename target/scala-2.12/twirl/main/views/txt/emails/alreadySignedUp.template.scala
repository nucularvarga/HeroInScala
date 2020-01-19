
package views.txt.emails

/*1.2*/import play.api.i18n.Messages

object alreadySignedUp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with _root_.play.twirl.api.Template3[models.User,String,Messages,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: models.User, url: String)(implicit messages: Messages):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.63*/("""
"""),_display_(/*4.2*/messages("email.already.signed.up.hello", user.name.getOrElse("user"))),format.raw/*4.72*/("""

"""),_display_(/*6.2*/messages("email.already.signed.up.txt.text", url)),format.raw/*6.51*/("""
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
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/emails/alreadySignedUp.scala.txt
                  HASH: b5b93a160996b65e688b415695df7eb4fcc7afc9
                  MATRIX: 34->1|395->35|550->96|578->99|668->169|698->174|767->223
                  LINES: 4->1|9->3|14->3|15->4|15->4|17->6|17->6
                  -- GENERATED --
              */
          