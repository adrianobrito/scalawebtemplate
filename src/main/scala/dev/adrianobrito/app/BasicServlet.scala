package dev.adrianobrito.app

import org.scalatra._
import scalate.ScalateSupport
import dev.adrianobrito.app.infra.BasicInjector
import dev.adrianobrito.app.dao.LamentacaoDao

class BasicServlet extends ScalawebtemplateStack with BasicInjector {

  val lamentacaoDao:LamentacaoDao = inject[LamentacaoDao]
  
  get("/") {
    <html>
      <body> a memoria nao caiu 10
        <marquee> Tomele </marquee>
      </body>
    </html>
  }
  
  get("/lamentacao/listar"){
    
  }
  
  post("/lamentacao/salvar"){
    
  }
  
}
