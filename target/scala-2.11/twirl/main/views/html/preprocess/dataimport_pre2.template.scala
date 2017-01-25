
package views.html.preprocess

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dataimport_pre2_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object dataimport_pre2_Scope1 {
import helper._

class dataimport_pre2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Form[String],List[String],String,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(csvInput: Form[(String)], pre2data: List[String],jsonString: String,user:String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.112*/("""
    """),_display_(/*4.6*/main(title = "Linear Regression",test = user)/*4.51*/ {_display_(Seq[Any](format.raw/*4.53*/("""


        """),format.raw/*7.9*/("""<h3>Data Preprocess 2</h3>
        """),_display_(/*8.10*/if(jsonString==null )/*8.31*/{_display_(Seq[Any](format.raw/*8.32*/("""
            """),_display_(/*9.14*/form(action = routes.Preprocess.preprocess2)/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""

                """),format.raw/*11.17*/("""<fieldset>

                    <legend>from SQL</legend>


                    """),_display_(/*16.22*/select(
                        field = csvInput("path"),
                        options(pre2data),
                        '_label -> "Select your parquet name")),format.raw/*19.63*/("""



                    """),format.raw/*23.21*/("""<div class="submit">
                        <input type="submit" id="submit" value="submit">
                    </div>
                </fieldset>

            """)))}),format.raw/*28.14*/("""
        """)))}),format.raw/*29.10*/("""
        """),_display_(/*30.10*/if(pre2data==null )/*30.29*/{_display_(Seq[Any](format.raw/*30.30*/("""
            """),format.raw/*31.13*/("""<script src="http://labratrevenge.com/d3-tip/javascripts/d3.tip.v0.6.3.js"></script>


            <link rel="stylesheet" media="screen" href=""""),_display_(/*34.58*/routes/*34.64*/.Assets.at("stylesheets/d3/bar.css")),format.raw/*34.100*/("""">
            <link rel="stylesheet" media="screen" href=""""),_display_(/*35.58*/routes/*35.64*/.Assets.at("stylesheets/d3/pie.css")),format.raw/*35.100*/("""">
            <link rel="stylesheet" media="screen" href=""""),_display_(/*36.58*/routes/*36.64*/.Assets.at("stylesheets/d3/hist.css")),format.raw/*36.101*/("""">
            <script src='"""),_display_(/*37.27*/routes/*37.33*/.Assets.at("javascripts/d3/bar.js")),format.raw/*37.68*/("""'></script>
            <script src='"""),_display_(/*38.27*/routes/*38.33*/.Assets.at("javascripts/d3/pie.js")),format.raw/*38.68*/("""'></script>
            <script src=""""),_display_(/*39.27*/routes/*39.33*/.Assets.at("javascripts/d3/box.js")),format.raw/*39.68*/(""""></script>
            <script src=""""),_display_(/*40.27*/routes/*40.33*/.Assets.at("javascripts/d3/histo.js")),format.raw/*40.70*/(""""></script>

            <h2> Feature Visualization</h2>
            <h3>Choose one column as your label and save it!</h3>
            <script>

                    var form = document.createElement("form");
                    form.method='POST';
                    form.action = '"""),_display_(/*48.37*/routes/*48.43*/.Preprocess.convertVector),format.raw/*48.68*/("""';


                    var inputFilename = document.createElement("input");
                    inputFilename.type='hidden'
                    inputFilename.value='"""),_display_(/*53.43*/csvInput("path")/*53.59*/.value),format.raw/*53.65*/("""'
                    inputFilename.name = 'inputFile'
                    form.appendChild(inputFilename);


                    var pieData2 = """),_display_(/*58.37*/Html(jsonString)),format.raw/*58.53*/("""

                    """),format.raw/*60.21*/("""var table = document.createElement('table');
                    table.setAttribute('class','table-style-three')

                    var tr1 = document.createElement('tr');
                    var column_num = 6;
                    var header = ['column name','type','chart','chart','feature','label']
                    var th=[];
                    for(i=0;i<column_num;i++)
                    """),format.raw/*68.21*/("""{"""),format.raw/*68.22*/("""
                        """),format.raw/*69.25*/("""th[i] =document.createElement('th');
                        th[i].appendChild(document.createTextNode(header[i]));
                        tr1.appendChild(th[i]);
                    """),format.raw/*72.21*/("""}"""),format.raw/*72.22*/("""
                    """),format.raw/*73.21*/("""table.appendChild(tr1);

                    for (var i = 0; i < pieData2.length; i++)"""),format.raw/*75.62*/("""{"""),format.raw/*75.63*/("""
                        """),format.raw/*76.25*/("""if(pieData2[i]==undefined) break;
                        var tr2 = document.createElement('tr');
                        var td=[];
                        for(j=0;j<column_num;j++)
                        """),format.raw/*80.25*/("""{"""),format.raw/*80.26*/("""
                            """),format.raw/*81.29*/("""td[j] =document.createElement('td');
                            tr1.appendChild(th[j]);
                        """),format.raw/*83.25*/("""}"""),format.raw/*83.26*/("""



                        """),format.raw/*87.25*/("""var content = [];
                        content[0] = document.createTextNode(pieData2[i].columnName);
                        content[1]= document.createTextNode(pieData2[i].type);

                        //div
                        content[2] = document.createElement('div');
                        content[2].id = 'piechart'+i;
                        //div
                        content[3] = document.createElement('div');
                        content[3].id = 'barchart'+i;
                        //radio
                        content[4] = document.createElement('input');
                        content[4].type = "radio"
                        content[4].name= pieData2[i].columnName;
                        content[4].value='feature'
                        content[4].setAttribute("checked", "checked");
                        //radio
                        content[5] = document.createElement('input');
                        content[5].type = "radio"
                        content[5].name= pieData2[i].columnName;
                        content[5].value='label'

                        for(j=0;j<column_num;j++)
                        """),format.raw/*110.25*/("""{"""),format.raw/*110.26*/("""
                            """),format.raw/*111.29*/("""td[j] .appendChild(content[j]);
                            tr2.appendChild(td[j]);
                        """),format.raw/*113.25*/("""}"""),format.raw/*113.26*/("""

                        """),format.raw/*115.25*/("""table.appendChild(tr2);
                    """),format.raw/*116.21*/("""}"""),format.raw/*116.22*/("""

                    """),format.raw/*118.21*/("""form.appendChild(table)


                    form.appendChild(document.createElement("br"));
                    """),_display_(/*122.22*/if(user!="NULL"&&user!="outsider"&&user!="")/*122.66*/ {_display_(Seq[Any](format.raw/*122.68*/("""
                        """),format.raw/*123.25*/("""form.appendChild(document.createTextNode("Output name"));
                        var outputPath = document.createElement("input");
                        outputPath.type='text'
                        outputPath.required='required'
                        outputPath.name = 'outputFolder'
                        form.appendChild(outputPath);
                    """)))}),format.raw/*129.22*/("""
                    """),format.raw/*130.21*/("""form.appendChild(document.createElement("br"));
                    form.appendChild(document.createElement("br"));


                    """),_display_(/*134.22*/if(user!="NULL"&&user!="outsider"&&user!="")/*134.66*/ {_display_(Seq[Any](format.raw/*134.68*/("""
                        """),format.raw/*135.25*/("""var button = document.createElement("input");
                        button.type='submit'
                        button.id='saveto'
                        button.value='save'
                        form.appendChild(button);
                    """)))}),format.raw/*140.22*/("""




                    """),format.raw/*145.21*/("""document.body.appendChild(form);


                    for(i=0;i<pieData2.length;i++) """),format.raw/*148.52*/("""{"""),format.raw/*148.53*/("""
                        """),format.raw/*149.25*/("""if(pieData2[i].type =="StringType") """),format.raw/*149.61*/("""{"""),format.raw/*149.62*/("""

                            """),format.raw/*151.29*/("""d3.select('#piechart' + i).datum(pieData2[i].category).call(pie());
                            d3.select('#barchart' + i).datum(pieData2[i].category).call(bar());
                            console.log(pieData2[i].category)
                        """),format.raw/*154.25*/("""}"""),format.raw/*154.26*/("""
                        """),format.raw/*155.25*/("""else"""),format.raw/*155.29*/("""{"""),format.raw/*155.30*/("""
                            """),format.raw/*156.29*/("""var data = pieData2[i].boxplot
                            //console.log("piedata2",pieData2[i])
                            var boxplotData =[], count =0;
                            var d=[];
                            for (var property in data)
                            """),format.raw/*161.29*/("""{"""),format.raw/*161.30*/("""
                                """),format.raw/*162.33*/("""d.push(property);
                                count++;
                            """),format.raw/*164.29*/("""}"""),format.raw/*164.30*/("""
                            """),format.raw/*165.29*/("""for(var j = 0;j<count;j++)"""),format.raw/*165.55*/("""{"""),format.raw/*165.56*/("""
                                """),format.raw/*166.33*/("""boxplotData[j]=[];
                                boxplotData[j][0]=d[j];
                                boxplotData[j][1] = data[d[j]]
                            """),format.raw/*169.29*/("""}"""),format.raw/*169.30*/("""
                            """),format.raw/*170.29*/("""d3.select('#piechart' + i).datum(boxplotData).call(boxplot(count));
                            //console.log(boxplotData)
                            d3.select('#barchart'+i).datum(pieData2[i].histogram).call(histogram());


                        """),format.raw/*175.25*/("""}"""),format.raw/*175.26*/("""
                    """),format.raw/*176.21*/("""}"""),format.raw/*176.22*/("""
            """),format.raw/*177.13*/("""</script>
        """)))}),format.raw/*178.10*/("""


    """)))}))
      }
    }
  }

  def render(csvInput:Form[String],pre2data:List[String],jsonString:String,user:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(csvInput,pre2data,jsonString,user)(messages)

  def f:((Form[String],List[String],String,String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (csvInput,pre2data,jsonString,user) => (messages) => apply(csvInput,pre2data,jsonString,user)(messages)

  def ref: this.type = this

}


}
}

/**/
object dataimport_pre2 extends dataimport_pre2_Scope0.dataimport_pre2_Scope1.dataimport_pre2
              /*
                  -- GENERATED --
                  DATE: Fri Jan 13 15:56:31 PHT 2017
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/preprocess/dataimport_pre2.scala.html
                  HASH: ea92746d5e3b84d9418f8bfb61b2e9cd573cb937
                  MATRIX: 654->19|860->129|891->135|944->180|983->182|1020->193|1082->229|1111->250|1149->251|1189->265|1241->309|1280->311|1326->329|1434->410|1618->573|1670->597|1864->760|1905->770|1942->780|1970->799|2009->800|2050->813|2221->957|2236->963|2294->999|2381->1059|2396->1065|2454->1101|2541->1161|2556->1167|2615->1204|2671->1233|2686->1239|2742->1274|2807->1312|2822->1318|2878->1353|2943->1391|2958->1397|3014->1432|3079->1470|3094->1476|3152->1513|3463->1797|3478->1803|3524->1828|3719->1996|3744->2012|3771->2018|3944->2164|3981->2180|4031->2202|4460->2603|4489->2604|4542->2629|4754->2813|4783->2814|4832->2835|4946->2921|4975->2922|5028->2947|5263->3154|5292->3155|5349->3184|5490->3297|5519->3298|5575->3326|6772->4494|6802->4495|6860->4524|6997->4632|7027->4633|7082->4659|7155->4703|7185->4704|7236->4726|7379->4841|7433->4885|7474->4887|7528->4912|7926->5278|7976->5299|8143->5438|8197->5482|8238->5484|8292->5509|8573->5758|8627->5783|8742->5869|8772->5870|8826->5895|8891->5931|8921->5932|8980->5962|9259->6212|9289->6213|9343->6238|9376->6242|9406->6243|9464->6272|9770->6549|9800->6550|9862->6583|9978->6670|10008->6671|10066->6700|10121->6726|10151->6727|10213->6760|10408->6926|10438->6927|10496->6956|10775->7206|10805->7207|10855->7228|10885->7229|10927->7242|10978->7261
                  LINES: 23->3|28->3|29->4|29->4|29->4|32->7|33->8|33->8|33->8|34->9|34->9|34->9|36->11|41->16|44->19|48->23|53->28|54->29|55->30|55->30|55->30|56->31|59->34|59->34|59->34|60->35|60->35|60->35|61->36|61->36|61->36|62->37|62->37|62->37|63->38|63->38|63->38|64->39|64->39|64->39|65->40|65->40|65->40|73->48|73->48|73->48|78->53|78->53|78->53|83->58|83->58|85->60|93->68|93->68|94->69|97->72|97->72|98->73|100->75|100->75|101->76|105->80|105->80|106->81|108->83|108->83|112->87|135->110|135->110|136->111|138->113|138->113|140->115|141->116|141->116|143->118|147->122|147->122|147->122|148->123|154->129|155->130|159->134|159->134|159->134|160->135|165->140|170->145|173->148|173->148|174->149|174->149|174->149|176->151|179->154|179->154|180->155|180->155|180->155|181->156|186->161|186->161|187->162|189->164|189->164|190->165|190->165|190->165|191->166|194->169|194->169|195->170|200->175|200->175|201->176|201->176|202->177|203->178
                  -- GENERATED --
              */
          