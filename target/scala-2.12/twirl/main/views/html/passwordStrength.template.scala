
package views.html

/*1.2*/import play.api.data.Field
/*2.2*/import play.api.i18n.MessagesProvider

object passwordStrength extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Field,Array[scala.Tuple2[Symbol, Any]],MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(field: Field, options: (Symbol, Any)*)(implicit messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*4.86*/("""

"""),format.raw/*6.64*/("""

"""),format.raw/*8.1*/("""<section>
  """),_display_(/*9.4*/b4/*9.6*/.password(field, (Symbol("data-pwd"), "true") +: options:_*)),format.raw/*9.66*/("""

  """),format.raw/*11.3*/("""<meter max="4" id="password-strength-meter"></meter>
  <p id="password-strength-text"></p>
</section>
"""))
      }
    }
  }

  def render(field:Field,options:Array[scala.Tuple2[Symbol, Any]],messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(field,options:_*)(messagesProvider)

  def f:((Field,Array[scala.Tuple2[Symbol, Any]]) => (MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (field,options) => (messagesProvider) => apply(field,options:_*)(messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 18 23:19:06 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/passwordStrength.scala.html
                  HASH: d5a38369c0abd474f8b7dd3ee4efcf27c24e27d1
                  MATRIX: 28->1|62->30|464->72|635->161|667->185|735->156|766->223|796->227|835->241|844->243|924->303|957->309
                  LINES: 4->1|5->2|10->4|14->6|14->6|15->4|17->6|19->8|20->9|20->9|20->9|22->11
                  -- GENERATED --
              */
          