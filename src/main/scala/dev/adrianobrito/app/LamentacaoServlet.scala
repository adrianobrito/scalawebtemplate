package dev.adrianobrito.app

import dev.adrianobrito.app.infra.BasicInjector
import org.scalatra.json._
import org.json4s._
import org.json4s.jackson.JsonMethods._
import org.json4s.{DefaultFormats, Formats}
import dev.adrianobrito.app.dao.LamentacaoDao
import dev.adrianobrito.app.model.Lamentacao
import java.util.Date
import dev.adrianobrito.app.model.Lamentacao
import org.scalatra.Ok

class LamentacaoServlet extends ScalawebtemplateStack 
						with BasicInjector
						with JacksonJsonSupport{

  protected implicit val jsonFormats:Formats = DefaultFormats.withBigDecimal
  val lamentacaoDao:LamentacaoDao = inject[LamentacaoDao]
  
  before(){
    contentType = formats("json")
  }
  
  get("/listar"){
	  lamentacaoDao.listar
  }
  
  post("/salvar"){
	println(parsedBody)
    val lamentacao:Lamentacao = parsedBody.extract[Lamentacao]
    lamentacaoDao salvar(lamentacao)
	Ok();
  }
  
}