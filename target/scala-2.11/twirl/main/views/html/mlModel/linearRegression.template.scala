
package views.html.mlModel

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object linearRegression_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object linearRegression_Scope1 {
import helper._
import util.Utilities

class linearRegression extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Form[scala.Tuple4[String, String, String, String]],List[String],RegressionModel,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(param: Form[(String, String, String, String)], pre2data: List[String], regResult: RegressionModel,user:String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.142*/("""
"""),_display_(/*4.2*/main(title = "Linear Regression",test = user)/*4.47*/ {_display_(Seq[Any](format.raw/*4.49*/("""
  """),format.raw/*5.3*/("""<script src='"""),_display_(/*5.17*/routes/*5.23*/.Assets.at("javascripts/d3/scatter.js")),format.raw/*5.62*/("""'></script>

  <script src="http://labratrevenge.com/d3-tip/javascripts/d3.tip.v0.6.3.js"></script>
  <script src=""""),_display_(/*8.17*/routes/*8.23*/.Assets.at("javascripts/d3/box.js")),format.raw/*8.58*/(""""></script>
  <script src=""""),_display_(/*9.17*/routes/*9.23*/.Assets.at("javascripts/d3/bar_hori.js")),format.raw/*9.63*/(""""></script>
  <script src=""""),_display_(/*10.17*/routes/*10.23*/.Assets.at("javascripts/d3/histo.js")),format.raw/*10.60*/(""""></script>
  <link rel="stylesheet" href=""""),_display_(/*11.33*/routes/*11.39*/.Assets.at("stylesheets/d3/scatter.css")),format.raw/*11.79*/("""">
  <link rel="stylesheet" media="screen" href=""""),_display_(/*12.48*/routes/*12.54*/.Assets.at("stylesheets/d3/hist.css")),format.raw/*12.91*/("""">
  <style>
  .tick line"""),format.raw/*14.13*/("""{"""),format.raw/*14.14*/("""
  """),format.raw/*15.3*/("""opacity: 0.1;
  """),format.raw/*16.3*/("""}"""),format.raw/*16.4*/("""
  """),format.raw/*17.3*/("""</style>

  """),_display_(/*19.4*/if(pre2data != null)/*19.24*/ {_display_(Seq[Any](format.raw/*19.26*/("""

    """),format.raw/*21.5*/("""<h3>Linear Regression</h3>
    """),_display_(/*22.6*/form(action = routes.Regression.callRegression,'class -> "registration_form")/*22.83*/ {_display_(Seq[Any](format.raw/*22.85*/("""



      """),format.raw/*26.7*/("""<fieldset>

        <legend>Input Parameters</legend>
        """),_display_(/*29.10*/select(
          field = param("inputpath"),
          options(pre2data),
          '_label -> "Select your parquet name")),format.raw/*32.49*/("""
        """),format.raw/*36.13*/("""
        """),_display_(/*37.10*/inputText(
        //param("maxIter").copy(value=Some("10")),
          field = param("maxIter").copy(value = Some("10")),
          args = '_label -> "MaxIter",  'placeholder -> "10",'value -> "10"
        )),format.raw/*41.10*/("""
        """),_display_(/*42.10*/inputText(
          field = param("regParam").copy(value = Some("0.3")),

          args = '_label -> "Reg Param", 'placeholder -> "0.3", 'value -> "0.3"
        )),format.raw/*46.10*/("""
        """),_display_(/*47.10*/inputText(
          field = param("elaParam").copy(value = Some("0.8")),
          args = '_label -> "Elastic Param", 'placeholder -> "0.8", 'value -> "0.8"
        )),format.raw/*50.10*/("""


        """),format.raw/*53.9*/("""<div class="submit">
          <input type="submit" id="submit" value="submit">
        </div>
      </fieldset>
    """)))}),format.raw/*57.6*/("""

  """)))}),format.raw/*59.4*/("""

  """),_display_(/*61.4*/if(regResult != null)/*61.25*/ {_display_(Seq[Any](format.raw/*61.27*/("""
    """),format.raw/*62.5*/("""<h2>Linear Regression</h2>
    <h3>Coefficient</h3>
    <div class="col-sm-6" id="coef">  </div><br>

    <script>

            var coef = """),_display_(/*68.25*/Html(regResult.coefficients)),format.raw/*68.53*/(""";
            d3.select('#coef' ).datum(coef).call(bar());
            //--------coefficient table-----------------------------
            var table = document.createElement('table');
            table.setAttribute('class','table-style-three')

            //thead
            var tr1 = document.createElement('tr');
            var column_num = coef.length+1;

            var th=[];
            th[0]=document.createElement('th');
            th[0].appendChild(document.createTextNode('intercept'));
            tr1.appendChild(th[0]);
            for(i=1;i<column_num;i++)
            """),format.raw/*83.13*/("""{"""),format.raw/*83.14*/("""
              """),format.raw/*84.15*/("""th[i] =document.createElement('th');
              th[i].appendChild(document.createTextNode(coef[i-1]['coef']));
              tr1.appendChild(th[i]);
            """),format.raw/*87.13*/("""}"""),format.raw/*87.14*/("""
            """),format.raw/*88.13*/("""table.appendChild(tr1);

            var tr2 = document.createElement('tr');
            var td=[];
            td[0]=document.createElement('td');
            td[0].appendChild(document.createTextNode("""),_display_(/*93.56*/regResult/*93.65*/.intercept),format.raw/*93.75*/("""));
            tr2.appendChild(td[0]);
            for(i=1;i<column_num;i++)
            """),format.raw/*96.13*/("""{"""),format.raw/*96.14*/("""
              """),format.raw/*97.15*/("""td[i] =document.createElement('td');
              td[i].appendChild(document.createTextNode(coef[i-1]['count']));
              tr2.appendChild(td[i]);
            """),format.raw/*100.13*/("""}"""),format.raw/*100.14*/("""
            """),format.raw/*101.13*/("""table.appendChild(tr2);
            document.body.appendChild(table);
    </script>

    <h3>Scatter Plot: Residual </h3>
    <div class="col-sm-6" id="scatter">  </div><br>
    <h3>Scatter Plot: Real x Prediction </h3>
    <div class="col-sm-6" id="scatter2">  </div><br>
    <h3>Residual Histogram </h3>
    <div class="col-sm-6" id="reshist">  </div><br>
    <h3>Residual Boxplot </h3>
    <div class="col-sm-6" id="resbox">  </div><br>
    <script>
    //-------------------------------------
    var residual_label="""),format.raw/*115.24*/("""{"""),format.raw/*115.25*/("""
      """),format.raw/*116.7*/(""""label":"""),_display_(/*116.16*/regResult/*116.25*/.labelJson),format.raw/*116.35*/(""" """),format.raw/*116.36*/(""",
      "residual": """),_display_(/*117.20*/regResult/*117.29*/.residualJson),format.raw/*117.42*/("""}"""),format.raw/*117.43*/("""

    """),format.raw/*119.5*/("""//tag 2 horizontal
    d3.select('#scatter').datum(residual_label).call(scatter(2));


    var label_predict="""),format.raw/*123.23*/("""{"""),format.raw/*123.24*/("""
      """),format.raw/*124.7*/(""""label":"""),_display_(/*124.16*/regResult/*124.25*/.labelJson),format.raw/*124.35*/(""" """),format.raw/*124.36*/(""",
      "prediction": """),_display_(/*125.22*/regResult/*125.31*/.predictionJson),format.raw/*125.46*/("""}"""),format.raw/*125.47*/("""

    """),format.raw/*127.5*/("""d3.select('#scatter2').datum(label_predict).call(scatter(1));


    var resHistJson ="""),_display_(/*130.23*/Html(regResult.resHistJson)),format.raw/*130.50*/("""
            """),format.raw/*131.13*/("""d3.select('#reshist').datum(resHistJson).call(histogram());

    var data = """),_display_(/*133.17*/Html(regResult.resBoxJson)),format.raw/*133.43*/("""
    """),format.raw/*134.5*/("""var boxplotData =[], count =0;
    var d=[];
    for (var property in data)
    """),format.raw/*137.5*/("""{"""),format.raw/*137.6*/("""
      """),format.raw/*138.7*/("""d.push(property);
      count++;
    """),format.raw/*140.5*/("""}"""),format.raw/*140.6*/("""
    """),format.raw/*141.5*/("""for(var j = 0;j<count;j++)"""),format.raw/*141.31*/("""{"""),format.raw/*141.32*/("""
      """),format.raw/*142.7*/("""boxplotData[j]=[];
      boxplotData[j][0]=d[j];
      boxplotData[j][1] = data[d[j]]
    """),format.raw/*145.5*/("""}"""),format.raw/*145.6*/("""
    """),format.raw/*146.5*/("""d3.select('#resbox').datum(boxplotData).call(boxplot(count));



    // var residual = """),_display_(/*150.24*/regResult/*150.33*/.residualJson),format.raw/*150.46*/("""
    """),format.raw/*151.5*/("""// var prediction = """),_display_(/*151.26*/regResult/*151.35*/.predictionJson),format.raw/*151.50*/("""
    """),format.raw/*152.5*/("""// var label = """),_display_(/*152.21*/regResult/*152.30*/.labelJson),format.raw/*152.40*/("""


    """),format.raw/*155.5*/("""</script>



    <!--<br>
    pvalues = """),_display_(/*160.16*/regResult/*160.25*/.pValues),format.raw/*160.33*/("""
    """),format.raw/*161.5*/("""<br>
    coefficientStandardErrors = """),_display_(/*162.34*/regResult/*162.43*/.coefficientStandardErrors),format.raw/*162.69*/("""
    """),format.raw/*163.5*/("""-->
    <br>
    Mean Squared Error = """),_display_(/*165.27*/regResult/*165.36*/.meanSquaredError),format.raw/*165.53*/("""
    """),format.raw/*166.5*/("""<br>
    Total Iteration = """),_display_(/*167.24*/regResult/*167.33*/.totalIter),format.raw/*167.43*/("""
    """),format.raw/*168.5*/("""<br>



  """),_display_(/*172.4*/if(user!="NULL")/*172.20*/{_display_(Seq[Any](format.raw/*172.21*/("""
    """),_display_(/*173.6*/form(action = routes.Simple.saveModel)/*173.44*/ {_display_(Seq[Any](format.raw/*173.46*/("""

"""),format.raw/*175.1*/("""<<<<<<< HEAD
      <input type="text" name="outputFolder" required="required"> <br>
=======
        <h3>Save Model as: </h3>
      <input type="text" name="outputFolder" value="lrModel"> <br>
>>>>>>> 3d8d556ccd9e53f3b5e8213d2f0405bcc40575b9
      <input type="hidden" name ="timestamp" value=""""),_display_(/*181.54*/regResult/*181.63*/.timestamp),format.raw/*181.73*/("""" ><br>
      <input type="hidden" name = "type" value=""""),_display_(/*182.50*/Utilities/*182.59*/.linearModel),format.raw/*182.71*/("""" ><br>

      <p class="buttons">
        <input type="submit" id="submit">
      </p>
    """)))}),format.raw/*187.6*/("""
  """)))}),format.raw/*188.4*/("""
  """)))}),format.raw/*189.4*/("""
""")))}))
      }
    }
  }

  def render(param:Form[scala.Tuple4[String, String, String, String]],pre2data:List[String],regResult:RegressionModel,user:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(param,pre2data,regResult,user)(messages)

  def f:((Form[scala.Tuple4[String, String, String, String]],List[String],RegressionModel,String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (param,pre2data,regResult,user) => (messages) => apply(param,pre2data,regResult,user)(messages)

  def ref: this.type = this

}


}
}

/**/
object linearRegression extends linearRegression_Scope0.linearRegression_Scope1.linearRegression
              /*
                  -- GENERATED --
                  DATE: Fri Jan 06 14:25:07 PHT 2017
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/mlModel/linearRegression.scala.html
                  HASH: 185f05e35949d19a8377d839b458204e0c7d42c3
                  MATRIX: 723->41|959->181|986->183|1039->228|1078->230|1107->233|1147->247|1161->253|1220->292|1362->408|1376->414|1431->449|1485->477|1499->483|1559->523|1614->551|1629->557|1687->594|1758->638|1773->644|1834->684|1911->734|1926->740|1984->777|2037->802|2066->803|2096->806|2139->822|2167->823|2197->826|2236->839|2265->859|2305->861|2338->867|2396->899|2482->976|2522->978|2559->988|2649->1051|2793->1174|2830->1325|2867->1335|3096->1543|3133->1553|3318->1717|3355->1727|3543->1894|3581->1905|3729->2023|3764->2028|3795->2033|3825->2054|3865->2056|3897->2061|4064->2201|4113->2229|4730->2818|4759->2819|4802->2834|4994->2998|5023->2999|5064->3012|5294->3215|5312->3224|5343->3234|5461->3324|5490->3325|5533->3340|5727->3505|5757->3506|5799->3519|6348->4039|6378->4040|6413->4047|6450->4056|6469->4065|6501->4075|6531->4076|6580->4097|6599->4106|6634->4119|6664->4120|6698->4126|6836->4235|6866->4236|6901->4243|6938->4252|6957->4261|6989->4271|7019->4272|7070->4295|7089->4304|7126->4319|7156->4320|7190->4326|7304->4412|7353->4439|7395->4452|7500->4529|7548->4555|7581->4560|7689->4640|7718->4641|7753->4648|7818->4685|7847->4686|7880->4691|7935->4717|7965->4718|8000->4725|8118->4815|8147->4816|8180->4821|8296->4909|8315->4918|8350->4931|8383->4936|8432->4957|8451->4966|8488->4981|8521->4986|8565->5002|8584->5011|8616->5021|8651->5028|8720->5069|8739->5078|8769->5086|8802->5091|8868->5129|8887->5138|8935->5164|8968->5169|9035->5208|9054->5217|9093->5234|9126->5239|9182->5267|9201->5276|9233->5286|9266->5291|9304->5302|9330->5318|9370->5319|9403->5325|9451->5363|9492->5365|9522->5367|9844->5661|9863->5670|9895->5680|9980->5737|9999->5746|10033->5758|10157->5851|10192->5855|10227->5859
                  LINES: 24->3|29->3|30->4|30->4|30->4|31->5|31->5|31->5|31->5|34->8|34->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|37->11|37->11|37->11|38->12|38->12|38->12|40->14|40->14|41->15|42->16|42->16|43->17|45->19|45->19|45->19|47->21|48->22|48->22|48->22|52->26|55->29|58->32|59->36|60->37|64->41|65->42|69->46|70->47|73->50|76->53|80->57|82->59|84->61|84->61|84->61|85->62|91->68|91->68|106->83|106->83|107->84|110->87|110->87|111->88|116->93|116->93|116->93|119->96|119->96|120->97|123->100|123->100|124->101|138->115|138->115|139->116|139->116|139->116|139->116|139->116|140->117|140->117|140->117|140->117|142->119|146->123|146->123|147->124|147->124|147->124|147->124|147->124|148->125|148->125|148->125|148->125|150->127|153->130|153->130|154->131|156->133|156->133|157->134|160->137|160->137|161->138|163->140|163->140|164->141|164->141|164->141|165->142|168->145|168->145|169->146|173->150|173->150|173->150|174->151|174->151|174->151|174->151|175->152|175->152|175->152|175->152|178->155|183->160|183->160|183->160|184->161|185->162|185->162|185->162|186->163|188->165|188->165|188->165|189->166|190->167|190->167|190->167|191->168|195->172|195->172|195->172|196->173|196->173|196->173|198->175|204->181|204->181|204->181|205->182|205->182|205->182|210->187|211->188|212->189
                  -- GENERATED --
              */
          