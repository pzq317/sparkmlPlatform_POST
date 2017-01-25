
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object main_Scope1 {
import play.api.mvc.Session
import play.mvc.Http.Session

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(title: String,test:String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.44*/("""


"""),format.raw/*7.1*/("""<html>
    <head>
        <title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""  """),format.raw/*9.24*/("""</title>

        <script src="http://d3js.org/d3.v3.min.js"></script>
        <script type='text/javascript' src='http://code.jquery.com/jquery-1.7.1.min.js'></script>

        <script language=JAVASCRIPT src=""""),_display_(/*14.43*/routes/*14.49*/.Assets.at("javascripts/ddsmoothmenu.js")),format.raw/*14.90*/(""""></script>

        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.at("stylesheets/main.css")),format.raw/*16.94*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*17.55*/routes/*17.61*/.Assets.at("stylesheets/ddsmoothmenu.css")),format.raw/*17.103*/("""">

        <script type="text/javascript">
                ddsmoothmenu.init("""),format.raw/*20.35*/("""{"""),format.raw/*20.36*/("""
                    """),format.raw/*21.21*/("""mainmenuid: "smoothmenu1", 		//div id
                    orientation: 'h', 				//horizontal or vertical
                    classname: 'ddsmoothmenu', 		//ddsmoothmenu css template
                    contentsource: "markup"	,	 	//"markup" or ["container_id", "path_to_menu_file"]
                    customtheme: ["#8f1414", "#bc3315"] //background color & hover color
                """),format.raw/*26.17*/("""}"""),format.raw/*26.18*/(""")

        </script>


    </head>

    <body>


        <div class="container">
            <div>
            <!--<form action="/test" method="POST">
                First name: <input type="text" name="filename"><br>

                <input type="submit" value="Submit">
            </form>-->

            <h1>Spark ML Platform</h1>

                <!--Session.get("username");-->
            <div align="right">

            <div id="smoothmenu1" >

                <ul >
                    <li> <a href=""""),_display_(/*52.36*/routes/*52.42*/.Entrance.index()),format.raw/*52.59*/("""">Home</a> </li>
                    """),_display_(/*53.22*/if(test!="NULL"&&test!="outsider"&&test!="")/*53.66*/ {_display_(Seq[Any](format.raw/*53.68*/("""
                        """),format.raw/*54.25*/("""<li><a href="#">Simple</a>
                            <ul>

                                <li><a href=""""),_display_(/*57.47*/routes/*57.53*/.Entrance.dataimport_pre1),format.raw/*57.78*/("""">DataImport Pre1 </a></li>
                                <li><a href=""""),_display_(/*58.47*/routes/*58.53*/.Entrance.dataimport_pre2),format.raw/*58.78*/("""">DataImport Pre2 </a></li>
                                <li><a href=""""),_display_(/*59.47*/routes/*59.53*/.Entrance.dataimport_nov),format.raw/*59.77*/("""">DataImport Direct </a></li>

                            </ul>
                        </li>
                    """)))}/*63.22*/else/*63.26*/{_display_(Seq[Any](format.raw/*63.27*/("""
                        """),format.raw/*64.25*/("""<li><a href="#">Simple</a>
                            <ul>
                                <li><a href=""""),_display_(/*66.47*/routes/*66.53*/.Entrance.dataimport_pre1),format.raw/*66.78*/("""">DataImport Pre1 </a></li>
                                <li><a href=""""),_display_(/*67.47*/routes/*67.53*/.Entrance.dataimport_pre2),format.raw/*67.78*/("""">DataImport Pre2 </a></li>
                            </ul>
                        </li>
                    """)))}),format.raw/*70.22*/("""

                    """),format.raw/*72.21*/("""<li><a href="#">Train Model</a>
                        <ul>
                            <li><a href=""""),_display_(/*74.43*/routes/*74.49*/.Entrance.linear_reg_param()),format.raw/*74.77*/("""">LinearRegression</a></li>
                         <!--   <li><a href="routes.Entrance.simp_reg()">test</a></li>-->

                            <li><a href=""""),_display_(/*77.43*/routes/*77.49*/.Entrance.log_reg()),format.raw/*77.68*/("""">LogisticRegression</a></li>
                            <li><a href=""""),_display_(/*78.43*/routes/*78.49*/.Entrance.kmeans()),format.raw/*78.67*/("""">Kmeans</a></li>
                            <li><a href=""""),_display_(/*79.43*/routes/*79.49*/.Entrance.pca()),format.raw/*79.64*/("""">PCA</a></li>


                        </ul>
                    </li>
                    <li><a href="#" >Machine Learning </a>
                        <ul >
                            <li><a href=""""),_display_(/*86.43*/routes/*86.49*/.Entrance.reg_trans()),format.raw/*86.70*/("""">LinearRegression</a></li>
                            <li><a href=""""),_display_(/*87.43*/routes/*87.49*/.Entrance.log_trans()),format.raw/*87.70*/("""">LogisticRegression</a></li>
                            <li><a href=""""),_display_(/*88.43*/routes/*88.49*/.Entrance.kmean_trans()),format.raw/*88.72*/("""">Kmeans</a></li>
                            <li><a href=""""),_display_(/*89.43*/routes/*89.49*/.Entrance.pca_trans()),format.raw/*89.70*/("""">PCA</a></li>
                        </ul>
                    </li>


                </ul>
                <br style="clear: left" />
            </div>

        </div>


    """),_display_(/*101.6*/content),format.raw/*101.13*/("""
    """),format.raw/*102.5*/("""</body></html>"""))
      }
    }
  }

  def render(title:String,test:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,test)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,test) => (content) => apply(title,test)(content)

  def ref: this.type = this

}


}
}

/**/
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Fri Jan 20 21:06:14 PHT 2017
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform3/app/views/main.scala.html
                  HASH: 00faa95da73b466f626467f5ab0321141ab0db8a
                  MATRIX: 621->61|758->103|787->106|847->140|872->145|901->147|1140->359|1155->365|1217->406|1310->472|1325->478|1380->512|1464->569|1479->575|1543->617|1649->695|1678->696|1727->717|2142->1104|2171->1105|2710->1617|2725->1623|2763->1640|2828->1678|2881->1722|2921->1724|2974->1749|3108->1856|3123->1862|3169->1887|3270->1961|3285->1967|3331->1992|3432->2066|3447->2072|3492->2096|3627->2212|3640->2216|3679->2217|3732->2242|3865->2348|3880->2354|3926->2379|4027->2453|4042->2459|4088->2484|4232->2597|4282->2619|4412->2722|4427->2728|4476->2756|4664->2917|4679->2923|4719->2942|4818->3014|4833->3020|4872->3038|4959->3098|4974->3104|5010->3119|5241->3323|5256->3329|5298->3350|5395->3420|5410->3426|5452->3447|5551->3519|5566->3525|5610->3548|5697->3608|5712->3614|5754->3635|5961->3815|5990->3822|6023->3827
                  LINES: 24->4|29->4|32->7|34->9|34->9|34->9|39->14|39->14|39->14|41->16|41->16|41->16|42->17|42->17|42->17|45->20|45->20|46->21|51->26|51->26|77->52|77->52|77->52|78->53|78->53|78->53|79->54|82->57|82->57|82->57|83->58|83->58|83->58|84->59|84->59|84->59|88->63|88->63|88->63|89->64|91->66|91->66|91->66|92->67|92->67|92->67|95->70|97->72|99->74|99->74|99->74|102->77|102->77|102->77|103->78|103->78|103->78|104->79|104->79|104->79|111->86|111->86|111->86|112->87|112->87|112->87|113->88|113->88|113->88|114->89|114->89|114->89|126->101|126->101|127->102
                  -- GENERATED --
              */
          