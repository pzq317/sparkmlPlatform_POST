
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object signup_Scope1 {
import helper._
import util.InputForms

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[scala.Tuple3[String, String, String]],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(myForm: Form[(String, String,String)])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.70*/("""


"""),format.raw/*6.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.46*/routes/*6.52*/.Assets.at("stylesheets/main.css")),format.raw/*6.86*/("""">
<div align="center">
  <br><br>
  <h3>Sign in</h3>

  """),_display_(/*11.4*/form(action = routes.SignIn.signUp)/*11.39*/ {_display_(Seq[Any](format.raw/*11.41*/("""
    """),format.raw/*12.5*/("""<fieldset>

      <legend>Input Parameters</legend>


      """),_display_(/*17.8*/inputText(
        field = myForm("username"),
        args = '_label -> "username"
      )),format.raw/*20.8*/("""
      """),_display_(/*21.8*/inputText(
        field = myForm("email"),
        args = '_label -> "E-mail"
      )),format.raw/*24.8*/("""

      """),_display_(/*26.8*/inputPassword(
        field = myForm("password"),
        args = '_label -> "password"

      )),format.raw/*30.8*/("""

      """),format.raw/*32.7*/("""<div class="submit">
        <input type="submit" id="submit" value="submit">
      </div>
    </fieldset>
  </div>
""")))}))
      }
    }
  }

  def render(myForm:Form[scala.Tuple3[String, String, String]],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(myForm)(messages)

  def f:((Form[scala.Tuple3[String, String, String]]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (myForm) => (messages) => apply(myForm)(messages)

  def ref: this.type = this

}


}
}

/**/
object signup extends signup_Scope0.signup_Scope1.signup
              /*
                  -- GENERATED --
                  DATE: Mon Nov 28 15:00:47 PHT 2016
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/signup.scala.html
                  HASH: 75761c2b5ce31ac7982c9b42607da067c10b3a8a
                  MATRIX: 642->42|805->110|834->113|905->158|919->164|973->198|1057->256|1101->291|1141->293|1173->298|1260->359|1371->450|1405->458|1511->544|1546->553|1662->649|1697->657
                  LINES: 24->3|29->3|32->6|32->6|32->6|32->6|37->11|37->11|37->11|38->12|43->17|46->20|47->21|50->24|52->26|56->30|58->32
                  -- GENERATED --
              */
          