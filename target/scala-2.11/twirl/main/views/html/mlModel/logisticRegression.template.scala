
package views.html.mlModel

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logisticRegression_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object logisticRegression_Scope1 {
import helper._
import util.Utilities

class logisticRegression extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Form[scala.Tuple4[String, String, String, String]],List[String],logRegModel,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(param: Form[(String, String, String, String)], pre2data: List[String], regResult: logRegModel,user:String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.138*/("""
    """),_display_(/*4.6*/main(title = "Logistic Regression",test = user)/*4.53*/ {_display_(Seq[Any](format.raw/*4.55*/("""

        """),_display_(/*6.10*/if(pre2data != null)/*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""
            """),_display_(/*7.14*/form(action = routes.Classification.callLogistic())/*7.65*/ {_display_(Seq[Any](format.raw/*7.67*/("""

                """),format.raw/*9.17*/("""<h3>Logistic Regression</h3>


                <fieldset>

                    <legend>Input Parameters</legend>

                    """),_display_(/*16.22*/select(
                        field = param("inputpath"),
                        options(pre2data),
                        '_label -> "Select your parquet name")),format.raw/*19.63*/("""
                    """),format.raw/*23.25*/("""
                    """),_display_(/*24.22*/inputText(
                        field = param("maxIter").copy(value = Some("10")),
                        args = '_label -> "MaxIter", 'placeholder -> "10", 'value -> "10"
                    )),format.raw/*27.22*/("""
                    """),_display_(/*28.22*/inputText(
                        field = param("regParam").copy(value = Some("0.3")),
                        args = '_label -> "Reg Param", 'placeholder -> "0.3", 'value -> "0.3"
                    )),format.raw/*31.22*/("""
                    """),_display_(/*32.22*/inputText(
                        field = param("elaParam").copy(value = Some("0.8")),
                        args = '_label -> "Elastic Param", 'placeholder -> "0.8", 'value -> "0.8"
                    )),format.raw/*35.22*/("""
                    """),format.raw/*36.21*/("""<div class="submit">
                        <input type="submit" id="submit" value="submit">
                    </div>
                </fieldset>

            """)))}),format.raw/*41.14*/("""
        """)))}),format.raw/*42.10*/("""

        """),_display_(/*44.10*/if(regResult != null)/*44.31*/ {_display_(Seq[Any](format.raw/*44.33*/("""
            """),format.raw/*45.13*/("""<script src='"""),_display_(/*45.27*/routes/*45.33*/.Assets.at("javascripts/d3/ROC.js")),format.raw/*45.68*/("""'></script>
            <script src='"""),_display_(/*46.27*/routes/*46.33*/.Assets.at("javascripts/d3/TPRFPR.js")),format.raw/*46.71*/("""'></script>
            <script src=""""),_display_(/*47.27*/routes/*47.33*/.Assets.at("javascripts/d3/bar_hori.js")),format.raw/*47.73*/(""""></script>
            <style>
            .tick line"""),format.raw/*49.23*/("""{"""),format.raw/*49.24*/("""
            """),format.raw/*50.13*/("""opacity: 0.1;
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/("""
            """),format.raw/*52.13*/("""</style>
            <script src="http://labratrevenge.com/d3-tip/javascripts/d3.tip.v0.6.3.js"></script>
            <link rel="stylesheet" type="text/css" href=""""),_display_(/*54.59*/routes/*54.65*/.Assets.at("stylesheets/d3/roc.css")),format.raw/*54.101*/("""">
            <h2>Logistic Regression</h2>
            <h3>Coefficient</h3>
            <div class="col-sm-6" id="coef">  </div><br>

            <script>

                    var coef = """),_display_(/*61.33*/Html(regResult.coefficients)),format.raw/*61.61*/(""";
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
                    """),format.raw/*76.21*/("""{"""),format.raw/*76.22*/("""
                        """),format.raw/*77.25*/("""th[i] =document.createElement('th');
                        th[i].appendChild(document.createTextNode(coef[i-1]['coef']));
                        tr1.appendChild(th[i]);
                    """),format.raw/*80.21*/("""}"""),format.raw/*80.22*/("""
                    """),format.raw/*81.21*/("""table.appendChild(tr1);

                    var tr2 = document.createElement('tr');
                    var td=[];
                    td[0]=document.createElement('td');
                    td[0].appendChild(document.createTextNode("""),_display_(/*86.64*/regResult/*86.73*/.intercept),format.raw/*86.83*/("""));
                    tr2.appendChild(td[0]);
                    for(i=1;i<column_num;i++)
                    """),format.raw/*89.21*/("""{"""),format.raw/*89.22*/("""
                        """),format.raw/*90.25*/("""td[i] =document.createElement('td');
                        td[i].appendChild(document.createTextNode(coef[i-1]['count']));
                        tr2.appendChild(td[i]);
                    """),format.raw/*93.21*/("""}"""),format.raw/*93.22*/("""
                    """),format.raw/*94.21*/("""table.appendChild(tr2);
                    document.body.appendChild(table);
            </script>
            <br>
            <h3>ROC Curve</h3>
            <h4>area under ROC = """),_display_(/*99.35*/regResult/*99.44*/.areaUnderROC),format.raw/*99.57*/("""</h4>
            <div class="col-sm-12" id="ROC"></div>   <br>

            <h3>TPR FPR  F-measurement</h3>
            <div class="col-sm-12" id="c2486"></div>   <br>



            <script>



                    /*==============================ROC==================*/
                    var data9 = """),format.raw/*112.33*/("""{"""),format.raw/*112.34*/("""
                        """),format.raw/*113.25*/(""""TPR":["""),_display_(/*113.33*/regResult/*113.42*/.TPR),format.raw/*113.46*/("""],
                        "FPR":["""),_display_(/*114.33*/regResult/*114.42*/.FPR),format.raw/*114.46*/("""]
                    """),format.raw/*115.21*/("""}"""),format.raw/*115.22*/(""";
                    d3.select('#ROC').datum(data9).call(Roc());
                    /*=====================================2486chart==========================*/
                    var data10 = """),format.raw/*118.34*/("""{"""),format.raw/*118.35*/("""
                        """),format.raw/*119.25*/(""""threshold": ["""),_display_(/*119.40*/regResult/*119.49*/.threshold),format.raw/*119.59*/("""],
                        "recall": ["""),_display_(/*120.37*/regResult/*120.46*/.recallJson),format.raw/*120.57*/("""],
                        "precise": ["""),_display_(/*121.38*/regResult/*121.47*/.precisionJson),format.raw/*121.61*/("""],
                        "fmeasure": ["""),_display_(/*122.39*/regResult/*122.48*/.fmeasureJson),format.raw/*122.61*/("""],
                        "neutralLine":["""),_display_(/*123.41*/regResult/*123.50*/.bestTH),format.raw/*123.57*/("""]
                    """),format.raw/*124.21*/("""}"""),format.raw/*124.22*/(""";
                    d3.select('#c2486').datum(data10).call(c2486());



            </script>

            """),_display_(/*131.14*/if(user!="NULL")/*131.30*/{_display_(Seq[Any](format.raw/*131.31*/("""
                """),_display_(/*132.18*/form(action = routes.Simple.saveModel)/*132.56*/ {_display_(Seq[Any](format.raw/*132.58*/("""
"""),format.raw/*133.1*/("""<<<<<<< HEAD

                    <input type="text" name="outputFolder" required="required"> <br>
=======
                    <h3>Save Model as: </h3>
                    <input type="text" name="outputFolder" value="logRegModel"> <br>
>>>>>>> 3d8d556ccd9e53f3b5e8213d2f0405bcc40575b9
                    <input type="hidden" name ="timestamp" value=""""),_display_(/*140.68*/regResult/*140.77*/.timestamp),format.raw/*140.87*/("""" ><br>
                    <input type="hidden" name = "type" value=""""),_display_(/*141.64*/Utilities/*141.73*/.logisticModel),format.raw/*141.87*/("""" ><br>

                    <p class="buttons">
                    <input type="submit" id="submit">
                    </p>
                """)))}),format.raw/*146.18*/("""

            """)))}),format.raw/*148.14*/("""
        """)))}),format.raw/*149.10*/("""
    """)))}))
      }
    }
  }

  def render(param:Form[scala.Tuple4[String, String, String, String]],pre2data:List[String],regResult:logRegModel,user:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(param,pre2data,regResult,user)(messages)

  def f:((Form[scala.Tuple4[String, String, String, String]],List[String],logRegModel,String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (param,pre2data,regResult,user) => (messages) => apply(param,pre2data,regResult,user)(messages)

  def ref: this.type = this

}


}
}

/**/
object logisticRegression extends logisticRegression_Scope0.logisticRegression_Scope1.logisticRegression
              /*
                  -- GENERATED --
                  DATE: Fri Jan 06 14:25:07 PHT 2017
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/mlModel/logisticRegression.scala.html
                  HASH: 2224b24a6ffdfc3f0a1aea032d396729208a47b3
                  MATRIX: 725->41|957->177|988->183|1043->230|1082->232|1119->243|1147->263|1186->265|1226->279|1285->330|1324->332|1369->350|1531->485|1717->650|1766->849|1815->871|2033->1068|2082->1090|2306->1293|2355->1315|2583->1522|2632->1543|2826->1706|2867->1716|2905->1727|2935->1748|2975->1750|3016->1763|3057->1777|3072->1783|3128->1818|3193->1856|3208->1862|3267->1900|3332->1938|3347->1944|3408->1984|3490->2038|3519->2039|3560->2052|3614->2078|3643->2079|3684->2092|3875->2256|3890->2262|3948->2298|4164->2487|4213->2515|4934->3208|4963->3209|5016->3234|5236->3426|5265->3427|5314->3448|5576->3683|5594->3692|5625->3702|5767->3816|5796->3817|5849->3842|6070->4035|6099->4036|6148->4057|6357->4239|6375->4248|6409->4261|6742->4565|6772->4566|6826->4591|6862->4599|6881->4608|6907->4612|6970->4647|6989->4656|7015->4660|7066->4682|7096->4683|7321->4879|7351->4880|7405->4905|7448->4920|7467->4929|7499->4939|7566->4978|7585->4987|7618->4998|7686->5038|7705->5047|7741->5061|7810->5102|7829->5111|7864->5124|7935->5167|7954->5176|7983->5183|8034->5205|8064->5206|8202->5316|8228->5332|8268->5333|8314->5351|8362->5389|8403->5391|8432->5392|8813->5745|8832->5754|8864->5764|8963->5835|8982->5844|9018->5858|9195->6003|9242->6018|9284->6028
                  LINES: 24->3|29->3|30->4|30->4|30->4|32->6|32->6|32->6|33->7|33->7|33->7|35->9|42->16|45->19|46->23|47->24|50->27|51->28|54->31|55->32|58->35|59->36|64->41|65->42|67->44|67->44|67->44|68->45|68->45|68->45|68->45|69->46|69->46|69->46|70->47|70->47|70->47|72->49|72->49|73->50|74->51|74->51|75->52|77->54|77->54|77->54|84->61|84->61|99->76|99->76|100->77|103->80|103->80|104->81|109->86|109->86|109->86|112->89|112->89|113->90|116->93|116->93|117->94|122->99|122->99|122->99|135->112|135->112|136->113|136->113|136->113|136->113|137->114|137->114|137->114|138->115|138->115|141->118|141->118|142->119|142->119|142->119|142->119|143->120|143->120|143->120|144->121|144->121|144->121|145->122|145->122|145->122|146->123|146->123|146->123|147->124|147->124|154->131|154->131|154->131|155->132|155->132|155->132|156->133|163->140|163->140|163->140|164->141|164->141|164->141|169->146|171->148|172->149
                  -- GENERATED --
              */
          