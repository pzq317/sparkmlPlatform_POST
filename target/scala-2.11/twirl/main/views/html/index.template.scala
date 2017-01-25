
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object index_Scope1 {
import play.api.mvc.Session

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.15*/("""
"""),format.raw/*4.1*/("""<!--<div align="right">Welcome user </div>-->

    """),_display_(/*6.6*/main(title = "User Guide",test = user)/*6.44*/{_display_(Seq[Any](format.raw/*6.45*/("""
    """),format.raw/*7.5*/("""<br>
    <a href = "#step1">Step 1: Import Data from HDFS</a>
    <br>
    <a href = "#step2">Step 2: Convert Dataframe to Vector</a>
    <br>
    <a href = "#step3">Step 3: Build machine learning Model</a>
    <br>
    <a href = "#step4">Step 4: Using your model to predict result</a>
    <br>
<h2 id="step1">Step 1: Import Data from HDFS</h2>

        <h3>輸入要匯入的csv檔案在hdfs中的路徑</h3>
    <img src=""""),_display_(/*19.16*/routes/*19.22*/.Assets.at("images/UserGuide/1.1pre.png")),format.raw/*19.63*/("""">
    <h3>將會看到correlation matrix以及Summary Statistics基本統計資訊</h3>
    <img src=""""),_display_(/*21.16*/routes/*21.22*/.Assets.at("images/UserGuide/1.2correlation.png")),format.raw/*21.71*/("""">
    <h3>Feature數目多的時候，Correlation Matrix以heat map表示</h3>
    <img src=""""),_display_(/*23.16*/routes/*23.22*/.Assets.at("images/UserGuide/1.3correlation.png")),format.raw/*23.71*/("""">
    <h3>轉換數值與類別型態，並選擇不必要的欄位</h3>
    <img src=""""),_display_(/*25.16*/routes/*25.22*/.Assets.at("images/UserGuide/1.4summary.png")),format.raw/*25.67*/("""">
    <br>
  <h2  id="step2">Step 2: Convert Dataframe to Vector</h2>
    <h3>選擇經過前處理的DataFrame</h3>
    <img src=""""),_display_(/*29.16*/routes/*29.22*/.Assets.at("images/UserGuide/2.1pre2.png")),format.raw/*29.64*/("""">

    <h3>選擇label(Unsupervised learning可不選)，將features轉換成vector</h3>
    <img src=""""),_display_(/*32.16*/routes/*32.22*/.Assets.at("images/UserGuide/2.2visual.png")),format.raw/*32.66*/("""">
    <br>
    <h2  id="step3">Step 3: Build machine learning Model</h2>
        <h3>選擇Machine learning演算法</h3>
    <img src=""""),_display_(/*36.16*/routes/*36.22*/.Assets.at("images/UserGuide/3.1lr.png")),format.raw/*36.62*/("""">

    <h3>Model資訊視覺化呈現</h3>
    <img src=""""),_display_(/*39.16*/routes/*39.22*/.Assets.at("images/UserGuide/3.2visual.png")),format.raw/*39.66*/("""">
    <br>
    <h2  id="step4">Step 4: Using your model to predict result</h2>
    """)))}))
      }
    }
  }

  def render(user:String): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Fri Jan 06 15:12:07 PHT 2017
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/index.scala.html
                  HASH: 97e8e7d8b808ff178d466d589c14aae5b2ee0aac
                  MATRIX: 583->31|691->44|718->45|795->97|841->135|879->136|910->141|1336->540|1351->546|1413->587|1520->667|1535->673|1605->722|1707->797|1722->803|1792->852|1870->903|1885->909|1951->954|2095->1071|2110->1077|2173->1119|2285->1204|2300->1210|2365->1254|2520->1382|2535->1388|2596->1428|2668->1473|2683->1479|2748->1523
                  LINES: 23->3|28->3|29->4|31->6|31->6|31->6|32->7|44->19|44->19|44->19|46->21|46->21|46->21|48->23|48->23|48->23|50->25|50->25|50->25|54->29|54->29|54->29|57->32|57->32|57->32|61->36|61->36|61->36|64->39|64->39|64->39
                  -- GENERATED --
              */
          