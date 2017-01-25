package controllers

import javax.inject.Inject
import java.io._

import play.api.data.Form
import play.api.data.Forms._
import play.api.db.Database
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc.{Action, Controller, Session}
import views.html
import controllers.util.{DatabaseCon, InputForms, SparkConfCreator, Utilities}
import java.io.File
import org.apache.spark.sql.types._
import org.apache.spark.sql._
import scala.text
import java.net.URL

import models.StatSummary
import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.mllib.stat.{MultivariateStatisticalSummary, Statistics}

import scalax.io.JavaConverters._
import scalax.file.Path
import org.json4s.jackson.JsonMethods._
import org.json4s.JsonDSL._



/**
  * Created by superorange on 4/1/16.
  */
class test @Inject()(db: Database)(val messagesApi: MessagesApi) extends Controller with I18nSupport {


  def parseDouble(s: String) = try { Some(s.toDouble) } catch { case _ => None }


  def test = Action{implicit request=>
    val DB = new DatabaseCon(db)
    InputForms.test.bindFromRequest().fold(
      formWithErrors => {
        println("ERROR" + formWithErrors)
        BadRequest("error in download")
      },{ case(username,url,filename)=>
          println(username,url,filename)
        var datatype: Array[(String, String)] =Array()
        var boundForm: Form[StatSummary] = InputForms.summaryForm
        var finalString=org.json4s.jackson.renderJValue("")
        var err:Boolean= true
        var errmessage = ""
          //------------check user-----------//
          if(DB.checkUser(username)){
            val SPARK = new SparkConfCreator(Utilities.master,this.getClass.getSimpleName)

            val sc = SPARK.getSC()
            val sparkSession = SPARK.getSession()

            try {
              //println("path",url)

              //val df = sparkSession.read.option("inferSchema", "true").option("header",true).csv("/home/pzq317/Desktop/platform_data/iris.csv")
              val html = scala.io.Source.fromURL(url).mkString
              //val html = "sepal_length,sepal_width,petal_length,petal_width,species\n5.1,3.5,1.4,0.2,setosa\n4.9,3,1.4,0.2,setosa\n4.7,3.2,1.3,0.2,setosa\n4.6,3.1,1.5,0.2,setosa\n5,3.6,1.4,0.2,setosa\n5.4,3.9,1.7,0.4,setosa\n4.6,3.4,1.4,0.3,setosa\n5,3.4,1.5,0.2,setosa\n4.4,2.9,1.4,0.2,setosa\n4.9,3.1,1.5,0.1,setosa\n5.4,3.7,1.5,0.2,setosa\n4.8,3.4,1.6,0.2,setosa\n4.8,3,1.4,0.1,setosa\n4.3,3,1.1,0.1,setosa\n5.8,4,1.2,0.2,setosa\n5.7,4.4,1.5,0.4,setosa\n5.4,3.9,1.3,0.4,setosa\n5.1,3.5,1.4,0.3,setosa\n5.7,3.8,1.7,0.3,setosa\n5.1,3.8,1.5,0.3,setosa\n5.4,3.4,1.7,0.2,setosa\n5.1,3.7,1.5,0.4,setosa\n4.6,3.6,1,0.2,setosa\n5.1,3.3,1.7,0.5,setosa\n4.8,3.4,1.9,0.2,setosa\n5,3,1.6,0.2,setosa\n5,3.4,1.6,0.4,setosa\n5.2,3.5,1.5,0.2,setosa\n5.2,3.4,1.4,0.2,setosa\n4.7,3.2,1.6,0.2,setosa\n4.8,3.1,1.6,0.2,setosa\n5.4,3.4,1.5,0.4,setosa\n5.2,4.1,1.5,0.1,setosa\n5.5,4.2,1.4,0.2,setosa\n4.9,3.1,1.5,0.1,setosa\n5,3.2,1.2,0.2,setosa\n5.5,3.5,1.3,0.2,setosa\n4.9,3.1,1.5,0.1,setosa\n4.4,3,1.3,0.2,setosa\n5.1,3.4,1.5,0.2,setosa\n5,3.5,1.3,0.3,setosa\n4.5,2.3,1.3,0.3,setosa\n4.4,3.2,1.3,0.2,setosa\n5,3.5,1.6,0.6,setosa\n5.1,3.8,1.9,0.4,setosa\n4.8,3,1.4,0.3,setosa\n5.1,3.8,1.6,0.2,setosa\n4.6,3.2,1.4,0.2,setosa\n5.3,3.7,1.5,0.2,setosa\n5,3.3,1.4,0.2,setosa\n7,3.2,4.7,1.4,versicolor\n6.4,3.2,4.5,1.5,versicolor\n6.9,3.1,4.9,1.5,versicolor\n5.5,2.3,4,1.3,versicolor\n6.5,2.8,4.6,1.5,versicolor\n5.7,2.8,4.5,1.3,versicolor\n6.3,3.3,4.7,1.6,versicolor\n4.9,2.4,3.3,1,versicolor\n6.6,2.9,4.6,1.3,versicolor\n5.2,2.7,3.9,1.4,versicolor\n5,2,3.5,1,versicolor\n5.9,3,4.2,1.5,versicolor\n6,2.2,4,1,versicolor\n6.1,2.9,4.7,1.4,versicolor\n5.6,2.9,3.6,1.3,versicolor\n6.7,3.1,4.4,1.4,versicolor\n5.6,3,4.5,1.5,versicolor\n5.8,2.7,4.1,1,versicolor\n6.2,2.2,4.5,1.5,versicolor\n5.6,2.5,3.9,1.1,versicolor\n5.9,3.2,4.8,1.8,versicolor\n6.1,2.8,4,1.3,versicolor\n6.3,2.5,4.9,1.5,versicolor\n6.1,2.8,4.7,1.2,versicolor\n6.4,2.9,4.3,1.3,versicolor\n6.6,3,4.4,1.4,versicolor\n6.8,2.8,4.8,1.4,versicolor\n6.7,3,5,1.7,versicolor\n6,2.9,4.5,1.5,versicolor\n5.7,2.6,3.5,1,versicolor\n5.5,2.4,3.8,1.1,versicolor\n5.5,2.4,3.7,1,versicolor\n5.8,2.7,3.9,1.2,versicolor\n6,2.7,5.1,1.6,versicolor\n5.4,3,4.5,1.5,versicolor\n6,3.4,4.5,1.6,versicolor\n6.7,3.1,4.7,1.5,versicolor\n6.3,2.3,4.4,1.3,versicolor\n5.6,3,4.1,1.3,versicolor\n5.5,2.5,4,1.3,versicolor\n5.5,2.6,4.4,1.2,versicolor\n6.1,3,4.6,1.4,versicolor\n5.8,2.6,4,1.2,versicolor\n5,2.3,3.3,1,versicolor\n5.6,2.7,4.2,1.3,versicolor\n5.7,3,4.2,1.2,versicolor\n5.7,2.9,4.2,1.3,versicolor\n6.2,2.9,4.3,1.3,versicolor\n5.1,2.5,3,1.1,versicolor\n5.7,2.8,4.1,1.3,versicolor\n6.3,3.3,6,2.5,virginica\n5.8,2.7,5.1,1.9,virginica\n7.1,3,5.9,2.1,virginica\n6.3,2.9,5.6,1.8,virginica\n6.5,3,5.8,2.2,virginica\n7.6,3,6.6,2.1,virginica\n4.9,2.5,4.5,1.7,virginica\n7.3,2.9,6.3,1.8,virginica\n6.7,2.5,5.8,1.8,virginica\n7.2,3.6,6.1,2.5,virginica\n6.5,3.2,5.1,2,virginica\n6.4,2.7,5.3,1.9,virginica\n6.8,3,5.5,2.1,virginica\n5.7,2.5,5,2,virginica\n5.8,2.8,5.1,2.4,virginica\n6.4,3.2,5.3,2.3,virginica\n6.5,3,5.5,1.8,virginica\n7.7,3.8,6.7,2.2,virginica\n7.7,2.6,6.9,2.3,virginica\n6,2.2,5,1.5,virginica\n6.9,3.2,5.7,2.3,virginica\n5.6,2.8,4.9,2,virginica\n7.7,2.8,6.7,2,virginica\n6.3,2.7,4.9,1.8,virginica\n6.7,3.3,5.7,2.1,virginica\n7.2,3.2,6,1.8,virginica\n6.2,2.8,4.8,1.8,virginica\n6.1,3,4.9,1.8,virginica\n6.4,2.8,5.6,2.1,virginica\n7.2,3,5.8,1.6,virginica\n7.4,2.8,6.1,1.9,virginica\n7.9,3.8,6.4,2,virginica\n6.4,2.8,5.6,2.2,virginica\n6.3,2.8,5.1,1.5,virginica\n6.1,2.6,5.6,1.4,virginica\n7.7,3,6.1,2.3,virginica\n6.3,3.4,5.6,2.4,virginica\n6.4,3.1,5.5,1.8,virginica\n6,3,4.8,1.8,virginica\n6.9,3.1,5.4,2.1,virginica\n6.7,3.1,5.6,2.4,virginica\n6.9,3.1,5.1,2.3,virginica\n5.8,2.7,5.1,1.9,virginica\n6.8,3.2,5.9,2.3,virginica\n6.7,3.3,5.7,2.5,virginica\n6.7,3,5.2,2.3,virginica\n6.3,2.5,5,1.9,virginica\n6.5,3,5.2,2,virginica\n6.2,3.4,5.4,2.3,virginica\n5.9,3,5.1,1.8,virginica"
              var a = html.split("\n")

              var arr = a(1).split(",")
              //val fields = a(0).split(",").map(fieldName => StructField(fieldName, StringType, nullable = true))
              val fields = a(0).split(",").zipWithIndex.map(fieldName => StructField(fieldName._1, if(parseDouble(arr(fieldName._2))==None){StringType}else{DoubleType}, nullable = true))
              var rdd = sc.parallelize(a)

              val schema = StructType(fields)

              //var c = rdd.zipWithIndex.filter(x=>x._2>0).map(_._1).collect

              var d= rdd.zipWithIndex.filter(x=>x._2>0).map(_._1)

              //???????????????????????????????

              var rowRDD = d.map(_.split(",")).map(attributes => Row(attributes(0).toDouble, attributes(1).toDouble, attributes(2).toDouble,attributes(3).toDouble,attributes(4)))

              //???????????????????????????????

              //var rowRDD = d.map(x=>Row(x))//no String DOuble
              //var rowRDD = d.map(_.split(",")).map(attributes => Row(attributes(0), attributes(1), attributes(2),attributes(3),attributes(4)))

              val df = sparkSession.createDataFrame(rowRDD, schema)

              datatype= df.dtypes
              val columnNames =df.columns
              df.show
              println(df.schema)
              val isStringArr = new Array[(Boolean,String)](df.columns.size)

              datatype.zipWithIndex.foreach(x=> {
                if ((x._1._2) == "StringType"){ isStringArr(x._2) = (true,x._1._1)}
                else{isStringArr(x._2) = (false,x._1._1)}
              }
              )


              //val rawData = sc.textFile("/home/pzq317/Desktop/platform_data/iris.csv")
              val rawData = rdd
              val parseData = rawData.zipWithIndex.filter(_._2>2).map{line=>
                Vectors.dense(
                  line._1.trim.split(",").zipWithIndex.filter(x=> ( !isStringArr(x._2.toInt)._1  )).map(_._1.toDouble)
                )
              }

              val summaryResult: MultivariateStatisticalSummary = Statistics.colStats(parseData)

              println("mean",summaryResult.mean)
              val corMatrix =Statistics.corr(parseData)

              val lM = corMatrix.toArray.grouped(corMatrix.numRows).toArray

              for(i<-0 to lM.length-1){
                var a=columnNames(i)

                lM(i).foreach(x=>{val a = List(BigDecimal(x).setScale(3, BigDecimal.RoundingMode.HALF_UP).toDouble); })

                var list = List[Double]()
                lM(i).foreach(
                  x=> {
                    list = list :+ BigDecimal(x).setScale(3, BigDecimal.RoundingMode.HALF_UP).toDouble
                  }
                )
                finalString = finalString merge org.json4s.jackson.renderJValue(a, list)

              }
              println("mean",summaryResult.mean)

              val x = Map(
                "max" -> summaryResult.max.toString,
                "mean" -> summaryResult.mean.toString,
                "min" -> summaryResult.min.toString,
                "variance" -> summaryResult.variance.toString,
                "numNonZero" -> summaryResult.numNonzeros.toString,
                "count" -> summaryResult.count.toString
              )
              boundForm = InputForms.summaryForm.bind(x)

            }
            catch {
              case e: Exception => {
                // Ok(html.error(e.toString))   //useless
                println("error in preprocess:" + e)
                errmessage = "error in preprocess:" + e
                SPARK.closeAll()
                err=false
              }

            } finally {
              SPARK.closeAll()
              //Ok(html.preprocess.dataimport_pre1(null,null,InputForms.InputParam.fill(path,false),header.toString,datatype, boundForm, pretty(finalString),jeffrey))

            }

          }else{
            var success = (new File(filename)).mkdirs();
            if(success) {
              val SPARK = new SparkConfCreator(Utilities.master,this.getClass.getSimpleName)

              val sc = SPARK.getSC()
              val sparkSession = SPARK.getSession()

              try {
                //println("path",url)

                //val df = sparkSession.read.option("inferSchema", "true").option("header",true).csv("/home/pzq317/Desktop/platform_data/iris.csv")
                val html = scala.io.Source.fromURL(url).mkString
                //val html = "sepal_length,sepal_width,petal_length,petal_width,species\n5.1,3.5,1.4,0.2,setosa\n4.9,3,1.4,0.2,setosa\n4.7,3.2,1.3,0.2,setosa\n4.6,3.1,1.5,0.2,setosa\n5,3.6,1.4,0.2,setosa\n5.4,3.9,1.7,0.4,setosa\n4.6,3.4,1.4,0.3,setosa\n5,3.4,1.5,0.2,setosa\n4.4,2.9,1.4,0.2,setosa\n4.9,3.1,1.5,0.1,setosa\n5.4,3.7,1.5,0.2,setosa\n4.8,3.4,1.6,0.2,setosa\n4.8,3,1.4,0.1,setosa\n4.3,3,1.1,0.1,setosa\n5.8,4,1.2,0.2,setosa\n5.7,4.4,1.5,0.4,setosa\n5.4,3.9,1.3,0.4,setosa\n5.1,3.5,1.4,0.3,setosa\n5.7,3.8,1.7,0.3,setosa\n5.1,3.8,1.5,0.3,setosa\n5.4,3.4,1.7,0.2,setosa\n5.1,3.7,1.5,0.4,setosa\n4.6,3.6,1,0.2,setosa\n5.1,3.3,1.7,0.5,setosa\n4.8,3.4,1.9,0.2,setosa\n5,3,1.6,0.2,setosa\n5,3.4,1.6,0.4,setosa\n5.2,3.5,1.5,0.2,setosa\n5.2,3.4,1.4,0.2,setosa\n4.7,3.2,1.6,0.2,setosa\n4.8,3.1,1.6,0.2,setosa\n5.4,3.4,1.5,0.4,setosa\n5.2,4.1,1.5,0.1,setosa\n5.5,4.2,1.4,0.2,setosa\n4.9,3.1,1.5,0.1,setosa\n5,3.2,1.2,0.2,setosa\n5.5,3.5,1.3,0.2,setosa\n4.9,3.1,1.5,0.1,setosa\n4.4,3,1.3,0.2,setosa\n5.1,3.4,1.5,0.2,setosa\n5,3.5,1.3,0.3,setosa\n4.5,2.3,1.3,0.3,setosa\n4.4,3.2,1.3,0.2,setosa\n5,3.5,1.6,0.6,setosa\n5.1,3.8,1.9,0.4,setosa\n4.8,3,1.4,0.3,setosa\n5.1,3.8,1.6,0.2,setosa\n4.6,3.2,1.4,0.2,setosa\n5.3,3.7,1.5,0.2,setosa\n5,3.3,1.4,0.2,setosa\n7,3.2,4.7,1.4,versicolor\n6.4,3.2,4.5,1.5,versicolor\n6.9,3.1,4.9,1.5,versicolor\n5.5,2.3,4,1.3,versicolor\n6.5,2.8,4.6,1.5,versicolor\n5.7,2.8,4.5,1.3,versicolor\n6.3,3.3,4.7,1.6,versicolor\n4.9,2.4,3.3,1,versicolor\n6.6,2.9,4.6,1.3,versicolor\n5.2,2.7,3.9,1.4,versicolor\n5,2,3.5,1,versicolor\n5.9,3,4.2,1.5,versicolor\n6,2.2,4,1,versicolor\n6.1,2.9,4.7,1.4,versicolor\n5.6,2.9,3.6,1.3,versicolor\n6.7,3.1,4.4,1.4,versicolor\n5.6,3,4.5,1.5,versicolor\n5.8,2.7,4.1,1,versicolor\n6.2,2.2,4.5,1.5,versicolor\n5.6,2.5,3.9,1.1,versicolor\n5.9,3.2,4.8,1.8,versicolor\n6.1,2.8,4,1.3,versicolor\n6.3,2.5,4.9,1.5,versicolor\n6.1,2.8,4.7,1.2,versicolor\n6.4,2.9,4.3,1.3,versicolor\n6.6,3,4.4,1.4,versicolor\n6.8,2.8,4.8,1.4,versicolor\n6.7,3,5,1.7,versicolor\n6,2.9,4.5,1.5,versicolor\n5.7,2.6,3.5,1,versicolor\n5.5,2.4,3.8,1.1,versicolor\n5.5,2.4,3.7,1,versicolor\n5.8,2.7,3.9,1.2,versicolor\n6,2.7,5.1,1.6,versicolor\n5.4,3,4.5,1.5,versicolor\n6,3.4,4.5,1.6,versicolor\n6.7,3.1,4.7,1.5,versicolor\n6.3,2.3,4.4,1.3,versicolor\n5.6,3,4.1,1.3,versicolor\n5.5,2.5,4,1.3,versicolor\n5.5,2.6,4.4,1.2,versicolor\n6.1,3,4.6,1.4,versicolor\n5.8,2.6,4,1.2,versicolor\n5,2.3,3.3,1,versicolor\n5.6,2.7,4.2,1.3,versicolor\n5.7,3,4.2,1.2,versicolor\n5.7,2.9,4.2,1.3,versicolor\n6.2,2.9,4.3,1.3,versicolor\n5.1,2.5,3,1.1,versicolor\n5.7,2.8,4.1,1.3,versicolor\n6.3,3.3,6,2.5,virginica\n5.8,2.7,5.1,1.9,virginica\n7.1,3,5.9,2.1,virginica\n6.3,2.9,5.6,1.8,virginica\n6.5,3,5.8,2.2,virginica\n7.6,3,6.6,2.1,virginica\n4.9,2.5,4.5,1.7,virginica\n7.3,2.9,6.3,1.8,virginica\n6.7,2.5,5.8,1.8,virginica\n7.2,3.6,6.1,2.5,virginica\n6.5,3.2,5.1,2,virginica\n6.4,2.7,5.3,1.9,virginica\n6.8,3,5.5,2.1,virginica\n5.7,2.5,5,2,virginica\n5.8,2.8,5.1,2.4,virginica\n6.4,3.2,5.3,2.3,virginica\n6.5,3,5.5,1.8,virginica\n7.7,3.8,6.7,2.2,virginica\n7.7,2.6,6.9,2.3,virginica\n6,2.2,5,1.5,virginica\n6.9,3.2,5.7,2.3,virginica\n5.6,2.8,4.9,2,virginica\n7.7,2.8,6.7,2,virginica\n6.3,2.7,4.9,1.8,virginica\n6.7,3.3,5.7,2.1,virginica\n7.2,3.2,6,1.8,virginica\n6.2,2.8,4.8,1.8,virginica\n6.1,3,4.9,1.8,virginica\n6.4,2.8,5.6,2.1,virginica\n7.2,3,5.8,1.6,virginica\n7.4,2.8,6.1,1.9,virginica\n7.9,3.8,6.4,2,virginica\n6.4,2.8,5.6,2.2,virginica\n6.3,2.8,5.1,1.5,virginica\n6.1,2.6,5.6,1.4,virginica\n7.7,3,6.1,2.3,virginica\n6.3,3.4,5.6,2.4,virginica\n6.4,3.1,5.5,1.8,virginica\n6,3,4.8,1.8,virginica\n6.9,3.1,5.4,2.1,virginica\n6.7,3.1,5.6,2.4,virginica\n6.9,3.1,5.1,2.3,virginica\n5.8,2.7,5.1,1.9,virginica\n6.8,3.2,5.9,2.3,virginica\n6.7,3.3,5.7,2.5,virginica\n6.7,3,5.2,2.3,virginica\n6.3,2.5,5,1.9,virginica\n6.5,3,5.2,2,virginica\n6.2,3.4,5.4,2.3,virginica\n5.9,3,5.1,1.8,virginica"
                var a = html.split("\n")

                var arr = a(1).split(",")
                //val fields = a(0).split(",").map(fieldName => StructField(fieldName, StringType, nullable = true))
                val fields = a(0).split(",").zipWithIndex.map(fieldName => StructField(fieldName._1, if(parseDouble(arr(fieldName._2))==None){StringType}else{DoubleType}, nullable = true))
                var rdd = sc.parallelize(a)

                val schema = StructType(fields)

                //var c = rdd.zipWithIndex.filter(x=>x._2>0).map(_._1).collect

                var d= rdd.zipWithIndex.filter(x=>x._2>0).map(_._1)

                //???????????????????????????????????


                var rowRDD = d.map(_.split(",")).map(attributes => Row(attributes(0).toDouble, attributes(1).toDouble, attributes(2).toDouble,attributes(3).toDouble,attributes(4)))


                //???????????????????????????????????


                //var rowRDD = d.map(_.split(",")).map(attributes => Row(attributes(0), attributes(1), attributes(2),attributes(3),attributes(4)))

                val df = sparkSession.createDataFrame(rowRDD, schema)

                datatype= df.dtypes
                val columnNames =df.columns
                df.show
                println(df.schema)
                val isStringArr = new Array[(Boolean,String)](df.columns.size)

                datatype.zipWithIndex.foreach(x=> {
                  if ((x._1._2) == "StringType"){ isStringArr(x._2) = (true,x._1._1)}
                  else{isStringArr(x._2) = (false,x._1._1)}
                }
                )


                //val rawData = sc.textFile("/home/pzq317/Desktop/platform_data/iris.csv")
                val rawData = rdd
                val parseData = rawData.zipWithIndex.filter(_._2>2).map{line=>
                  Vectors.dense(
                    line._1.trim.split(",").zipWithIndex.filter(x=> ( !isStringArr(x._2.toInt)._1  )).map(_._1.toDouble)
                  )
                }

                val summaryResult: MultivariateStatisticalSummary = Statistics.colStats(parseData)

                println("mean",summaryResult.mean)
                val corMatrix =Statistics.corr(parseData)

                val lM = corMatrix.toArray.grouped(corMatrix.numRows).toArray

                for(i<-0 to lM.length-1){
                  var a=columnNames(i)

                  lM(i).foreach(x=>{val a = List(BigDecimal(x).setScale(3, BigDecimal.RoundingMode.HALF_UP).toDouble); })

                  var list = List[Double]()
                  lM(i).foreach(
                    x=> {
                      list = list :+ BigDecimal(x).setScale(3, BigDecimal.RoundingMode.HALF_UP).toDouble
                    }
                  )
                  finalString = finalString merge org.json4s.jackson.renderJValue(a, list)

                }
                println("mean",summaryResult.mean)

                val x = Map(
                  "max" -> summaryResult.max.toString,
                  "mean" -> summaryResult.mean.toString,
                  "min" -> summaryResult.min.toString,
                  "variance" -> summaryResult.variance.toString,
                  "numNonZero" -> summaryResult.numNonzeros.toString,
                  "count" -> summaryResult.count.toString
                )
                boundForm = InputForms.summaryForm.bind(x)

              }
              catch {
                case e: Exception => {
                  // Ok(html.error(e.toString))   //useless
                  println("error in preprocess:" + e)
                  errmessage = "error in preprocess:" + e
                  SPARK.closeAll()
                  err=false
                }

              } finally {
                SPARK.closeAll()
                //Ok(html.preprocess.dataimport_pre1(null,null,InputForms.InputParam.fill(path,false),header.toString,datatype, boundForm, pretty(finalString),jeffrey))

              }
              println("file created")
            }else{
              println("file failed wuwu")
            }
            //File dir = new File(filename);
            //dir.mkdir();
            }
        Ok(html.preprocess.dataimport_pre1(null, null, InputForms.InputParam.fill("/home/pzq317/Desktop/platform_data/iris.csv", false), "true", datatype, boundForm, pretty(finalString), null))
      })

    //Ok("test")
  }

}
