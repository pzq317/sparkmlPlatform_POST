
package views.html.mlTrans

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object regression_transform_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object regression_transform_Scope1 {
import helper._

class regression_transform extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[Form[scala.Tuple2[String, String]],Form[String],List[String],List[String],Array[String],String,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(param: Form[(String, String)],down: Form[(String)], pre2data: List[String], model: List[String], regResult: Array[String], errorMessage: String, user:String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.189*/("""
    """),_display_(/*4.6*/main(title = "Linear Regression", test = user)/*4.52*/ {_display_(Seq[Any](format.raw/*4.54*/("""

        """),_display_(/*6.10*/if(pre2data != null)/*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""
            """),format.raw/*7.13*/("""<h3>Linear Regression</h3>
            """),_display_(/*8.14*/form(action = routes.Regression.transformRegression())/*8.68*/ {_display_(Seq[Any](format.raw/*8.70*/("""
                """),format.raw/*9.17*/("""<fieldset>

                    <legend>Input Parameters</legend>


                    """),_display_(/*14.22*/select(
                        field = param("inputpath"),
                        options(pre2data),
                        '_label -> "Select your parquet name")),format.raw/*17.63*/("""

                    """),_display_(/*19.22*/select(
                        field = param("model"),
                        options(model),
                        '_label -> "Select your model name")),format.raw/*22.61*/("""

                    """),format.raw/*24.21*/("""<div class="submit">
                        <input type="submit" id="submit" value="submit">
                    </div>
                </fieldset>

            """)))}),format.raw/*29.14*/("""
        """)))}),format.raw/*30.10*/("""

        """),_display_(/*32.10*/if(regResult != null)/*32.31*/ {_display_(Seq[Any](format.raw/*32.33*/("""
            """),format.raw/*33.13*/("""<h2>predict labels</h2>
            """),_display_(/*34.14*/for(i <- 0 to 3) yield /*34.30*/ {_display_(Seq[Any](format.raw/*34.32*/("""
                """),format.raw/*35.17*/("""<br>
               Column"""),_display_(/*36.23*/i),format.raw/*36.24*/("""| """),_display_(/*36.27*/regResult(i)),format.raw/*36.39*/("""
            """)))}),format.raw/*37.14*/("""
            """),format.raw/*38.13*/("""<br>
              ....and """),_display_(/*39.24*/(regResult.length-4)),format.raw/*39.44*/(""" """),format.raw/*39.45*/("""more
            <br>
            """),_display_(/*41.14*/if(user!="NULL"&&user!="outsider"&&user!="")/*41.58*/ {_display_(Seq[Any](format.raw/*41.60*/("""
            """),_display_(/*42.14*/form(action = routes.Regression.download())/*42.57*/ {_display_(Seq[Any](format.raw/*42.59*/("""
                """),format.raw/*43.17*/("""<fieldset>
                    <legend>download your result</legend>
                    """),_display_(/*45.22*/inputText(
                        field = down("csvPath"),
                        '_label -> "Input your download path"
                    )),format.raw/*48.22*/("""

                    """),format.raw/*50.21*/("""<div class="submit">
                        <input type="submit" id="submit" value="download">
                    </div>
                </fieldset>

            """)))}),format.raw/*55.14*/("""
        """)))}),format.raw/*56.10*/("""
        """)))}),format.raw/*57.10*/("""
    """)))}),format.raw/*58.6*/("""
"""))
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
object regression_transform extends regression_transform_Scope0.regression_transform_Scope1.regression_transform
              /*
                  -- GENERATED --
                  DATE: Mon Dec 19 11:24:25 PHT 2016
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/mlTrans/regression_transform.scala.html
                  HASH: ae9bc1a4ddf2ff4ac40a5350ebafd06d02f819f8
                  MATRIX: 728->19|1011->206|1042->212|1096->258|1135->260|1172->271|1200->291|1239->293|1279->306|1345->346|1407->400|1446->402|1490->419|1606->508|1792->673|1842->696|2019->852|2069->874|2263->1037|2304->1047|2342->1058|2372->1079|2412->1081|2453->1094|2517->1131|2549->1147|2589->1149|2634->1166|2688->1193|2710->1194|2740->1197|2773->1209|2818->1223|2859->1236|2914->1264|2955->1284|2984->1285|3046->1320|3099->1364|3139->1366|3180->1380|3232->1423|3272->1425|3317->1442|3434->1532|3598->1675|3648->1697|3844->1862|3885->1872|3926->1882|3962->1888
                  LINES: 23->3|28->3|29->4|29->4|29->4|31->6|31->6|31->6|32->7|33->8|33->8|33->8|34->9|39->14|42->17|44->19|47->22|49->24|54->29|55->30|57->32|57->32|57->32|58->33|59->34|59->34|59->34|60->35|61->36|61->36|61->36|61->36|62->37|63->38|64->39|64->39|64->39|66->41|66->41|66->41|67->42|67->42|67->42|68->43|70->45|73->48|75->50|80->55|81->56|82->57|83->58
                  -- GENERATED --
              */
          