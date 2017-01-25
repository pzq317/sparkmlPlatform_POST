
package views.html.mlTrans

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object pca_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object pca_Scope1 {
import helper._
import util.Utilities

class pca extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[Form[scala.Tuple2[String, String]],Form[String],List[String],List[String],Array[String],String,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(param: Form[(String, String)],down: Form[(String)], pre2data: List[String], model: List[String], regResult: Array[String], errorMessage: String, user:String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.189*/("""
"""),_display_(/*4.2*/main(title = "Linear Regression",test = user)/*4.47*/ {_display_(Seq[Any](format.raw/*4.49*/("""

  """),_display_(/*6.4*/if(pre2data != null)/*6.24*/ {_display_(Seq[Any](format.raw/*6.26*/("""
    """),format.raw/*7.5*/("""<h3>PCA</h3>
    """),_display_(/*8.6*/form(action = routes.FeatureSelection.pca_trans())/*8.56*/ {_display_(Seq[Any](format.raw/*8.58*/("""
      """),format.raw/*9.7*/("""<fieldset>

        <legend>Input Parameters</legend>


        """),_display_(/*14.10*/select(
          field = param("inputpath"),
          options(pre2data),
          '_label -> "Select your parquet name")),format.raw/*17.49*/("""

        """),_display_(/*19.10*/select(
          field = param("model"),
          options(model),
          '_label -> "Select your model name")),format.raw/*22.47*/("""

        """),format.raw/*24.9*/("""<div class="submit">
          <input type="submit" id="submit" value="submit">
        </div>
      </fieldset>

    """)))}),format.raw/*29.6*/("""
  """)))}),format.raw/*30.4*/("""

  """),_display_(/*32.4*/if(regResult != null)/*32.25*/ {_display_(Seq[Any](format.raw/*32.27*/("""
    """),format.raw/*33.5*/("""<h2>pcaFeatures</h2>
    """),_display_(/*34.6*/for(i <- 0 to 3) yield /*34.22*/ {_display_(Seq[Any](format.raw/*34.24*/("""
      """),format.raw/*35.7*/("""<br>
      Column"""),_display_(/*36.14*/i),format.raw/*36.15*/("""| """),_display_(/*36.18*/regResult(i)),format.raw/*36.30*/("""
    """)))}),format.raw/*37.6*/("""
    """),format.raw/*38.5*/("""<br>
    ....and """),_display_(/*39.14*/(regResult.length-4)),format.raw/*39.34*/(""" """),format.raw/*39.35*/("""more
    <br>
    """),_display_(/*41.6*/if(user!="NULL"&&user!="outsider"&&user!="")/*41.50*/ {_display_(Seq[Any](format.raw/*41.52*/("""
    """),_display_(/*42.6*/form(action = routes.Regression.download())/*42.49*/ {_display_(Seq[Any](format.raw/*42.51*/("""
      """),format.raw/*43.7*/("""<fieldset>
        <legend>download your result</legend>
        """),_display_(/*45.10*/inputText(
          field = down("csvPath"),
          '_label -> "Input your download path"
        )),format.raw/*48.10*/("""

        """),format.raw/*50.9*/("""<div class="submit">
          <input type="submit" id="submit" value="download">
        </div>
      </fieldset>

    """)))}),format.raw/*55.6*/("""
  """)))}),format.raw/*56.4*/("""
  """)))}),format.raw/*57.4*/("""
""")))}))
      }
    }
  }

  def render(param:Form[scala.Tuple2[String, String]],down:Form[String],pre2data:List[String],model:List[String],regResult:Array[String],errorMessage:String,user:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(param,down,pre2data,model,regResult,errorMessage,user)(messages)

  def f:((Form[scala.Tuple2[String, String]],Form[String],List[String],List[String],Array[String],String,String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (param,down,pre2data,model,regResult,errorMessage,user) => (messages) => apply(param,down,pre2data,model,regResult,errorMessage,user)(messages)

  def ref: this.type = this

}


}
}

/**/
object pca extends pca_Scope0.pca_Scope1.pca
              /*
                  -- GENERATED --
                  DATE: Mon Jan 02 17:39:14 PHT 2017
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/mlTrans/pca.scala.html
                  HASH: 9d9f28ccbc68639a52fa3cabd51a1bb135bde02b
                  MATRIX: 699->41|982->228|1009->230|1062->275|1101->277|1131->282|1159->302|1198->304|1229->309|1272->327|1330->377|1369->379|1402->386|1494->451|1638->574|1676->585|1811->699|1848->709|1997->828|2031->832|2062->837|2092->858|2132->860|2164->865|2216->891|2248->907|2288->909|2322->916|2367->934|2389->935|2419->938|2452->950|2488->956|2520->961|2565->979|2606->999|2635->1000|2680->1019|2733->1063|2773->1065|2805->1071|2857->1114|2897->1116|2931->1123|3024->1189|3148->1292|3185->1302|3336->1423|3370->1427|3404->1431
                  LINES: 24->3|29->3|30->4|30->4|30->4|32->6|32->6|32->6|33->7|34->8|34->8|34->8|35->9|40->14|43->17|45->19|48->22|50->24|55->29|56->30|58->32|58->32|58->32|59->33|60->34|60->34|60->34|61->35|62->36|62->36|62->36|62->36|63->37|64->38|65->39|65->39|65->39|67->41|67->41|67->41|68->42|68->42|68->42|69->43|71->45|74->48|76->50|81->55|82->56|83->57
                  -- GENERATED --
              */
          