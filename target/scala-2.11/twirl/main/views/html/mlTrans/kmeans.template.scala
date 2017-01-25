
package views.html.mlTrans

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object kmeans_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object kmeans_Scope1 {
import helper._

class kmeans extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[Form[scala.Tuple2[String, String]],Form[String],List[String],List[String],Array[String],String,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(param: Form[(String, String)],down: Form[(String)], pre2data: List[String], model: List[String], regResult: Array[String], errorMessage: String,user:String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.188*/("""
"""),_display_(/*4.2*/main(title = "Linear Regression", test = user)/*4.48*/ {_display_(Seq[Any](format.raw/*4.50*/("""

  """),_display_(/*6.4*/if(pre2data != null)/*6.24*/ {_display_(Seq[Any](format.raw/*6.26*/("""
    """),format.raw/*7.5*/("""<h3>Kmeans</h3>
    """),_display_(/*8.6*/form(action = routes.Clustering.kmean_trans())/*8.52*/ {_display_(Seq[Any](format.raw/*8.54*/("""
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
    """),format.raw/*33.5*/("""<h2>predict labels</h2>
    """),_display_(/*34.6*/for(i <- 0 to 3) yield /*34.22*/ {_display_(Seq[Any](format.raw/*34.24*/("""
      """),format.raw/*35.7*/("""<br>
      Column"""),_display_(/*36.14*/i),format.raw/*36.15*/("""| """),_display_(/*36.18*/regResult(i)),format.raw/*36.30*/("""
    """)))}),format.raw/*37.6*/("""
    """),format.raw/*38.5*/("""<br>
    ....and """),_display_(/*39.14*/(regResult.length-4)),format.raw/*39.34*/(""" """),format.raw/*39.35*/("""more
    <br>
      """),_display_(/*41.8*/if(user!="NULL"&&user!="outsider"&&user!="")/*41.52*/ {_display_(Seq[Any](format.raw/*41.54*/("""
        """),_display_(/*42.10*/form(action = routes.Regression.download())/*42.53*/ {_display_(Seq[Any](format.raw/*42.55*/("""
        """),format.raw/*43.9*/("""<fieldset>
            <legend>download your result</legend>
            """),_display_(/*45.14*/inputText(
                field = down("csvPath"),
                '_label -> "Input your download path"
            )),format.raw/*48.14*/("""

            """),format.raw/*50.13*/("""<div class="submit">
            <input type="submit" id="submit" value="download">
            </div>
        </fieldset>

        """)))}),format.raw/*55.10*/("""
      """)))}),format.raw/*56.8*/("""
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
object kmeans extends kmeans_Scope0.kmeans_Scope1.kmeans
              /*
                  -- GENERATED --
                  DATE: Mon Jan 02 20:51:41 PHT 2017
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/mlTrans/kmeans.scala.html
                  HASH: a23a386d3dde575ef08507741b847cf8e47150b0
                  MATRIX: 686->19|968->205|995->207|1049->253|1088->255|1118->260|1146->280|1185->282|1216->287|1262->308|1316->354|1355->356|1388->363|1480->428|1624->551|1662->562|1797->676|1834->686|1983->805|2017->809|2048->814|2078->835|2118->837|2150->842|2205->871|2237->887|2277->889|2311->896|2356->914|2378->915|2408->918|2441->930|2477->936|2509->941|2554->959|2595->979|2624->980|2671->1001|2724->1045|2764->1047|2801->1057|2853->1100|2893->1102|2929->1111|3030->1185|3170->1304|3212->1318|3376->1451|3414->1459|3448->1463
                  LINES: 23->3|28->3|29->4|29->4|29->4|31->6|31->6|31->6|32->7|33->8|33->8|33->8|34->9|39->14|42->17|44->19|47->22|49->24|54->29|55->30|57->32|57->32|57->32|58->33|59->34|59->34|59->34|60->35|61->36|61->36|61->36|61->36|62->37|63->38|64->39|64->39|64->39|66->41|66->41|66->41|67->42|67->42|67->42|68->43|70->45|73->48|75->50|80->55|81->56|82->57
                  -- GENERATED --
              */
          