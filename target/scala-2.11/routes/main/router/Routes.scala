
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pzq317/Desktop/SparkMLPlatform3/conf/routes
// @DATE:Fri Jan 20 21:37:38 PHT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Entrance_1: controllers.Entrance,
  // @LINE:7
  test_2: controllers.test,
  // @LINE:11
  Preprocess_5: controllers.Preprocess,
  // @LINE:24
  RegressionSimple_0: controllers.RegressionSimple,
  // @LINE:29
  Regression_7: controllers.Regression,
  // @LINE:36
  Classification_10: controllers.Classification,
  // @LINE:42
  FeatureSelection_3: controllers.FeatureSelection,
  // @LINE:47
  Clustering_8: controllers.Clustering,
  // @LINE:54
  Simple_6: controllers.Simple,
  // @LINE:59
  SignIn_4: controllers.SignIn,
  // @LINE:64
  Assets_9: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Entrance_1: controllers.Entrance,
    // @LINE:7
    test_2: controllers.test,
    // @LINE:11
    Preprocess_5: controllers.Preprocess,
    // @LINE:24
    RegressionSimple_0: controllers.RegressionSimple,
    // @LINE:29
    Regression_7: controllers.Regression,
    // @LINE:36
    Classification_10: controllers.Classification,
    // @LINE:42
    FeatureSelection_3: controllers.FeatureSelection,
    // @LINE:47
    Clustering_8: controllers.Clustering,
    // @LINE:54
    Simple_6: controllers.Simple,
    // @LINE:59
    SignIn_4: controllers.SignIn,
    // @LINE:64
    Assets_9: controllers.Assets
  ) = this(errorHandler, Entrance_1, test_2, Preprocess_5, RegressionSimple_0, Regression_7, Classification_10, FeatureSelection_3, Clustering_8, Simple_6, SignIn_4, Assets_9, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Entrance_1, test_2, Preprocess_5, RegressionSimple_0, Regression_7, Classification_10, FeatureSelection_3, Clustering_8, Simple_6, SignIn_4, Assets_9, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Entrance.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.test.test"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dataimport_pre1""", """controllers.Entrance.dataimport_pre1"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """preprocess1""", """controllers.Preprocess.preprocess1_summary"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """preprocess1_rmcol""", """controllers.Preprocess.preprocess1_rmcol"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dataimport_pre2""", """controllers.Entrance.dataimport_pre2"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """preprocess2""", """controllers.Preprocess.preprocess2"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """preprocess2_convec""", """controllers.Preprocess.convertVector"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dataimport_nov""", """controllers.Entrance.dataimport_nov"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """preprocessD""", """controllers.Preprocess.preprocess_direct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """linearRegression2""", """controllers.RegressionSimple.callRegression"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """linearRegression_param2""", """controllers.Entrance.simp_reg"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """linearRegression_param""", """controllers.Entrance.linear_reg_param"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """linearRegression""", """controllers.Regression.callRegression"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """download""", """controllers.Regression.download"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """regModel""", """controllers.Entrance.reg_trans"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """regTrans""", """controllers.Regression.transformRegression"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logregparam""", """controllers.Entrance.log_reg"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logisticRegression""", """controllers.Classification.callLogistic"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logModel""", """controllers.Entrance.log_trans"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logTrans""", """controllers.Classification.logRegression"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pca""", """controllers.Entrance.pca"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pcaResult""", """controllers.FeatureSelection.callPCA"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pcaModel""", """controllers.Entrance.pca_trans"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pcaTrans""", """controllers.FeatureSelection.pca_trans"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kmeans""", """controllers.Entrance.kmeans"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kmeansResult""", """controllers.Clustering.callKmeans"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kmeanModel""", """controllers.Entrance.kmean_trans"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kmeanTrans""", """controllers.Clustering.kmean_trans"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """savemodel""", """controllers.Simple.saveModel"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Entrance.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.Entrance.signin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Entrance.signup"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUpData""", """controllers.SignIn.signUp"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signData""", """controllers.SignIn.signIn"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """show""", """controllers.SignIn.show"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Entrance_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Entrance_index0_invoker = createInvoker(
    Entrance_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_test_test1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_test_test1_invoker = createInvoker(
    test_2.test,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.test",
      "test",
      Nil,
      "POST",
      """""",
      this.prefix + """test"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Entrance_dataimport_pre12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dataimport_pre1")))
  )
  private[this] lazy val controllers_Entrance_dataimport_pre12_invoker = createInvoker(
    Entrance_1.dataimport_pre1,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "dataimport_pre1",
      Nil,
      "GET",
      """## data preprocess""",
      this.prefix + """dataimport_pre1"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Preprocess_preprocess1_summary3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("preprocess1")))
  )
  private[this] lazy val controllers_Preprocess_preprocess1_summary3_invoker = createInvoker(
    Preprocess_5.preprocess1_summary,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Preprocess",
      "preprocess1_summary",
      Nil,
      "POST",
      """""",
      this.prefix + """preprocess1"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Preprocess_preprocess1_rmcol4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("preprocess1_rmcol")))
  )
  private[this] lazy val controllers_Preprocess_preprocess1_rmcol4_invoker = createInvoker(
    Preprocess_5.preprocess1_rmcol,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Preprocess",
      "preprocess1_rmcol",
      Nil,
      "POST",
      """""",
      this.prefix + """preprocess1_rmcol"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Entrance_dataimport_pre25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dataimport_pre2")))
  )
  private[this] lazy val controllers_Entrance_dataimport_pre25_invoker = createInvoker(
    Entrance_1.dataimport_pre2,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "dataimport_pre2",
      Nil,
      "GET",
      """""",
      this.prefix + """dataimport_pre2"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Preprocess_preprocess26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("preprocess2")))
  )
  private[this] lazy val controllers_Preprocess_preprocess26_invoker = createInvoker(
    Preprocess_5.preprocess2,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Preprocess",
      "preprocess2",
      Nil,
      "POST",
      """""",
      this.prefix + """preprocess2"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Preprocess_convertVector7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("preprocess2_convec")))
  )
  private[this] lazy val controllers_Preprocess_convertVector7_invoker = createInvoker(
    Preprocess_5.convertVector,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Preprocess",
      "convertVector",
      Nil,
      "POST",
      """""",
      this.prefix + """preprocess2_convec"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Entrance_dataimport_nov8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dataimport_nov")))
  )
  private[this] lazy val controllers_Entrance_dataimport_nov8_invoker = createInvoker(
    Entrance_1.dataimport_nov,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "dataimport_nov",
      Nil,
      "GET",
      """""",
      this.prefix + """dataimport_nov"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Preprocess_preprocess_direct9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("preprocessD")))
  )
  private[this] lazy val controllers_Preprocess_preprocess_direct9_invoker = createInvoker(
    Preprocess_5.preprocess_direct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Preprocess",
      "preprocess_direct",
      Nil,
      "POST",
      """""",
      this.prefix + """preprocessD"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_RegressionSimple_callRegression10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("linearRegression2")))
  )
  private[this] lazy val controllers_RegressionSimple_callRegression10_invoker = createInvoker(
    RegressionSimple_0.callRegression,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegressionSimple",
      "callRegression",
      Nil,
      "POST",
      """""",
      this.prefix + """linearRegression2"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Entrance_simp_reg11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("linearRegression_param2")))
  )
  private[this] lazy val controllers_Entrance_simp_reg11_invoker = createInvoker(
    Entrance_1.simp_reg,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "simp_reg",
      Nil,
      "GET",
      """""",
      this.prefix + """linearRegression_param2"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Entrance_linear_reg_param12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("linearRegression_param")))
  )
  private[this] lazy val controllers_Entrance_linear_reg_param12_invoker = createInvoker(
    Entrance_1.linear_reg_param,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "linear_reg_param",
      Nil,
      "GET",
      """""",
      this.prefix + """linearRegression_param"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Regression_callRegression13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("linearRegression")))
  )
  private[this] lazy val controllers_Regression_callRegression13_invoker = createInvoker(
    Regression_7.callRegression,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Regression",
      "callRegression",
      Nil,
      "POST",
      """""",
      this.prefix + """linearRegression"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Regression_download14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("download")))
  )
  private[this] lazy val controllers_Regression_download14_invoker = createInvoker(
    Regression_7.download,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Regression",
      "download",
      Nil,
      "POST",
      """""",
      this.prefix + """download"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Entrance_reg_trans15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("regModel")))
  )
  private[this] lazy val controllers_Entrance_reg_trans15_invoker = createInvoker(
    Entrance_1.reg_trans,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "reg_trans",
      Nil,
      "GET",
      """""",
      this.prefix + """regModel"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Regression_transformRegression16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("regTrans")))
  )
  private[this] lazy val controllers_Regression_transformRegression16_invoker = createInvoker(
    Regression_7.transformRegression,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Regression",
      "transformRegression",
      Nil,
      "POST",
      """""",
      this.prefix + """regTrans"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Entrance_log_reg17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logregparam")))
  )
  private[this] lazy val controllers_Entrance_log_reg17_invoker = createInvoker(
    Entrance_1.log_reg,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "log_reg",
      Nil,
      "GET",
      """""",
      this.prefix + """logregparam"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Classification_callLogistic18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logisticRegression")))
  )
  private[this] lazy val controllers_Classification_callLogistic18_invoker = createInvoker(
    Classification_10.callLogistic,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Classification",
      "callLogistic",
      Nil,
      "POST",
      """""",
      this.prefix + """logisticRegression"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Entrance_log_trans19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logModel")))
  )
  private[this] lazy val controllers_Entrance_log_trans19_invoker = createInvoker(
    Entrance_1.log_trans,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "log_trans",
      Nil,
      "GET",
      """""",
      this.prefix + """logModel"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Classification_logRegression20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logTrans")))
  )
  private[this] lazy val controllers_Classification_logRegression20_invoker = createInvoker(
    Classification_10.logRegression,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Classification",
      "logRegression",
      Nil,
      "POST",
      """""",
      this.prefix + """logTrans"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Entrance_pca21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pca")))
  )
  private[this] lazy val controllers_Entrance_pca21_invoker = createInvoker(
    Entrance_1.pca,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "pca",
      Nil,
      "GET",
      """""",
      this.prefix + """pca"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_FeatureSelection_callPCA22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pcaResult")))
  )
  private[this] lazy val controllers_FeatureSelection_callPCA22_invoker = createInvoker(
    FeatureSelection_3.callPCA,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FeatureSelection",
      "callPCA",
      Nil,
      "POST",
      """""",
      this.prefix + """pcaResult"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Entrance_pca_trans23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pcaModel")))
  )
  private[this] lazy val controllers_Entrance_pca_trans23_invoker = createInvoker(
    Entrance_1.pca_trans,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "pca_trans",
      Nil,
      "GET",
      """""",
      this.prefix + """pcaModel"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_FeatureSelection_pca_trans24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pcaTrans")))
  )
  private[this] lazy val controllers_FeatureSelection_pca_trans24_invoker = createInvoker(
    FeatureSelection_3.pca_trans,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FeatureSelection",
      "pca_trans",
      Nil,
      "POST",
      """""",
      this.prefix + """pcaTrans"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Entrance_kmeans25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kmeans")))
  )
  private[this] lazy val controllers_Entrance_kmeans25_invoker = createInvoker(
    Entrance_1.kmeans,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "kmeans",
      Nil,
      "GET",
      """""",
      this.prefix + """kmeans"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Clustering_callKmeans26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kmeansResult")))
  )
  private[this] lazy val controllers_Clustering_callKmeans26_invoker = createInvoker(
    Clustering_8.callKmeans,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Clustering",
      "callKmeans",
      Nil,
      "POST",
      """""",
      this.prefix + """kmeansResult"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Entrance_kmean_trans27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kmeanModel")))
  )
  private[this] lazy val controllers_Entrance_kmean_trans27_invoker = createInvoker(
    Entrance_1.kmean_trans,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "kmean_trans",
      Nil,
      "GET",
      """""",
      this.prefix + """kmeanModel"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Clustering_kmean_trans28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kmeanTrans")))
  )
  private[this] lazy val controllers_Clustering_kmean_trans28_invoker = createInvoker(
    Clustering_8.kmean_trans,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Clustering",
      "kmean_trans",
      Nil,
      "POST",
      """""",
      this.prefix + """kmeanTrans"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Simple_saveModel29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("savemodel")))
  )
  private[this] lazy val controllers_Simple_saveModel29_invoker = createInvoker(
    Simple_6.saveModel,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Simple",
      "saveModel",
      Nil,
      "POST",
      """""",
      this.prefix + """savemodel"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Entrance_logout30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Entrance_logout30_invoker = createInvoker(
    Entrance_1.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_Entrance_signin31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_Entrance_signin31_invoker = createInvoker(
    Entrance_1.signin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "signin",
      Nil,
      "GET",
      """""",
      this.prefix + """signin"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Entrance_signup32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Entrance_signup32_invoker = createInvoker(
    Entrance_1.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entrance",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_SignIn_signUp33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUpData")))
  )
  private[this] lazy val controllers_SignIn_signUp33_invoker = createInvoker(
    SignIn_4.signUp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignIn",
      "signUp",
      Nil,
      "POST",
      """""",
      this.prefix + """signUpData"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_SignIn_signIn34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signData")))
  )
  private[this] lazy val controllers_SignIn_signIn34_invoker = createInvoker(
    SignIn_4.signIn,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignIn",
      "signIn",
      Nil,
      "POST",
      """""",
      this.prefix + """signData"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_SignIn_show35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("show")))
  )
  private[this] lazy val controllers_SignIn_show35_invoker = createInvoker(
    SignIn_4.show,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignIn",
      "show",
      Nil,
      "GET",
      """""",
      this.prefix + """show"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Assets_at36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at36_invoker = createInvoker(
    Assets_9.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Entrance_index0_route(params) =>
      call { 
        controllers_Entrance_index0_invoker.call(Entrance_1.index)
      }
  
    // @LINE:7
    case controllers_test_test1_route(params) =>
      call { 
        controllers_test_test1_invoker.call(test_2.test)
      }
  
    // @LINE:10
    case controllers_Entrance_dataimport_pre12_route(params) =>
      call { 
        controllers_Entrance_dataimport_pre12_invoker.call(Entrance_1.dataimport_pre1)
      }
  
    // @LINE:11
    case controllers_Preprocess_preprocess1_summary3_route(params) =>
      call { 
        controllers_Preprocess_preprocess1_summary3_invoker.call(Preprocess_5.preprocess1_summary)
      }
  
    // @LINE:12
    case controllers_Preprocess_preprocess1_rmcol4_route(params) =>
      call { 
        controllers_Preprocess_preprocess1_rmcol4_invoker.call(Preprocess_5.preprocess1_rmcol)
      }
  
    // @LINE:14
    case controllers_Entrance_dataimport_pre25_route(params) =>
      call { 
        controllers_Entrance_dataimport_pre25_invoker.call(Entrance_1.dataimport_pre2)
      }
  
    // @LINE:15
    case controllers_Preprocess_preprocess26_route(params) =>
      call { 
        controllers_Preprocess_preprocess26_invoker.call(Preprocess_5.preprocess2)
      }
  
    // @LINE:16
    case controllers_Preprocess_convertVector7_route(params) =>
      call { 
        controllers_Preprocess_convertVector7_invoker.call(Preprocess_5.convertVector)
      }
  
    // @LINE:18
    case controllers_Entrance_dataimport_nov8_route(params) =>
      call { 
        controllers_Entrance_dataimport_nov8_invoker.call(Entrance_1.dataimport_nov)
      }
  
    // @LINE:19
    case controllers_Preprocess_preprocess_direct9_route(params) =>
      call { 
        controllers_Preprocess_preprocess_direct9_invoker.call(Preprocess_5.preprocess_direct)
      }
  
    // @LINE:24
    case controllers_RegressionSimple_callRegression10_route(params) =>
      call { 
        controllers_RegressionSimple_callRegression10_invoker.call(RegressionSimple_0.callRegression)
      }
  
    // @LINE:25
    case controllers_Entrance_simp_reg11_route(params) =>
      call { 
        controllers_Entrance_simp_reg11_invoker.call(Entrance_1.simp_reg)
      }
  
    // @LINE:28
    case controllers_Entrance_linear_reg_param12_route(params) =>
      call { 
        controllers_Entrance_linear_reg_param12_invoker.call(Entrance_1.linear_reg_param)
      }
  
    // @LINE:29
    case controllers_Regression_callRegression13_route(params) =>
      call { 
        controllers_Regression_callRegression13_invoker.call(Regression_7.callRegression)
      }
  
    // @LINE:30
    case controllers_Regression_download14_route(params) =>
      call { 
        controllers_Regression_download14_invoker.call(Regression_7.download)
      }
  
    // @LINE:32
    case controllers_Entrance_reg_trans15_route(params) =>
      call { 
        controllers_Entrance_reg_trans15_invoker.call(Entrance_1.reg_trans)
      }
  
    // @LINE:33
    case controllers_Regression_transformRegression16_route(params) =>
      call { 
        controllers_Regression_transformRegression16_invoker.call(Regression_7.transformRegression)
      }
  
    // @LINE:35
    case controllers_Entrance_log_reg17_route(params) =>
      call { 
        controllers_Entrance_log_reg17_invoker.call(Entrance_1.log_reg)
      }
  
    // @LINE:36
    case controllers_Classification_callLogistic18_route(params) =>
      call { 
        controllers_Classification_callLogistic18_invoker.call(Classification_10.callLogistic)
      }
  
    // @LINE:38
    case controllers_Entrance_log_trans19_route(params) =>
      call { 
        controllers_Entrance_log_trans19_invoker.call(Entrance_1.log_trans)
      }
  
    // @LINE:39
    case controllers_Classification_logRegression20_route(params) =>
      call { 
        controllers_Classification_logRegression20_invoker.call(Classification_10.logRegression)
      }
  
    // @LINE:41
    case controllers_Entrance_pca21_route(params) =>
      call { 
        controllers_Entrance_pca21_invoker.call(Entrance_1.pca)
      }
  
    // @LINE:42
    case controllers_FeatureSelection_callPCA22_route(params) =>
      call { 
        controllers_FeatureSelection_callPCA22_invoker.call(FeatureSelection_3.callPCA)
      }
  
    // @LINE:43
    case controllers_Entrance_pca_trans23_route(params) =>
      call { 
        controllers_Entrance_pca_trans23_invoker.call(Entrance_1.pca_trans)
      }
  
    // @LINE:44
    case controllers_FeatureSelection_pca_trans24_route(params) =>
      call { 
        controllers_FeatureSelection_pca_trans24_invoker.call(FeatureSelection_3.pca_trans)
      }
  
    // @LINE:46
    case controllers_Entrance_kmeans25_route(params) =>
      call { 
        controllers_Entrance_kmeans25_invoker.call(Entrance_1.kmeans)
      }
  
    // @LINE:47
    case controllers_Clustering_callKmeans26_route(params) =>
      call { 
        controllers_Clustering_callKmeans26_invoker.call(Clustering_8.callKmeans)
      }
  
    // @LINE:48
    case controllers_Entrance_kmean_trans27_route(params) =>
      call { 
        controllers_Entrance_kmean_trans27_invoker.call(Entrance_1.kmean_trans)
      }
  
    // @LINE:49
    case controllers_Clustering_kmean_trans28_route(params) =>
      call { 
        controllers_Clustering_kmean_trans28_invoker.call(Clustering_8.kmean_trans)
      }
  
    // @LINE:54
    case controllers_Simple_saveModel29_route(params) =>
      call { 
        controllers_Simple_saveModel29_invoker.call(Simple_6.saveModel)
      }
  
    // @LINE:56
    case controllers_Entrance_logout30_route(params) =>
      call { 
        controllers_Entrance_logout30_invoker.call(Entrance_1.logout)
      }
  
    // @LINE:57
    case controllers_Entrance_signin31_route(params) =>
      call { 
        controllers_Entrance_signin31_invoker.call(Entrance_1.signin)
      }
  
    // @LINE:58
    case controllers_Entrance_signup32_route(params) =>
      call { 
        controllers_Entrance_signup32_invoker.call(Entrance_1.signup)
      }
  
    // @LINE:59
    case controllers_SignIn_signUp33_route(params) =>
      call { 
        controllers_SignIn_signUp33_invoker.call(SignIn_4.signUp)
      }
  
    // @LINE:60
    case controllers_SignIn_signIn34_route(params) =>
      call { 
        controllers_SignIn_signIn34_invoker.call(SignIn_4.signIn)
      }
  
    // @LINE:61
    case controllers_SignIn_show35_route(params) =>
      call { 
        controllers_SignIn_show35_invoker.call(SignIn_4.show)
      }
  
    // @LINE:64
    case controllers_Assets_at36_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at36_invoker.call(Assets_9.at(path, file))
      }
  }
}
