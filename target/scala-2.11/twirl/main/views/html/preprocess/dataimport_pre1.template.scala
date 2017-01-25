
package views.html.preprocess

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dataimport_pre1_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object dataimport_pre1_Scope1 {
import helper._

class dataimport_pre1 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template9[Form[scala.Tuple2[String, Boolean]],List[String],Form[scala.Tuple2[String, Boolean]],String,Seq[scala.Tuple2[String, String]],Form[StatSummary],String,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(guestSelect: Form[(String,Boolean)],data:List[String],csvInput: Form[(String,Boolean)],header:String,datatype: Seq[(String, String)], summary: Form[StatSummary],corMatrix:String,user:String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.222*/("""

"""),_display_(/*5.2*/main(title = "Input Radio Group Sample",test = user)/*5.54*/ {_display_(Seq[Any](format.raw/*5.56*/("""

    """),format.raw/*7.5*/("""<h3>Data Preprocess 1</h3>


    """),_display_(/*10.6*/if(datatype==null && summary==null && corMatrix ==null)/*10.61*/{_display_(Seq[Any](format.raw/*10.62*/("""
        """),_display_(/*11.10*/form(action = routes.Preprocess.preprocess1_summary())/*11.64*/ {_display_(Seq[Any](format.raw/*11.66*/("""
            """),format.raw/*12.13*/("""<fieldset>
                """),_display_(/*13.18*/if(user!="NULL")/*13.34*/ {_display_(Seq[Any](format.raw/*13.36*/("""
                    """),format.raw/*14.21*/("""<legend>Input Parameters</legend>
                    """),_display_(/*15.22*/inputText(
                        csvInput("path"),
                        '_label -> "CSV path",
                        'placeholder -> "path of your csv in hdfs"
                    )),format.raw/*19.22*/("""
                    """),_display_(/*20.22*/checkbox(
                        csvInput("header"),
                        /*'label->"Confirm:",'_text->"Is first line header?",*/ '_help -> ""
                    )),format.raw/*23.22*/("""
                """)))}/*24.18*/else/*24.22*/{_display_(Seq[Any](format.raw/*24.23*/("""
                    """),_display_(/*25.22*/select(
                        guestSelect("file"),
                        options(data),
                        '_label -> "file")),format.raw/*28.43*/("""
                    """),_display_(/*29.22*/checkbox(
                        guestSelect("header"),
                        /*'label->"Confirm:",'_text->"Is first line header?",*/ '_help -> ""
                    )),format.raw/*32.22*/("""

                """)))}),format.raw/*34.18*/("""
                """),format.raw/*35.17*/("""<div class="submit">
                    <input type="submit" id="submit" value="submit">
                </div>
            </fieldset>
        """)))}),format.raw/*39.10*/("""
    """)))}),format.raw/*40.6*/("""

    """),_display_(/*42.6*/if(datatype!=null && summary!=null && corMatrix !=null)/*42.61*/{_display_(Seq[Any](format.raw/*42.62*/("""
        """),format.raw/*43.9*/("""<script src=""""),_display_(/*43.23*/routes/*43.29*/.Assets.at("javascripts/d3/correlation.js")),format.raw/*43.72*/(""""></script>
        <link rel="stylesheet" href=""""),_display_(/*44.39*/routes/*44.45*/.Assets.at("stylesheets/d3/corr.css")),format.raw/*44.82*/("""">


        """),_display_(/*47.10*/if(corMatrix.size<5000)/*47.33*/ {_display_(Seq[Any](format.raw/*47.35*/("""
        """),format.raw/*48.9*/("""<h2> Correlation Matrix</h2>


        <b>InputFile Path: </b> """),_display_(/*51.34*/csvInput("path")/*51.50*/.value),format.raw/*51.56*/("""

        """),format.raw/*53.9*/("""<br>

        <div class="col-sm-12" id="correlation"></div>
        <script>

                var corData = """),_display_(/*58.32*/Html(corMatrix)),format.raw/*58.47*/("""
                """),format.raw/*59.17*/("""//println(corMatrix,corMatrix.size)

                d3.select('#correlation').datum(corData).call(heatmap());
            """)))}),format.raw/*62.14*/("""
        """),format.raw/*63.9*/("""</script>

        <br>
        <h2> Statistical Summary</h2>
        <h3> Convert column type and save it!</h3>
        <script>

                var form = document.createElement("form");
                form.method='POST';
                form.action = '"""),_display_(/*72.33*/routes/*72.39*/.Preprocess.preprocess1_rmcol),format.raw/*72.68*/("""';


                var inputFilename = document.createElement("input");
                inputFilename.type='hidden'
                inputFilename.value='"""),_display_(/*77.39*/csvInput("path")/*77.55*/.value),format.raw/*77.61*/("""'
                inputFilename.name = 'inputFile'
                form.appendChild(inputFilename);


                var header = document.createElement("input");
                header.type='hidden'
                header.value='"""),_display_(/*84.32*/header),format.raw/*84.38*/("""'
                header.name = 'header'
                form.appendChild(header);

                var mean = """),_display_(/*88.29*/summary/*88.36*/.get.mean),format.raw/*88.45*/("""
                """),format.raw/*89.17*/("""var max = """),_display_(/*89.28*/summary/*89.35*/.get.max),format.raw/*89.43*/("""
                """),format.raw/*90.17*/("""var min = """),_display_(/*90.28*/summary/*90.35*/.get.min),format.raw/*90.43*/("""
                """),format.raw/*91.17*/("""var variance = """),_display_(/*91.33*/summary/*91.40*/.get.variance),format.raw/*91.53*/("""
                """),format.raw/*92.17*/("""var numNonzeros = """),_display_(/*92.36*/summary/*92.43*/.get.numNonzeros),format.raw/*92.59*/("""


                """),format.raw/*95.17*/("""var table = document.createElement('table');
                table.setAttribute('class','table-style-three')
                // table.class="table-style-three"
                var tr1 = document.createElement('tr');

                var colName = ['column name','max','mean','min','var','nonZeros','category','numeric','removal']
                var th=[];
                for(i=0;i<colName.length;i++)
                """),format.raw/*103.17*/("""{"""),format.raw/*103.18*/("""
                    """),format.raw/*104.21*/("""th[i] =document.createElement('th');
                    th[i].appendChild(document.createTextNode(colName[i]));
                    tr1.appendChild(th[i]);
                """),format.raw/*107.17*/("""}"""),format.raw/*107.18*/("""
                """),format.raw/*108.17*/("""table.appendChild(tr1);


                var headerArray=new Array();





                """),_display_(/*117.18*/for( (item, index) <- datatype.zipWithIndex) yield /*117.62*/ {_display_(Seq[Any](format.raw/*117.64*/("""

                """),format.raw/*119.17*/("""var i="""),_display_(/*119.24*/index),format.raw/*119.29*/("""
                        """),format.raw/*120.25*/("""headerArray.push(""""),_display_(/*120.44*/item/*120.48*/._1),format.raw/*120.51*/("""");

                var tr2 = document.createElement('tr');
                var td=[];
                for(j=0;j<colName.length;j++)
                """),format.raw/*125.17*/("""{"""),format.raw/*125.18*/("""
                    """),format.raw/*126.21*/("""td[j] =document.createElement('td');
                    tr1.appendChild(th[j]);
                """),format.raw/*128.17*/("""}"""),format.raw/*128.18*/("""
                """),format.raw/*129.17*/("""var content = [];


                """),format.raw/*132.80*/("""
                """),format.raw/*133.17*/("""content[0] = document.createTextNode(""""),_display_(/*133.56*/item/*133.60*/._1),format.raw/*133.63*/("""");
                content[1]= document.createTextNode(mean[i]);
                content[2]= document.createTextNode(max[i]);
                content[3]= document.createTextNode(min[i]);
                content[4]= document.createTextNode(variance[i]);
                content[5]= document.createTextNode(numNonzeros[i]);







                //div category  input radio, label
                var div = document.createElement('div');
                content[6] = document.createElement('input');
                content[6].type = "radio"
                content[6].name= """"),_display_(/*150.36*/item/*150.40*/._1),format.raw/*150.43*/("""";
                content[6].value='category'
                """),_display_(/*152.18*/if(item._2 != "IntegerType" && item._2 != "DoubleType")/*152.73*/ {_display_(Seq[Any](format.raw/*152.75*/("""
                """),format.raw/*153.17*/("""content[6].setAttribute("checked", "checked");
                """)))}),format.raw/*154.18*/("""


                """),format.raw/*157.17*/("""//div category  input radio, label
                //var div = document.createElement('div');
                content[7] = document.createElement('input');
                content[7].type = "radio"
                content[7].name= """"),_display_(/*161.36*/item/*161.40*/._1),format.raw/*161.43*/("""";
                content[7].value='numeric'
                """),_display_(/*163.18*/if(item._2 == "IntegerType" || item._2 == "DoubleType")/*163.73*/ {_display_(Seq[Any](format.raw/*163.75*/("""
                """),format.raw/*164.17*/("""content[7].setAttribute("checked", "checked"); """)))}/*164.66*/else/*164.70*/{_display_(Seq[Any](format.raw/*164.71*/("""
                """),format.raw/*165.17*/("""content[7].setAttribute("disabled", "disabled");
                """)))}),format.raw/*166.18*/("""
                """),format.raw/*167.17*/("""content[8] = document.createElement('input');
                content[8].type = "radio"
                content[8].name= """"),_display_(/*169.36*/item/*169.40*/._1),format.raw/*169.43*/("""";
                content[8].value='removal'


                td[6].appendChild(div)

                for(j=0;j<colName.length;j++)
                """),format.raw/*176.17*/("""{"""),format.raw/*176.18*/("""
                    """),format.raw/*177.21*/("""td[j] .appendChild(content[j]);
                    tr2.appendChild(td[j]);
                """),format.raw/*179.17*/("""}"""),format.raw/*179.18*/("""


                """),format.raw/*182.17*/("""table.appendChild(tr2);
                """)))}),format.raw/*183.18*/("""


                """),format.raw/*186.17*/("""form.appendChild(table);

                form.appendChild(document.createElement("br"));
                form.appendChild(document.createTextNode("Output name"));
                var outputPath = document.createElement("input");
                outputPath.type='text'
                outputPath.required = 'required'
                outputPath.name = 'outputFolder'
                form.appendChild(outputPath);

                form.appendChild(document.createElement("br"));
                form.appendChild(document.createElement("br"));



                var button = document.createElement("input");
                button.type='submit'
                button.id='saveto'
                button.value='save'
                form.appendChild(button);


                document.body.appendChild(form);


                // alert(headerArray);

        </script>

    """)))}),format.raw/*215.6*/("""
""")))}),format.raw/*216.2*/("""
"""))
      }
    }
  }

  def render(guestSelect:Form[scala.Tuple2[String, Boolean]],data:List[String],csvInput:Form[scala.Tuple2[String, Boolean]],header:String,datatype:Seq[scala.Tuple2[String, String]],summary:Form[StatSummary],corMatrix:String,user:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(guestSelect,data,csvInput,header,datatype,summary,corMatrix,user)(messages)

  def f:((Form[scala.Tuple2[String, Boolean]],List[String],Form[scala.Tuple2[String, Boolean]],String,Seq[scala.Tuple2[String, String]],Form[StatSummary],String,String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (guestSelect,data,csvInput,header,datatype,summary,corMatrix,user) => (messages) => apply(guestSelect,data,csvInput,header,datatype,summary,corMatrix,user)(messages)

  def ref: this.type = this

}


}
}

/**/
object dataimport_pre1 extends dataimport_pre1_Scope0.dataimport_pre1_Scope1.dataimport_pre1
              /*
                  -- GENERATED --
                  DATE: Fri Jan 06 14:59:16 PHT 2017
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/preprocess/dataimport_pre1.scala.html
                  HASH: 3bd608cc3a46dd296735d649efa373850b9c7b16
                  MATRIX: 772->19|1088->239|1116->242|1176->294|1215->296|1247->302|1307->336|1371->391|1410->392|1447->402|1510->456|1550->458|1591->471|1646->499|1671->515|1711->517|1760->538|1842->593|2051->781|2100->803|2289->971|2326->989|2339->993|2378->994|2427->1016|2582->1150|2631->1172|2823->1343|2873->1362|2918->1379|3095->1525|3131->1531|3164->1538|3228->1593|3267->1594|3303->1603|3344->1617|3359->1623|3423->1666|3500->1716|3515->1722|3573->1759|3614->1773|3646->1796|3686->1798|3722->1807|3813->1871|3838->1887|3865->1893|3902->1903|4039->2013|4075->2028|4120->2045|4275->2169|4311->2178|4596->2436|4611->2442|4661->2471|4844->2627|4869->2643|4896->2649|5155->2881|5182->2887|5321->2999|5337->3006|5367->3015|5412->3032|5450->3043|5466->3050|5495->3058|5540->3075|5578->3086|5594->3093|5623->3101|5668->3118|5711->3134|5727->3141|5761->3154|5806->3171|5852->3190|5868->3197|5905->3213|5952->3232|6400->3651|6430->3652|6480->3673|6682->3846|6712->3847|6758->3864|6879->3957|6940->4001|6981->4003|7028->4021|7063->4028|7090->4033|7144->4058|7191->4077|7205->4081|7230->4084|7409->4234|7439->4235|7489->4256|7615->4353|7645->4354|7691->4371|7756->4470|7802->4487|7869->4526|7883->4530|7908->4533|8513->5110|8527->5114|8552->5117|8644->5181|8709->5236|8750->5238|8796->5255|8892->5319|8940->5338|9201->5571|9215->5575|9240->5578|9331->5641|9396->5696|9437->5698|9483->5715|9551->5764|9565->5768|9605->5769|9651->5786|9749->5852|9795->5869|9946->5992|9960->5996|9985->5999|10164->6149|10194->6150|10244->6171|10365->6263|10395->6264|10443->6283|10516->6324|10564->6343|11469->7217|11502->7219
                  LINES: 23->3|28->3|30->5|30->5|30->5|32->7|35->10|35->10|35->10|36->11|36->11|36->11|37->12|38->13|38->13|38->13|39->14|40->15|44->19|45->20|48->23|49->24|49->24|49->24|50->25|53->28|54->29|57->32|59->34|60->35|64->39|65->40|67->42|67->42|67->42|68->43|68->43|68->43|68->43|69->44|69->44|69->44|72->47|72->47|72->47|73->48|76->51|76->51|76->51|78->53|83->58|83->58|84->59|87->62|88->63|97->72|97->72|97->72|102->77|102->77|102->77|109->84|109->84|113->88|113->88|113->88|114->89|114->89|114->89|114->89|115->90|115->90|115->90|115->90|116->91|116->91|116->91|116->91|117->92|117->92|117->92|117->92|120->95|128->103|128->103|129->104|132->107|132->107|133->108|142->117|142->117|142->117|144->119|144->119|144->119|145->120|145->120|145->120|145->120|150->125|150->125|151->126|153->128|153->128|154->129|157->132|158->133|158->133|158->133|158->133|175->150|175->150|175->150|177->152|177->152|177->152|178->153|179->154|182->157|186->161|186->161|186->161|188->163|188->163|188->163|189->164|189->164|189->164|189->164|190->165|191->166|192->167|194->169|194->169|194->169|201->176|201->176|202->177|204->179|204->179|207->182|208->183|211->186|240->215|241->216
                  -- GENERATED --
              */
          