
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object showtext_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class showtext extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(result:String,user:String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),_display_(/*3.2*/main(title = "Message ", test = user)/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""

  """),_display_(/*5.4*/result),format.raw/*5.10*/("""
""")))}))
      }
    }
  }

  def render(result:String,user:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(result,user)(messages)

  def f:((String,String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (result,user) => (messages) => apply(result,user)(messages)

  def ref: this.type = this

}


}

/**/
object showtext extends showtext_Scope0.showtext
              /*
                  -- GENERATED --
                  DATE: Mon Dec 19 11:02:42 PHT 2016
                  SOURCE: /home/pzq317/Desktop/SparkMLPlatform2/app/views/showtext.scala.html
                  HASH: 2967a31e73c2e089e563606c4586821616cc2e03
                  MATRIX: 549->1|700->57|728->60|773->97|812->99|842->104|868->110
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|29->5
                  -- GENERATED --
              */
          