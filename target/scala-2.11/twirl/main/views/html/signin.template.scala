
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signin_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object signin_Scope1 {
import helper._
import util.InputForms

class signin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[scala.Tuple2[String, String]],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(myForm: Form[(String, String)])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.63*/("""


"""),format.raw/*6.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.46*/routes/*6.52*/.Assets.at("stylesheets/main.css")),format.raw/*6.86*/("""">
<div align="center">
    <br><br>
    <h3>Sign in</h3>

    """),_display_(/*11.6*/form(action = routes.SignIn.signIn)/*11.41*/ {_display_(Seq[Any](format.raw/*11.43*/("""
        """),format.raw/*12.9*/("""<fieldset>

            <legend>Input Parameters</legend>


            """),_display_(/*17.14*/inputText(
                field = myForm("username"),
                args = '_label -> "username"
            )),format.raw/*20.14*/("""

            """),_display_(/*22.14*/inputPassword(
                field = myForm("password"),
                args = '_label -> "password"
            )),format.raw/*25.14*/("""

            """),format.raw/*27.13*/("""<div class="submit">
                <input type="submit" id="submit" value="submit">
            </div>
        </fieldset>
    </div>
""")))}))
      }
    }
  }

  def render(myForm:Form[scala.Tuple2[String, String]],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(myForm)(messages)

  def f:((Form[scala.Tuple2[String, String]]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (myForm) => (messages) => apply(myForm)(messages)

  def ref: this.type = this

}


}
}

/**/
object signin extends signin_Scope0.signin_Scope1.signin
              /*
                  -- GENERATED --
                  DATE: Mon Nov 28 15:00:47 PHT 2016
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/signin.scala.html
                  HASH: 25216959083de9d25a63e5a3931217400f1b1bb3
                  MATRIX: 634->42|790->103|819->106|890->151|904->157|958->191|1048->255|1092->290|1132->292|1168->301|1268->374|1402->487|1444->502|1582->619|1624->633
                  LINES: 24->3|29->3|32->6|32->6|32->6|32->6|37->11|37->11|37->11|38->12|43->17|46->20|48->22|51->25|53->27
                  -- GENERATED --
              */
          