
package views.html

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import org.webjars.play.WebJarsUtil
/*4.2*/import controllers.AssetsFinder
/*5.2*/import play.api.data._
/*6.2*/import forms.TotpSetupForm.Data
/*7.2*/import com.mohiva.play.silhouette.impl.providers.GoogleTotpCredentials
/*8.2*/import com.mohiva.play.silhouette.impl.providers.GoogleTotpInfo

/**/
class home @javax.inject.Inject() /*10.6*/()(implicit webJarsUtil: WebJarsUtil, assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[models.User,Option[GoogleTotpInfo],Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*11.2*/(user: models.User, totpInfoOpt: Option[GoogleTotpInfo], totpDataOpt: Option[(Form[Data], GoogleTotpCredentials)] = None)(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*13.2*/implicitFieldConstructor/*13.26*/ = {{
    b4.vertical.fieldConstructor()
}};
Seq[Any](format.raw/*11.176*/("""

"""),format.raw/*15.2*/("""

"""),_display_(/*17.2*/main(messages("home.title"), Some(user))/*17.42*/ {_display_(Seq[Any](format.raw/*17.44*/("""
    """),format.raw/*18.5*/("""<div class="user col-md-6 col-md-offset-3">
        <div class="row">
            <hr class="col-md-12" />
            <h4 class="col-md-8">"""),_display_(/*21.35*/messages("welcome.signed.in")),format.raw/*21.64*/("""</h4>
            <div class="col-md-4 text-right">
                <img src=""""),_display_(/*23.28*/user/*23.32*/.avatarURL.getOrElse(assets.path("images/silhouette.png"))),format.raw/*23.90*/("""" height="40px" />
            </div>
            <hr class="col-md-12" />
        </div>
        <div class="row data">
            <div class="col-md-12">
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*30.50*/messages("first.name")),format.raw/*30.72*/("""
                        """),format.raw/*31.25*/(""":</strong></p><p class="col-md-6">"""),_display_(/*31.60*/user/*31.64*/.firstName.getOrElse("None")),format.raw/*31.92*/("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*34.50*/messages("last.name")),format.raw/*34.71*/("""
                        """),format.raw/*35.25*/(""":</strong></p><p class="col-md-6">"""),_display_(/*35.60*/user/*35.64*/.lastName.getOrElse("None")),format.raw/*35.91*/("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*38.50*/messages("full.name")),format.raw/*38.71*/("""
                        """),format.raw/*39.25*/(""":</strong></p><p class="col-md-6">"""),_display_(/*39.60*/user/*39.64*/.fullName.getOrElse("None")),format.raw/*39.91*/("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*42.50*/messages("email")),format.raw/*42.67*/("""
                        """),format.raw/*43.25*/(""":</strong></p><p class="col-md-6">"""),_display_(/*43.60*/user/*43.64*/.email.getOrElse("None")),format.raw/*43.88*/("""</p>
                </div>
            </div>
        </div>
        <div class="row data">
        """),_display_(/*48.10*/if(totpInfoOpt.nonEmpty)/*48.34*/ {_display_(Seq[Any](format.raw/*48.36*/("""
            """),format.raw/*49.13*/("""<h2>"""),_display_(/*49.18*/messages("totp.enabled.title")),format.raw/*49.48*/("""</h2>
            <a href=""""),_display_(/*50.23*/controllers/*50.34*/.routes.TotpController.disableTotp),format.raw/*50.68*/("""">
                <input type="button" class="btn btn-primary" value='"""),_display_(/*51.70*/messages("totp.disable")),format.raw/*51.94*/("""'/>
            </a>
        """)))}/*53.11*/else/*53.16*/{_display_(Seq[Any](format.raw/*53.17*/("""
            """),_display_(/*54.14*/totpDataOpt/*54.25*/ match/*54.31*/ {/*55.17*/case Some((totpForm, credentials)) =>/*55.54*/ {_display_(Seq[Any](format.raw/*55.56*/("""
                    """),format.raw/*56.21*/("""<h2>"""),_display_(/*56.26*/messages("totp.enabling.title")),format.raw/*56.57*/("""</h2>
                    <h2>"""),_display_(/*57.26*/messages("totp.shared.key.title")),format.raw/*57.59*/("""</h2>
                    <img src=""""),_display_(/*58.32*/credentials/*58.43*/.qrUrl),format.raw/*58.49*/(""""/>
                    <h2>"""),_display_(/*59.26*/messages("totp.recovery.tokens.title")),format.raw/*59.64*/("""</h2>
                    <ul>
                    """),_display_(/*61.22*/for(scratchCodePlain <- credentials.scratchCodesPlain) yield /*61.76*/ {_display_(Seq[Any](format.raw/*61.78*/("""
                        """),format.raw/*62.25*/("""<li>"""),_display_(/*62.30*/{
                            scratchCodePlain
                        }),format.raw/*64.26*/("""</li>
                    """)))}),format.raw/*65.22*/("""
                    """),format.raw/*66.21*/("""</ul>
                    """),_display_(/*67.22*/helper/*67.28*/.form(action = controllers.routes.TotpController.enableTotpSubmit())/*67.96*/ {_display_(Seq[Any](format.raw/*67.98*/("""
                        """),_display_(/*68.26*/helper/*68.32*/.CSRF.formField),format.raw/*68.47*/("""
                        """),_display_(/*69.26*/b4/*69.28*/.text(totpForm("verificationCode"), '_hiddenLabel -> messages("totp.verification.code    "), 'placeholder -> messages("totp.verification.code"), 'autocomplete -> "off", 'class -> "form-control input-lg")),format.raw/*69.231*/("""
                        """),_display_(/*70.26*/b4/*70.28*/.hidden(totpForm("sharedKey"))),format.raw/*70.58*/("""
                        """),_display_(/*71.26*/helper/*71.32*/.repeat(totpForm("scratchCodes"), min = 1)/*71.74*/ { scratchCodeField =>_display_(Seq[Any](format.raw/*71.96*/("""
                            """),_display_(/*72.30*/b4/*72.32*/.hidden(scratchCodeField("hasher"))),format.raw/*72.67*/("""
                            """),_display_(/*73.30*/b4/*73.32*/.hidden(scratchCodeField("password"))),format.raw/*73.69*/("""
                            """),_display_(/*74.30*/b4/*74.32*/.hidden(scratchCodeField("salt"))),format.raw/*74.65*/("""
                        """)))}),format.raw/*75.26*/("""
                        """),format.raw/*76.25*/("""<div class="form-group">
                            <div>
                                <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*78.124*/messages("totp.verify")),format.raw/*78.147*/("""</button>
                            </div>
                        </div>
                    """)))}),format.raw/*81.22*/("""
                """)))}/*83.17*/case None =>/*83.29*/ {_display_(Seq[Any](format.raw/*83.31*/("""
                    """),format.raw/*84.21*/("""<h2>"""),_display_(/*84.26*/messages("totp.disabled.title")),format.raw/*84.57*/("""</h2>
                    <a href=""""),_display_(/*85.31*/controllers/*85.42*/.routes.TotpController.enableTotp),format.raw/*85.75*/("""">
                        <input type="button" class="btn btn-primary" value='"""),_display_(/*86.78*/messages("totp.enable")),format.raw/*86.101*/("""'/>
                    </a>
                """)))}}),format.raw/*89.14*/("""
        """)))}),format.raw/*90.10*/("""
        """),format.raw/*91.9*/("""</div>
    </div>
""")))}),format.raw/*93.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,totpInfoOpt:Option[GoogleTotpInfo],totpDataOpt:Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user,totpInfoOpt,totpDataOpt)(request,messages)

  def f:((models.User,Option[GoogleTotpInfo],Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (user,totpInfoOpt,totpDataOpt) => (request,messages) => apply(user,totpInfoOpt,totpDataOpt)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 18 23:19:06 CET 2020
                  SOURCE: C:/Users/Janko/IdeaProject/play-silhouette-seed/app/views/home.scala.html
                  HASH: 2d4b3ba778136ceb081af9e045db455f775cf629
                  MATRIX: 28->1|65->33|106->69|149->107|188->141|218->166|257->200|335->273|447->345|905->407|1167->586|1200->610|1276->581|1307->654|1338->659|1387->699|1427->701|1460->707|1631->851|1681->880|1789->961|1802->965|1881->1023|2155->1270|2198->1292|2252->1318|2314->1353|2327->1357|2376->1385|2517->1499|2559->1520|2613->1546|2675->1581|2688->1585|2736->1612|2877->1726|2919->1747|2973->1773|3035->1808|3048->1812|3096->1839|3237->1953|3275->1970|3329->1996|3391->2031|3404->2035|3449->2059|3583->2166|3616->2190|3656->2192|3698->2206|3730->2211|3781->2241|3837->2270|3857->2281|3912->2315|4012->2388|4057->2412|4108->2445|4121->2450|4160->2451|4202->2466|4222->2477|4237->2483|4248->2503|4294->2540|4334->2542|4384->2564|4416->2569|4468->2600|4527->2632|4581->2665|4646->2703|4666->2714|4693->2720|4750->2750|4809->2788|4890->2842|4960->2896|5000->2898|5054->2924|5086->2929|5181->3003|5240->3031|5290->3053|5345->3081|5360->3087|5437->3155|5477->3157|5531->3184|5546->3190|5582->3205|5636->3232|5647->3234|5872->3437|5926->3464|5937->3466|5988->3496|6042->3523|6057->3529|6108->3571|6168->3593|6226->3624|6237->3626|6293->3661|6351->3692|6362->3694|6420->3731|6478->3762|6489->3764|6543->3797|6601->3824|6655->3850|6867->4034|6912->4057|7043->4157|7081->4194|7102->4206|7142->4208|7192->4230|7224->4235|7276->4266|7340->4303|7360->4314|7414->4347|7522->4428|7567->4451|7647->4514|7689->4525|7726->4535|7777->4556
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|11->8|14->10|17->11|21->13|21->13|24->11|26->15|28->17|28->17|28->17|29->18|32->21|32->21|34->23|34->23|34->23|41->30|41->30|42->31|42->31|42->31|42->31|45->34|45->34|46->35|46->35|46->35|46->35|49->38|49->38|50->39|50->39|50->39|50->39|53->42|53->42|54->43|54->43|54->43|54->43|59->48|59->48|59->48|60->49|60->49|60->49|61->50|61->50|61->50|62->51|62->51|64->53|64->53|64->53|65->54|65->54|65->54|65->55|65->55|65->55|66->56|66->56|66->56|67->57|67->57|68->58|68->58|68->58|69->59|69->59|71->61|71->61|71->61|72->62|72->62|74->64|75->65|76->66|77->67|77->67|77->67|77->67|78->68|78->68|78->68|79->69|79->69|79->69|80->70|80->70|80->70|81->71|81->71|81->71|81->71|82->72|82->72|82->72|83->73|83->73|83->73|84->74|84->74|84->74|85->75|86->76|88->78|88->78|91->81|92->83|92->83|92->83|93->84|93->84|93->84|94->85|94->85|94->85|95->86|95->86|97->89|98->90|99->91|101->93
                  -- GENERATED --
              */
          