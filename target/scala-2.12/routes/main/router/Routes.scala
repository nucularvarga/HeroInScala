// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Janko/IdeaProject/play-silhouette-seed/conf/routes
// @DATE:Sun Jan 19 11:01:08 CET 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:10
  HeroesInScala_11: controllers.HeroesInScala,
  // @LINE:35
  Assets_10: controllers.Assets,
  // @LINE:43
  ApplicationController_7: controllers.ApplicationController,
  // @LINE:45
  SocialAuthController_0: controllers.SocialAuthController,
  // @LINE:47
  SignUpController_8: controllers.SignUpController,
  // @LINE:50
  SignInController_1: controllers.SignInController,
  // @LINE:53
  TotpController_2: controllers.TotpController,
  // @LINE:59
  TotpRecoveryController_6: controllers.TotpRecoveryController,
  // @LINE:62
  ForgotPasswordController_4: controllers.ForgotPasswordController,
  // @LINE:64
  ResetPasswordController_5: controllers.ResetPasswordController,
  // @LINE:66
  ChangePasswordController_3: controllers.ChangePasswordController,
  // @LINE:69
  ActivateAccountController_9: controllers.ActivateAccountController,
  // @LINE:74
  webjars_Routes_0: webjars.Routes,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:10
    HeroesInScala_11: controllers.HeroesInScala,
    // @LINE:35
    Assets_10: controllers.Assets,
    // @LINE:43
    ApplicationController_7: controllers.ApplicationController,
    // @LINE:45
    SocialAuthController_0: controllers.SocialAuthController,
    // @LINE:47
    SignUpController_8: controllers.SignUpController,
    // @LINE:50
    SignInController_1: controllers.SignInController,
    // @LINE:53
    TotpController_2: controllers.TotpController,
    // @LINE:59
    TotpRecoveryController_6: controllers.TotpRecoveryController,
    // @LINE:62
    ForgotPasswordController_4: controllers.ForgotPasswordController,
    // @LINE:64
    ResetPasswordController_5: controllers.ResetPasswordController,
    // @LINE:66
    ChangePasswordController_3: controllers.ChangePasswordController,
    // @LINE:69
    ActivateAccountController_9: controllers.ActivateAccountController,
    // @LINE:74
    webjars_Routes_0: webjars.Routes
  ) = this(errorHandler, HeroesInScala_11, Assets_10, ApplicationController_7, SocialAuthController_0, SignUpController_8, SignInController_1, TotpController_2, TotpRecoveryController_6, ForgotPasswordController_4, ResetPasswordController_5, ChangePasswordController_3, ActivateAccountController_9, webjars_Routes_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HeroesInScala_11, Assets_10, ApplicationController_7, SocialAuthController_0, SignUpController_8, SignInController_1, TotpController_2, TotpRecoveryController_6, ForgotPasswordController_4, ResetPasswordController_5, ChangePasswordController_3, ActivateAccountController_9, webjars_Routes_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HeroesInScala.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """command""", """controllers.HeroesInScala.command(cmd:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """json""", """controllers.HeroesInScala.getjson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service-worker.js""", """controllers.Assets.at(path:String = "/public", file:String = "javascripts/service-worker.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manifest.json""", """controllers.Assets.at(path:String = "/public", file:String = "manifest.json")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sw.js""", """controllers.Assets.at(path:String = "/public", file:String = "javascripts/sw.js")"""),
    ("""GET""", this.prefix, """controllers.ApplicationController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signOut""", """controllers.ApplicationController.signOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/""" + "$" + """provider<[^/]+>""", """controllers.SocialAuthController.authenticate(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.SignUpController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.SignUpController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """totp""", """controllers.TotpController.view(userId:java.util.UUID, sharedKey:String, rememberMe:Boolean)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """enableTotp""", """controllers.TotpController.enableTotp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """disableTotp""", """controllers.TotpController.disableTotp"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """totpSubmit""", """controllers.TotpController.submit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """enableTotpSubmit""", """controllers.TotpController.enableTotpSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """totpRecovery""", """controllers.TotpRecoveryController.view(userID:java.util.UUID, sharedKey:String, rememberMe:Boolean)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """totpRecoverySubmit""", """controllers.TotpRecoveryController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/forgot""", """controllers.ForgotPasswordController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/forgot""", """controllers.ForgotPasswordController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/reset/""" + "$" + """token<[^/]+>""", """controllers.ResetPasswordController.view(token:java.util.UUID)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/reset/""" + "$" + """token<[^/]+>""", """controllers.ResetPasswordController.submit(token:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/change""", """controllers.ChangePasswordController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/change""", """controllers.ChangePasswordController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/email/""" + "$" + """email<[^/]+>""", """controllers.ActivateAccountController.send(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/activate/""" + "$" + """token<[^/]+>""", """controllers.ActivateAccountController.activate(token:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    prefixed_webjars_Routes_0_29.router.documentation,
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_HeroesInScala_about0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HeroesInScala_about0_invoker = createInvoker(
    HeroesInScala_11.about,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HeroesInScala",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HeroesInScala_command1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("command")))
  )
  private[this] lazy val controllers_HeroesInScala_command1_invoker = createInvoker(
    HeroesInScala_11.command(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HeroesInScala",
      "command",
      Seq(classOf[String]),
      "GET",
      this.prefix + """command""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HeroesInScala_getjson2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("json")))
  )
  private[this] lazy val controllers_HeroesInScala_getjson2_invoker = createInvoker(
    HeroesInScala_11.getjson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HeroesInScala",
      "getjson",
      Nil,
      "GET",
      this.prefix + """json""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Assets_at3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service-worker.js")))
  )
  private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
    Assets_10.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """service-worker.js""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Assets_at4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manifest.json")))
  )
  private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
    Assets_10.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """manifest.json""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Assets_at5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sw.js")))
  )
  private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
    Assets_10.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """sw.js""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_ApplicationController_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ApplicationController_index6_invoker = createInvoker(
    ApplicationController_7.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_ApplicationController_signOut7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signOut")))
  )
  private[this] lazy val controllers_ApplicationController_signOut7_invoker = createInvoker(
    ApplicationController_7.signOut,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signOut",
      Nil,
      "GET",
      this.prefix + """signOut""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_SocialAuthController_authenticate8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SocialAuthController_authenticate8_invoker = createInvoker(
    SocialAuthController_0.authenticate(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "authenticate",
      Seq(classOf[String]),
      "GET",
      this.prefix + """authenticate/""" + "$" + """provider<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_SignUpController_view9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_view9_invoker = createInvoker(
    SignUpController_8.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "view",
      Nil,
      "GET",
      this.prefix + """signUp""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_SignUpController_submit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_submit10_invoker = createInvoker(
    SignUpController_8.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "submit",
      Nil,
      "POST",
      this.prefix + """signUp""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_SignInController_view11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_view11_invoker = createInvoker(
    SignInController_1.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "view",
      Nil,
      "GET",
      this.prefix + """signIn""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_SignInController_submit12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_submit12_invoker = createInvoker(
    SignInController_1.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "submit",
      Nil,
      "POST",
      this.prefix + """signIn""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_TotpController_view13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("totp")))
  )
  private[this] lazy val controllers_TotpController_view13_invoker = createInvoker(
    TotpController_2.view(fakeValue[java.util.UUID], fakeValue[String], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpController",
      "view",
      Seq(classOf[java.util.UUID], classOf[String], classOf[Boolean]),
      "GET",
      this.prefix + """totp""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_TotpController_enableTotp14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("enableTotp")))
  )
  private[this] lazy val controllers_TotpController_enableTotp14_invoker = createInvoker(
    TotpController_2.enableTotp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpController",
      "enableTotp",
      Nil,
      "GET",
      this.prefix + """enableTotp""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_TotpController_disableTotp15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("disableTotp")))
  )
  private[this] lazy val controllers_TotpController_disableTotp15_invoker = createInvoker(
    TotpController_2.disableTotp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpController",
      "disableTotp",
      Nil,
      "GET",
      this.prefix + """disableTotp""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_TotpController_submit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("totpSubmit")))
  )
  private[this] lazy val controllers_TotpController_submit16_invoker = createInvoker(
    TotpController_2.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpController",
      "submit",
      Nil,
      "POST",
      this.prefix + """totpSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_TotpController_enableTotpSubmit17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("enableTotpSubmit")))
  )
  private[this] lazy val controllers_TotpController_enableTotpSubmit17_invoker = createInvoker(
    TotpController_2.enableTotpSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpController",
      "enableTotpSubmit",
      Nil,
      "POST",
      this.prefix + """enableTotpSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_TotpRecoveryController_view18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("totpRecovery")))
  )
  private[this] lazy val controllers_TotpRecoveryController_view18_invoker = createInvoker(
    TotpRecoveryController_6.view(fakeValue[java.util.UUID], fakeValue[String], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpRecoveryController",
      "view",
      Seq(classOf[java.util.UUID], classOf[String], classOf[Boolean]),
      "GET",
      this.prefix + """totpRecovery""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_TotpRecoveryController_submit19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("totpRecoverySubmit")))
  )
  private[this] lazy val controllers_TotpRecoveryController_submit19_invoker = createInvoker(
    TotpRecoveryController_6.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpRecoveryController",
      "submit",
      Nil,
      "POST",
      this.prefix + """totpRecoverySubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_ForgotPasswordController_view20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/forgot")))
  )
  private[this] lazy val controllers_ForgotPasswordController_view20_invoker = createInvoker(
    ForgotPasswordController_4.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ForgotPasswordController",
      "view",
      Nil,
      "GET",
      this.prefix + """password/forgot""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_ForgotPasswordController_submit21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/forgot")))
  )
  private[this] lazy val controllers_ForgotPasswordController_submit21_invoker = createInvoker(
    ForgotPasswordController_4.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ForgotPasswordController",
      "submit",
      Nil,
      "POST",
      this.prefix + """password/forgot""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_ResetPasswordController_view22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ResetPasswordController_view22_invoker = createInvoker(
    ResetPasswordController_5.view(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ResetPasswordController",
      "view",
      Seq(classOf[java.util.UUID]),
      "GET",
      this.prefix + """password/reset/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_ResetPasswordController_submit23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ResetPasswordController_submit23_invoker = createInvoker(
    ResetPasswordController_5.submit(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ResetPasswordController",
      "submit",
      Seq(classOf[java.util.UUID]),
      "POST",
      this.prefix + """password/reset/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_ChangePasswordController_view24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/change")))
  )
  private[this] lazy val controllers_ChangePasswordController_view24_invoker = createInvoker(
    ChangePasswordController_3.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChangePasswordController",
      "view",
      Nil,
      "GET",
      this.prefix + """password/change""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_ChangePasswordController_submit25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/change")))
  )
  private[this] lazy val controllers_ChangePasswordController_submit25_invoker = createInvoker(
    ChangePasswordController_3.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChangePasswordController",
      "submit",
      Nil,
      "POST",
      this.prefix + """password/change""",
      """""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_ActivateAccountController_send26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/email/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActivateAccountController_send26_invoker = createInvoker(
    ActivateAccountController_9.send(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivateAccountController",
      "send",
      Seq(classOf[String]),
      "GET",
      this.prefix + """account/email/""" + "$" + """email<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:70
  private[this] lazy val controllers_ActivateAccountController_activate27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/activate/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActivateAccountController_activate27_invoker = createInvoker(
    ActivateAccountController_9.activate(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivateAccountController",
      "activate",
      Seq(classOf[java.util.UUID]),
      "GET",
      this.prefix + """account/activate/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_Assets_versioned28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned28_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:74
  private[this] val prefixed_webjars_Routes_0_29 = Include(webjars_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "webjars"))


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:10
    case controllers_HeroesInScala_about0_route(params@_) =>
      call { 
        controllers_HeroesInScala_about0_invoker.call(HeroesInScala_11.about)
      }
  
    // @LINE:12
    case controllers_HeroesInScala_command1_route(params@_) =>
      call(params.fromQuery[String]("cmd", None)) { (cmd) =>
        controllers_HeroesInScala_command1_invoker.call(HeroesInScala_11.command(cmd))
      }
  
    // @LINE:14
    case controllers_HeroesInScala_getjson2_route(params@_) =>
      call { 
        controllers_HeroesInScala_getjson2_invoker.call(HeroesInScala_11.getjson)
      }
  
    // @LINE:35
    case controllers_Assets_at3_route(params@_) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("javascripts/service-worker.js"))) { (path, file) =>
        controllers_Assets_at3_invoker.call(Assets_10.at(path, file))
      }
  
    // @LINE:36
    case controllers_Assets_at4_route(params@_) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("manifest.json"))) { (path, file) =>
        controllers_Assets_at4_invoker.call(Assets_10.at(path, file))
      }
  
    // @LINE:37
    case controllers_Assets_at5_route(params@_) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("javascripts/sw.js"))) { (path, file) =>
        controllers_Assets_at5_invoker.call(Assets_10.at(path, file))
      }
  
    // @LINE:43
    case controllers_ApplicationController_index6_route(params@_) =>
      call { 
        controllers_ApplicationController_index6_invoker.call(ApplicationController_7.index)
      }
  
    // @LINE:44
    case controllers_ApplicationController_signOut7_route(params@_) =>
      call { 
        controllers_ApplicationController_signOut7_invoker.call(ApplicationController_7.signOut)
      }
  
    // @LINE:45
    case controllers_SocialAuthController_authenticate8_route(params@_) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_SocialAuthController_authenticate8_invoker.call(SocialAuthController_0.authenticate(provider))
      }
  
    // @LINE:47
    case controllers_SignUpController_view9_route(params@_) =>
      call { 
        controllers_SignUpController_view9_invoker.call(SignUpController_8.view)
      }
  
    // @LINE:48
    case controllers_SignUpController_submit10_route(params@_) =>
      call { 
        controllers_SignUpController_submit10_invoker.call(SignUpController_8.submit)
      }
  
    // @LINE:50
    case controllers_SignInController_view11_route(params@_) =>
      call { 
        controllers_SignInController_view11_invoker.call(SignInController_1.view)
      }
  
    // @LINE:51
    case controllers_SignInController_submit12_route(params@_) =>
      call { 
        controllers_SignInController_submit12_invoker.call(SignInController_1.submit)
      }
  
    // @LINE:53
    case controllers_TotpController_view13_route(params@_) =>
      call(params.fromQuery[java.util.UUID]("userId", None), params.fromQuery[String]("sharedKey", None), params.fromQuery[Boolean]("rememberMe", None)) { (userId, sharedKey, rememberMe) =>
        controllers_TotpController_view13_invoker.call(TotpController_2.view(userId, sharedKey, rememberMe))
      }
  
    // @LINE:54
    case controllers_TotpController_enableTotp14_route(params@_) =>
      call { 
        controllers_TotpController_enableTotp14_invoker.call(TotpController_2.enableTotp)
      }
  
    // @LINE:55
    case controllers_TotpController_disableTotp15_route(params@_) =>
      call { 
        controllers_TotpController_disableTotp15_invoker.call(TotpController_2.disableTotp)
      }
  
    // @LINE:56
    case controllers_TotpController_submit16_route(params@_) =>
      call { 
        controllers_TotpController_submit16_invoker.call(TotpController_2.submit)
      }
  
    // @LINE:57
    case controllers_TotpController_enableTotpSubmit17_route(params@_) =>
      call { 
        controllers_TotpController_enableTotpSubmit17_invoker.call(TotpController_2.enableTotpSubmit)
      }
  
    // @LINE:59
    case controllers_TotpRecoveryController_view18_route(params@_) =>
      call(params.fromQuery[java.util.UUID]("userID", None), params.fromQuery[String]("sharedKey", None), params.fromQuery[Boolean]("rememberMe", None)) { (userID, sharedKey, rememberMe) =>
        controllers_TotpRecoveryController_view18_invoker.call(TotpRecoveryController_6.view(userID, sharedKey, rememberMe))
      }
  
    // @LINE:60
    case controllers_TotpRecoveryController_submit19_route(params@_) =>
      call { 
        controllers_TotpRecoveryController_submit19_invoker.call(TotpRecoveryController_6.submit)
      }
  
    // @LINE:62
    case controllers_ForgotPasswordController_view20_route(params@_) =>
      call { 
        controllers_ForgotPasswordController_view20_invoker.call(ForgotPasswordController_4.view)
      }
  
    // @LINE:63
    case controllers_ForgotPasswordController_submit21_route(params@_) =>
      call { 
        controllers_ForgotPasswordController_submit21_invoker.call(ForgotPasswordController_4.submit)
      }
  
    // @LINE:64
    case controllers_ResetPasswordController_view22_route(params@_) =>
      call(params.fromPath[java.util.UUID]("token", None)) { (token) =>
        controllers_ResetPasswordController_view22_invoker.call(ResetPasswordController_5.view(token))
      }
  
    // @LINE:65
    case controllers_ResetPasswordController_submit23_route(params@_) =>
      call(params.fromPath[java.util.UUID]("token", None)) { (token) =>
        controllers_ResetPasswordController_submit23_invoker.call(ResetPasswordController_5.submit(token))
      }
  
    // @LINE:66
    case controllers_ChangePasswordController_view24_route(params@_) =>
      call { 
        controllers_ChangePasswordController_view24_invoker.call(ChangePasswordController_3.view)
      }
  
    // @LINE:67
    case controllers_ChangePasswordController_submit25_route(params@_) =>
      call { 
        controllers_ChangePasswordController_submit25_invoker.call(ChangePasswordController_3.submit)
      }
  
    // @LINE:69
    case controllers_ActivateAccountController_send26_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_ActivateAccountController_send26_invoker.call(ActivateAccountController_9.send(email))
      }
  
    // @LINE:70
    case controllers_ActivateAccountController_activate27_route(params@_) =>
      call(params.fromPath[java.util.UUID]("token", None)) { (token) =>
        controllers_ActivateAccountController_activate27_invoker.call(ActivateAccountController_9.activate(token))
      }
  
    // @LINE:73
    case controllers_Assets_versioned28_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned28_invoker.call(Assets_10.versioned(file))
      }
  
    // @LINE:74
    case prefixed_webjars_Routes_0_29(handler) => handler
  }
}
