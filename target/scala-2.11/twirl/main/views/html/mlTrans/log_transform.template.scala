
package views.html.mlTrans

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object log_transform_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object log_transform_Scope1 {
import helper._

class log_transform extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[Form[scala.Tuple2[String, String]],Form[String],List[String],List[String],Array[String],String,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(param: Form[(String, String)],down: Form[(String)], pre2data: List[String], model: List[String], regResult: Array[String], errorMessage: String,user:String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.188*/("""
"""),_display_(/*4.2*/main(title = "Logistic Regression",test=user)/*4.47*/ {_display_(Seq[Any](format.raw/*4.49*/("""

  """),_display_(/*6.4*/if(pre2data != null)/*6.24*/ {_display_(Seq[Any](format.raw/*6.26*/("""
    """),format.raw/*7.5*/("""<h3>Logistic Regression</h3>
    """),_display_(/*8.6*/form(action = routes.Classification.logRegression())/*8.58*/ {_display_(Seq[Any](format.raw/*8.60*/("""
      """),format.raw/*9.7*/("""<fieldset>

        <legend>Input Parameters</legend>


        """),_display_(/*14.10*/select(
          field = param("inputpath"),
          options(pre2data),
          '_label -> "Select your parquet name")),format.raw/*17.49*/("""

        """),_display_(/*19.10*/select(
          field = param("model"),
          options(model),
          '_label -> "Select your model name")),format.raw/*22.47*/("""

        """),format.raw/*24.9*/("""<div class="submit">
          <input type="submit" id="submit" value="submit">
        </div>
      </fieldset>

    """)))}),format.raw/*29.6*/("""
  """)))}),format.raw/*30.4*/("""

  """),_display_(/*32.4*/if(regResult != null)/*32.25*/ {_display_(Seq[Any](format.raw/*32.27*/("""
    """),format.raw/*33.5*/("""<h2>predict labels</h2>
    """),_display_(/*34.6*/for(i <- 0 to 3) yield /*34.22*/ {_display_(Seq[Any](format.raw/*34.24*/("""
      """),format.raw/*35.7*/("""<br>
      Column"""),_display_(/*36.14*/i),format.raw/*36.15*/("""| """),_display_(/*36.18*/regResult(i)),format.raw/*36.30*/("""
    """)))}),format.raw/*37.6*/("""
    """),format.raw/*38.5*/("""<br>
    ....and """),_display_(/*39.14*/(regResult.length-4)),format.raw/*39.34*/("""
    """),format.raw/*40.5*/("""<br>
    """),_display_(/*41.6*/if(user!="NULL"&&user!="outsider"&&user!="")/*41.50*/ {_display_(Seq[Any](format.raw/*41.52*/("""
    """),_display_(/*42.6*/form(action = routes.Regression.download())/*42.49*/ {_display_(Seq[Any](format.raw/*42.51*/("""
      """),format.raw/*43.7*/("""<fieldset>
        <legend>download your result</legend>
        """),_display_(/*45.10*/inputText(
          field = down("csvPath"),
          '_label -> "Input your download path"
        )),format.raw/*48.10*/("""

        """),format.raw/*50.9*/("""<div class="submit">
          <input type="submit" id="submit" value="download">
        </div>
      </fieldset>

    """)))}),format.raw/*55.6*/("""
  """)))}),format.raw/*56.4*/("""
  """)))}),format.raw/*57.4*/("""
""")))}))
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
object log_transform extends log_transform_Scope0.log_transform_Scope1.log_transform
              /*
                  -- GENERATED --
                  DATE: Mon Dec 19 11:24:25 PHT 2016
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/mlTrans/log_transform.scala.html
                  HASH: 719168e767e671ca1be97cbab932ea2c05b9ce5b
                  MATRIX: 707->19|989->205|1016->207|1069->252|1108->254|1138->259|1166->279|1205->281|1236->286|1295->320|1355->372|1394->374|1427->381|1519->446|1663->569|1701->580|1836->694|1873->704|2022->823|2056->827|2087->832|2117->853|2157->855|2189->860|2244->889|2276->905|2316->907|2350->914|2395->932|2417->933|2447->936|2480->948|2516->954|2548->959|2593->977|2634->997|2666->1002|2702->1012|2755->1056|2795->1058|2827->1064|2879->1107|2919->1109|2953->1116|3046->1182|3170->1285|3207->1295|3358->1416|3392->1420|3426->1424
                  LINES: 23->3|28->3|29->4|29->4|29->4|31->6|31->6|31->6|32->7|33->8|33->8|33->8|34->9|39->14|42->17|44->19|47->22|49->24|54->29|55->30|57->32|57->32|57->32|58->33|59->34|59->34|59->34|60->35|61->36|61->36|61->36|61->36|62->37|63->38|64->39|64->39|65->40|66->41|66->41|66->41|67->42|67->42|67->42|68->43|70->45|73->48|75->50|80->55|81->56|82->57
                  -- GENERATED --
              */
          