// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Janko/IdeaProject/play-silhouette-seed/conf/routes
// @DATE:Sun Jan 19 11:01:08 CET 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

// @LINE:10
package controllers {

  // @LINE:35
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def at(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:35
        case (file) if file == "javascripts/service-worker.js" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "javascripts/service-worker.js"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "service-worker.js")
      
        // @LINE:36
        case (file) if file == "manifest.json" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "manifest.json"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "manifest.json")
      
        // @LINE:37
        case (file) if file == "javascripts/sw.js" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "javascripts/sw.js"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "sw.js")
      
      }
    
    }
  
    // @LINE:73
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:50
  class ReverseSignInController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signIn")
    }
  
    // @LINE:51
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signIn")
    }
  
  }

  // @LINE:53
  class ReverseTotpController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def enableTotpSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "enableTotpSubmit")
    }
  
    // @LINE:56
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "totpSubmit")
    }
  
    // @LINE:54
    def enableTotp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "enableTotp")
    }
  
    // @LINE:55
    def disableTotp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "disableTotp")
    }
  
    // @LINE:53
    def view(userId:java.util.UUID, sharedKey:String, rememberMe:Boolean): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "totp" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.UUID]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sharedKey", sharedKey)), Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("rememberMe", rememberMe)))))
    }
  
  }

  // @LINE:59
  class ReverseTotpRecoveryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "totpRecoverySubmit")
    }
  
    // @LINE:59
    def view(userID:java.util.UUID, sharedKey:String, rememberMe:Boolean): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "totpRecovery" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.UUID]].unbind("userID", userID)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sharedKey", sharedKey)), Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("rememberMe", rememberMe)))))
    }
  
  }

  // @LINE:45
  class ReverseSocialAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def authenticate(provider:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("provider", provider)))
    }
  
  }

  // @LINE:10
  class ReverseHeroesInScala(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def command(cmd:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "command" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("cmd", cmd)))))
    }
  
    // @LINE:10
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:14
    def getjson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "json")
    }
  
  }

  // @LINE:64
  class ReverseResetPasswordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def submit(token:java.util.UUID): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "password/reset/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("token", token)))
    }
  
    // @LINE:64
    def view(token:java.util.UUID): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "password/reset/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("token", token)))
    }
  
  }

  // @LINE:43
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def signOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signOut")
    }
  
    // @LINE:43
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:69
  class ReverseActivateAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def activate(token:java.util.UUID): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "account/activate/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("token", token)))
    }
  
    // @LINE:69
    def send(email:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "account/email/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)))
    }
  
  }

  // @LINE:62
  class ReverseForgotPasswordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "password/forgot")
    }
  
    // @LINE:63
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "password/forgot")
    }
  
  }

  // @LINE:66
  class ReverseChangePasswordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "password/change")
    }
  
    // @LINE:67
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "password/change")
    }
  
  }

  // @LINE:47
  class ReverseSignUpController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signUp")
    }
  
    // @LINE:48
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signUp")
    }
  
  }


}
