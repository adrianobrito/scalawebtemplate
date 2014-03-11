package dev.adrianobrito.app

import org.json4s.DefaultFormats
import org.json4s.Formats
import org.json4s.jvalue2extractable
import org.scalatra.json.JacksonJsonSupport

import dev.adrianobrito.app.dao.LamentacaoDao
import dev.adrianobrito.app.infra.BasicInjector
import dev.adrianobrito.app.model.Lamentacao

class LamentacaoServlet extends ScalawebtemplateStack 
						with BasicInjector
						with JacksonJsonSupport{

  protected implicit val jsonFormats:Formats = DefaultFormats.withBigDecimal
  val lamentacaoDao:LamentacaoDao = inject[LamentacaoDao]()
  
  before(){
    contentType = formats("json")
  }
  
  get("/listar"){
	  lamentacaoDao.listar
  }
  
  post("/salvar"){
    val lamentacao:Lamentacao = parsedBody.extract[Lamentacao]
    lamentacaoDao salvar(lamentacao)
  }
  
}