package dev.adrianobrito.app

import org.scalatra._
import scalate.ScalateSupport

class BasicServlet extends ScalawebtemplateStack {

  get("/") {
    <html>
      <body> a memoria nao caiu 10
        <marquee> Tomele </marquee>
      </body>
    </html>
  }
  
  get("lamentacao/listar"){
    
  }
  
}
