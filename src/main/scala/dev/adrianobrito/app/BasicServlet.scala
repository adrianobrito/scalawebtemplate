package dev.adrianobrito.app

import org.scalatra._
import scalate.ScalateSupport
import dev.adrianobrito.app.infra.BasicInjector
import dev.adrianobrito.app.dao.LamentacaoDao

class BasicServlet extends ScalawebtemplateStack with BasicInjector {
  
  get("/httptest/get"){
	  <h1> OK </h1> 
      <p> {params} </p>
  }
  
  post("/httptest/post"){
	  <h1> OK </h1> 
      <p>Params:  {params} </p>
      <p>Data: {request.body} </p>
  }
  
  put("/httptest/put"){
	  <h1> OK </h1> 
      <p>Params:  {params} </p>
      <p>Data: {request.body} </p>
  }
  
  delete("/httptest/delete"){
	  <h1> OK </h1> 
      <p>Params:  {params} </p>
      <p>Data: {request.body} </p>
  }
  
  
}
