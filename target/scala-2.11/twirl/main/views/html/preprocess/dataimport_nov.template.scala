
package views.html.preprocess

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dataimport_nov_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object dataimport_nov_Scope1 {
import helper._

class dataimport_nov extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[scala.Tuple3[String, Boolean, String]],String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(csvInput: Form[(String,Boolean,String)],user:String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.84*/("""

    """),_display_(/*5.6*/main(title = "ImportData without Visulization",test = user)/*5.65*/ {_display_(Seq[Any](format.raw/*5.67*/("""

        """),format.raw/*7.9*/("""<h3>Data Preprocess Directly</h3>


        """),_display_(/*10.10*/form(action = routes.Preprocess.preprocess_direct())/*10.62*/ {_display_(Seq[Any](format.raw/*10.64*/("""
            """),format.raw/*11.13*/("""<fieldset>

                <legend>Input Parameters</legend>
                """),_display_(/*14.18*/inputText(
                    csvInput("inputpath"),
                    '_label -> "CSV path",
                    'placeholder -> "path of your csv in hdfs"
                )),format.raw/*18.18*/("""
                """),_display_(/*19.18*/checkbox(
                    csvInput("header"),
                    /*'label->"Confirm:",'_text->"Is first line header?",*/'_help->""
                )),format.raw/*22.18*/("""
                """),_display_(/*23.18*/inputText(
                    csvInput("outputfolder"),
                    '_label -> "parquet output folder",
                    'placeholder -> "output name"
                )),format.raw/*27.18*/("""

                """),format.raw/*29.17*/("""<div class="submit">
                    <input type="submit" id="submit" value="submit">
                </div>
            </fieldset>
        """)))}),format.raw/*33.10*/("""
    """)))}),format.raw/*34.6*/("""

"""))
      }
    }
  }

  def render(csvInput:Form[scala.Tuple3[String, Boolean, String]],user:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(csvInput,user)(messages)

  def f:((Form[scala.Tuple3[String, Boolean, String]],String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (csvInput,user) => (messages) => apply(csvInput,user)(messages)

  def ref: this.type = this

}


}
}

/**/
object dataimport_nov extends dataimport_nov_Scope0.dataimport_nov_Scope1.dataimport_nov
              /*
                  -- GENERATED --
                  DATE: Mon Dec 19 11:02:43 PHT 2016
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/preprocess/dataimport_nov.scala.html
                  HASH: a74709c08cf7c77bba0cc3e7700f9111e92f9234
                  MATRIX: 662->19|839->101|871->108|938->167|977->169|1013->179|1085->224|1146->276|1186->278|1227->291|1333->370|1531->547|1576->565|1750->718|1795->736|1996->916|2042->934|2219->1080|2255->1086
                  LINES: 23->3|28->3|30->5|30->5|30->5|32->7|35->10|35->10|35->10|36->11|39->14|43->18|44->19|47->22|48->23|52->27|54->29|58->33|59->34
                  -- GENERATED --
              */
          