// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Janko/IdeaProject/play-silhouette-seed/conf/routes
// @DATE:Sun Jan 19 11:01:08 CET 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
