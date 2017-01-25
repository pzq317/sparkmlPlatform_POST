
package views.html.mlModel

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
import util.Utilities

class kmeans extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Form[scala.Tuple2[String, String]],List[String],List[String],String,String,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(myForm: Form[(String, String)], parquetlist: List[String], center: List[String],result:String,user:String,timestamp:String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.155*/("""


  """),_display_(/*6.4*/main(title = "Kmeans",test = user)/*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""
  """),format.raw/*7.3*/("""<script src=""""),_display_(/*7.17*/routes/*7.23*/.Assets.at("javascripts/d3/pairs.js")),format.raw/*7.60*/("""" type="text/javascript"></script>
  <link rel="stylesheet" media="screen" href=""""),_display_(/*8.48*/routes/*8.54*/.Assets.at("stylesheets/d3/pairs.css")),format.raw/*8.92*/("""">
  <link rel="stylesheet" media="screen" href=""""),_display_(/*9.48*/routes/*9.54*/.Assets.at("stylesheets/d3/bar.css")),format.raw/*9.90*/("""">
  <script src='"""),_display_(/*10.17*/routes/*10.23*/.Assets.at("javascripts/d3/bar.js")),format.raw/*10.58*/("""'></script>




    <h3>Kmeans</h3>
    """),_display_(/*16.6*/if(parquetlist != null)/*16.29*/ {_display_(Seq[Any](format.raw/*16.31*/("""
      """),_display_(/*17.8*/form(action = routes.Clustering.callKmeans)/*17.51*/ {_display_(Seq[Any](format.raw/*17.53*/("""
        """),format.raw/*18.9*/("""<fieldset>

          <legend>Input Parameters</legend>
          """),_display_(/*21.12*/select(
            field = myForm("path"),
            options(parquetlist),
            '_label -> "Select your parquet name")),format.raw/*24.51*/("""

          """),_display_(/*26.12*/inputText(
            field = myForm("k").copy(value=Some("3")),
            args = '_label -> "k", 'placeholder -> "3"
          )),format.raw/*29.12*/("""


          """),format.raw/*32.11*/("""<div class="submit">
            <input type="submit" id="submit" value="submit">
          </div>
        </fieldset>
      """)))}),format.raw/*36.8*/("""
    """)))}),format.raw/*37.6*/("""

  """),_display_(/*39.4*/if(center != null)/*39.22*/ {_display_(Seq[Any](format.raw/*39.24*/("""
    """),format.raw/*40.5*/("""center= <br/>
    """),_display_(/*41.6*/for( item<-center) yield /*41.24*/{_display_(Seq[Any](format.raw/*41.25*/("""
        """),_display_(/*42.10*/item),format.raw/*42.14*/(""" """),format.raw/*42.15*/("""<br/>
    """)))}),format.raw/*43.6*/("""



  """)))}),format.raw/*47.4*/("""

  """),_display_(/*49.4*/if(result != null)/*49.22*/ {_display_(Seq[Any](format.raw/*49.24*/("""

    """),format.raw/*51.5*/("""<div class="col-sm-12" id="scattermatrix"></div>
    <script>
            var data = """),_display_(/*53.25*/Html(result)),format.raw/*53.37*/("""

            """),_display_(/*55.14*/if(result.size<20000)/*55.35*/ {_display_(Seq[Any](format.raw/*55.37*/("""
                """),format.raw/*56.17*/("""//println(data.length)

              d3.select('#scattermatrix').datum(data).call(scattermatrix());
               //console.log(data.prediction)
               //println(result)
              //console.log(data.columnNumber)
            """)))}/*62.14*/else/*62.18*/{_display_(Seq[Any](format.raw/*62.19*/("""
              """),format.raw/*63.15*/("""//println(result)
              //d3.select().datum(data).call(scattermatrix());
              //console.log(data.prediction)
              //println(result)
              //console.log(data)
            """)))}),format.raw/*68.14*/("""
    """),format.raw/*69.5*/("""</script>
    """),_display_(/*70.6*/if(user!="NULL")/*70.22*/{_display_(Seq[Any](format.raw/*70.23*/("""
    """),_display_(/*71.6*/form(action = routes.Simple.saveModel)/*71.44*/ {_display_(Seq[Any](format.raw/*71.46*/("""



      """),format.raw/*75.7*/("""<h3>Save Model as: </h3>
      <!--<input type="text" name="outputFolder" value="kmeansModel"> <br>
      <input type="hidden" name ="timestamp" value="NULL" ><br>-->
      <input type="text" name="outputFolder" required="required"> <br>
      <input type="hidden" name ="timestamp" value="""),_display_(/*79.53*/timestamp),format.raw/*79.62*/(""" """),format.raw/*79.63*/("""><br>
      <input type="hidden" name = "type" value=""""),_display_(/*80.50*/Utilities/*80.59*/.kmeansModel),format.raw/*80.71*/("""" ><br>

      <p class="buttons">
        <input type="submit" id="submit">
      </p>
    """)))}),format.raw/*85.6*/("""
    """)))}),format.raw/*86.6*/("""

  """)))}),format.raw/*88.4*/("""
""")))}))
      }
    }
  }

  def render(myForm:Form[scala.Tuple2[String, String]],parquetlist:List[String],center:List[String],result:String,user:String,timestamp:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(myForm,parquetlist,center,result,user,timestamp)(messages)

  def f:((Form[scala.Tuple2[String, String]],List[String],List[String],String,String,String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (myForm,parquetlist,center,result,user,timestamp) => (messages) => apply(myForm,parquetlist,center,result,user,timestamp)(messages)

  def ref: this.type = this

}


}
}

/**/
object kmeans extends kmeans_Scope0.kmeans_Scope1.kmeans
              /*
                  -- GENERATED --
                  DATE: Sun Jan 15 21:13:27 PHT 2017
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/mlModel/kmeans.scala.html
                  HASH: 4764193b295c43abc2ea4807cb9733614df32519
                  MATRIX: 688->41|937->194|968->200|1010->234|1049->236|1078->239|1118->253|1132->259|1189->296|1297->378|1311->384|1369->422|1445->472|1459->478|1515->514|1561->533|1576->539|1632->574|1699->615|1731->638|1771->640|1805->648|1857->691|1897->693|1933->702|2027->769|2176->897|2216->910|2369->1042|2410->1055|2566->1181|2602->1187|2633->1192|2660->1210|2700->1212|2732->1217|2777->1236|2811->1254|2850->1255|2887->1265|2912->1269|2941->1270|2982->1281|3019->1288|3050->1293|3077->1311|3117->1313|3150->1319|3263->1405|3296->1417|3338->1432|3368->1453|3408->1455|3453->1472|3712->1712|3725->1716|3764->1717|3807->1732|4043->1937|4075->1942|4116->1957|4141->1973|4180->1974|4212->1980|4259->2018|4299->2020|4336->2030|4653->2320|4683->2329|4712->2330|4794->2385|4812->2394|4845->2406|4968->2499|5004->2505|5039->2510
                  LINES: 24->3|29->3|32->6|32->6|32->6|33->7|33->7|33->7|33->7|34->8|34->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|42->16|42->16|42->16|43->17|43->17|43->17|44->18|47->21|50->24|52->26|55->29|58->32|62->36|63->37|65->39|65->39|65->39|66->40|67->41|67->41|67->41|68->42|68->42|68->42|69->43|73->47|75->49|75->49|75->49|77->51|79->53|79->53|81->55|81->55|81->55|82->56|88->62|88->62|88->62|89->63|94->68|95->69|96->70|96->70|96->70|97->71|97->71|97->71|101->75|105->79|105->79|105->79|106->80|106->80|106->80|111->85|112->86|114->88
                  -- GENERATED --
              */
          