
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pzq317/Desktop/SparkMLPlatform3/conf/routes
// @DATE:Fri Jan 20 21:37:38 PHT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:29
  class ReverseRegression(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def transformRegression: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Regression.transformRegression",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "regTrans"})
        }
      """
    )
  
    // @LINE:30
    def download: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Regression.download",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "download"})
        }
      """
    )
  
    // @LINE:29
    def callRegression: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Regression.callRegression",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "linearRegression"})
        }
      """
    )
  
  }

  // @LINE:59
  class ReverseSignIn(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignIn.signUp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUpData"})
        }
      """
    )
  
    // @LINE:61
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignIn.show",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "show"})
        }
      """
    )
  
    // @LINE:60
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignIn.signIn",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signData"})
        }
      """
    )
  
  }

  // @LINE:64
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:64
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:7
  class Reversetest(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.test.test",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
  }

  // @LINE:36
  class ReverseClassification(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def callLogistic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Classification.callLogistic",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logisticRegression"})
        }
      """
    )
  
    // @LINE:39
    def logRegression: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Classification.logRegression",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logTrans"})
        }
      """
    )
  
  }

  // @LINE:54
  class ReverseSimple(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def saveModel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Simple.saveModel",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "savemodel"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReversePreprocess(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def preprocess_direct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Preprocess.preprocess_direct",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "preprocessD"})
        }
      """
    )
  
    // @LINE:15
    def preprocess2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Preprocess.preprocess2",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "preprocess2"})
        }
      """
    )
  
    // @LINE:12
    def preprocess1_rmcol: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Preprocess.preprocess1_rmcol",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "preprocess1_rmcol"})
        }
      """
    )
  
    // @LINE:11
    def preprocess1_summary: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Preprocess.preprocess1_summary",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "preprocess1"})
        }
      """
    )
  
    // @LINE:16
    def convertVector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Preprocess.convertVector",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "preprocess2_convec"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseEntrance(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def dataimport_pre1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.dataimport_pre1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataimport_pre1"})
        }
      """
    )
  
    // @LINE:35
    def log_reg: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.log_reg",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logregparam"})
        }
      """
    )
  
    // @LINE:38
    def log_trans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.log_trans",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logModel"})
        }
      """
    )
  
    // @LINE:14
    def dataimport_pre2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.dataimport_pre2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataimport_pre2"})
        }
      """
    )
  
    // @LINE:43
    def pca_trans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.pca_trans",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pcaModel"})
        }
      """
    )
  
    // @LINE:41
    def pca: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.pca",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pca"})
        }
      """
    )
  
    // @LINE:46
    def kmeans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.kmeans",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kmeans"})
        }
      """
    )
  
    // @LINE:25
    def simp_reg: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.simp_reg",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "linearRegression_param2"})
        }
      """
    )
  
    // @LINE:58
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:56
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:57
    def signin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.signin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
    // @LINE:18
    def dataimport_nov: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.dataimport_nov",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataimport_nov"})
        }
      """
    )
  
    // @LINE:48
    def kmean_trans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.kmean_trans",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kmeanModel"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:28
    def linear_reg_param: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.linear_reg_param",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "linearRegression_param"})
        }
      """
    )
  
    // @LINE:32
    def reg_trans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrance.reg_trans",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "regModel"})
        }
      """
    )
  
  }

  // @LINE:42
  class ReverseFeatureSelection(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def pca_trans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FeatureSelection.pca_trans",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pcaTrans"})
        }
      """
    )
  
    // @LINE:42
    def callPCA: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FeatureSelection.callPCA",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pcaResult"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseRegressionSimple(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def callRegression: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegressionSimple.callRegression",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "linearRegression2"})
        }
      """
    )
  
  }

  // @LINE:47
  class ReverseClustering(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def kmean_trans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Clustering.kmean_trans",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kmeanTrans"})
        }
      """
    )
  
    // @LINE:47
    def callKmeans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Clustering.callKmeans",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kmeansResult"})
        }
      """
    )
  
  }


}
