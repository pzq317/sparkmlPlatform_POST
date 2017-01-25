
package views.html.mlModel

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

class pca extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Form[scala.Tuple2[String, String]],List[String],String,String,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(myForm: Form[(String,String)], parquetlist: List[String],result:String,user:String,timestamp:String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.132*/("""


  """),_display_(/*6.4*/main(title = "PCA",test = user)/*6.35*/ {_display_(Seq[Any](format.raw/*6.37*/("""


    """),format.raw/*9.5*/("""<h3>Principal Component Analysis</h3>
    """),_display_(/*10.6*/if(parquetlist != null)/*10.29*/ {_display_(Seq[Any](format.raw/*10.31*/("""
      """),_display_(/*11.8*/form(action = routes.FeatureSelection.callPCA())/*11.56*/ {_display_(Seq[Any](format.raw/*11.58*/("""
        """),format.raw/*12.9*/("""<fieldset>

          <legend>Input Parameters</legend>
          """),_display_(/*15.12*/select(
            field = myForm("path"),
            options(parquetlist),
            '_label -> "Select your parquet name")),format.raw/*18.51*/("""

          """),_display_(/*20.12*/inputText(
            field = myForm("k").copy(value=Some("36")),
            args = '_label -> "k", 'placeholder -> "3"
          )),format.raw/*23.12*/("""

          """),format.raw/*25.11*/("""<div class="submit">
            <input type="submit" id="submit" value="submit">
          </div>
        </fieldset>
      """)))}),format.raw/*29.8*/("""
    """)))}),format.raw/*30.6*/("""

    """),_display_(/*32.6*/if(result != null)/*32.24*/ {_display_(Seq[Any](format.raw/*32.26*/("""
      """),format.raw/*33.7*/("""<script src="http://labratrevenge.com/d3-tip/javascripts/d3.tip.v0.6.3.js"></script>
      <script src='"""),_display_(/*34.21*/routes/*34.27*/.Assets.at("javascripts/d3/line.js")),format.raw/*34.63*/("""'></script>
      <link rel="stylesheet" media="screen" href=""""),_display_(/*35.52*/routes/*35.58*/.Assets.at("stylesheets/d3/line.css")),format.raw/*35.95*/("""">
      <h3>陡坡圖</h3>
      <div class="col-sm-12" id="linechart"></div>

      <script>
              d3.select('#linechart').datum("""),_display_(/*40.46*/Html(result)),format.raw/*40.58*/(""").call(line());
      </script>
        """),_display_(/*42.10*/if(user!="NULL")/*42.26*/{_display_(Seq[Any](format.raw/*42.27*/("""
            """),_display_(/*43.14*/form(action = routes.Simple.saveModel)/*43.52*/ {_display_(Seq[Any](format.raw/*43.54*/("""
"""),format.raw/*44.1*/("""<<<<<<< HEAD

                <input type="text" name="outputFolder" required="required"> <br>
                <input type="hidden" name ="timestamp" value="""),_display_(/*47.63*/timestamp),format.raw/*47.72*/(""" """),format.raw/*47.73*/("""><br>
=======
                <h3>Save Model as: </h3>
                <input type="text" name="outputFolder" value="PCAModel"> <br>
                <input type="hidden" name ="timestamp" value="NULL" ><br>
>>>>>>> 3d8d556ccd9e53f3b5e8213d2f0405bcc40575b9
                <input type="hidden" name = "type" value=""""),_display_(/*53.60*/Utilities/*53.69*/.pcaModel),format.raw/*53.78*/("""" ><br>

                <p class="buttons">
                <input type="submit" id="submit">
                </p>
            """)))}),format.raw/*58.14*/("""
        """)))}),format.raw/*59.10*/("""
    """)))}),format.raw/*60.6*/("""
  """)))}))
      }
    }
  }

  def render(myForm:Form[scala.Tuple2[String, String]],parquetlist:List[String],result:String,user:String,timestamp:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(myForm,parquetlist,result,user,timestamp)(messages)

  def f:((Form[scala.Tuple2[String, String]],List[String],String,String,String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (myForm,parquetlist,result,user,timestamp) => (messages) => apply(myForm,parquetlist,result,user,timestamp)(messages)

  def ref: this.type = this

}


}
}

/**/
object pca extends pca_Scope0.pca_Scope1.pca
              /*
                  -- GENERATED --
                  DATE: Fri Jan 06 14:25:07 PHT 2017
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/mlModel/pca.scala.html
                  HASH: b67d1958d2f9be5f7da7e91024e4cc9f09bec877
                  MATRIX: 666->41|892->171|923->177|962->208|1001->210|1034->217|1103->260|1135->283|1175->285|1209->293|1266->341|1306->343|1342->352|1436->419|1585->547|1625->560|1779->693|1819->705|1975->831|2011->837|2044->844|2071->862|2111->864|2145->871|2277->976|2292->982|2349->1018|2439->1081|2454->1087|2512->1124|2673->1258|2706->1270|2774->1311|2799->1327|2838->1328|2879->1342|2926->1380|2966->1382|2994->1383|3178->1540|3208->1549|3237->1550|3579->1865|3597->1874|3627->1883|3787->2012|3828->2022|3864->2028
                  LINES: 24->3|29->3|32->6|32->6|32->6|35->9|36->10|36->10|36->10|37->11|37->11|37->11|38->12|41->15|44->18|46->20|49->23|51->25|55->29|56->30|58->32|58->32|58->32|59->33|60->34|60->34|60->34|61->35|61->35|61->35|66->40|66->40|68->42|68->42|68->42|69->43|69->43|69->43|70->44|73->47|73->47|73->47|79->53|79->53|79->53|84->58|85->59|86->60
                  -- GENERATED --
              */
          