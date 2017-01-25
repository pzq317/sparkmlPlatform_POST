
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pzq317/Desktop/SparkMLPlatform3/conf/routes
// @DATE:Fri Jan 20 21:37:38 PHT 2017


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
