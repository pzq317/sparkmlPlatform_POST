
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object lrsimple_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object lrsimple_Scope1 {
import helper._

class lrsimple extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[scala.Tuple4[String, String, String, String]],String,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(param: Form[(String, String, String, String)], regResult: String,user:String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.109*/("""
"""),_display_(/*3.2*/main(title = "Linear Regression",test = user)/*3.47*/ {_display_(Seq[Any](format.raw/*3.49*/("""


"""),_display_(/*6.2*/if(regResult == null)/*6.23*/ {_display_(Seq[Any](format.raw/*6.25*/("""

"""),format.raw/*8.1*/("""<h3>Linear Regression</h3>
"""),_display_(/*9.2*/form(action = routes.RegressionSimple.callRegression,'class -> "registration_form")/*9.85*/ {_display_(Seq[Any](format.raw/*9.87*/("""



"""),format.raw/*13.1*/("""<fieldset>

    <legend>Input Parameters</legend>

    """),_display_(/*17.6*/inputText(
    field = param("inputpath"),
    args = '_label -> "Regression -- csv path", 'placeholder -> "inputpath"
    )),format.raw/*20.6*/("""
    """),_display_(/*21.6*/inputText(

    field = param("maxIter"),
    args = '_label -> "MaxIter", 'value -> "10"
    )),format.raw/*25.6*/("""
    """),_display_(/*26.6*/inputText(
    field = param("regParam"),
    args = '_label -> "Reg Param", 'placeholder -> "0.3", 'value -> "0.3"
    )),format.raw/*29.6*/("""
    """),_display_(/*30.6*/inputText(
    field = param("elaParam"),
    args = '_label -> "Elastic Param", 'placeholder -> "0.8", 'value -> "0.8"
    )),format.raw/*33.6*/("""


    """),format.raw/*36.5*/("""<div class="submit">
        <input type="submit" id="submit" value="submit">
    </div>
</fieldset>
""")))}),format.raw/*40.2*/("""

""")))}),format.raw/*42.2*/("""

"""),_display_(/*44.2*/if(regResult != null)/*44.23*/ {_display_(Seq[Any](format.raw/*44.25*/("""
"""),format.raw/*45.1*/("""<h2>Linear Regression</h2>
<h3>Coefficient</h3>

<br>
"""),_display_(/*49.2*/regResult),format.raw/*49.11*/("""
"""),format.raw/*50.1*/("""<br>




""")))}),format.raw/*55.2*/("""
""")))}),format.raw/*56.2*/("""
"""))
      }
    }
  }

  def render(param:Form[scala.Tuple4[String, String, String, String]],regResult:String,user:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(param,regResult,user)(messages)

  def f:((Form[scala.Tuple4[String, String, String, String]],String,String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (param,regResult,user) => (messages) => apply(param,regResult,user)(messages)

  def ref: this.type = this

}


}
}

/**/
object lrsimple extends lrsimple_Scope0.lrsimple_Scope1.lrsimple
              /*
                  -- GENERATED --
                  DATE: Mon Dec 19 11:02:42 PHT 2016
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/lrsimple.scala.html
                  HASH: 17bbd47a1f60cec87ad2edfc94364aec10cb25b8
                  MATRIX: 647->18|850->125|877->127|930->172|969->174|998->178|1027->199|1066->201|1094->203|1147->231|1238->314|1277->316|1308->320|1390->376|1534->500|1566->506|1681->601|1713->607|1854->728|1886->734|2031->859|2065->866|2197->968|2230->971|2259->974|2289->995|2329->997|2357->998|2438->1053|2468->1062|2496->1063|2536->1073|2568->1075
                  LINES: 23->2|28->2|29->3|29->3|29->3|32->6|32->6|32->6|34->8|35->9|35->9|35->9|39->13|43->17|46->20|47->21|51->25|52->26|55->29|56->30|59->33|62->36|66->40|68->42|70->44|70->44|70->44|71->45|75->49|75->49|76->50|81->55|82->56
                  -- GENERATED --
              */
          