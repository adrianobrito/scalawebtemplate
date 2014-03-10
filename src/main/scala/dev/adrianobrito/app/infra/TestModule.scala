package dev.adrianobrito.app.infra

import com.google.inject.AbstractModule
import com.google.inject.Singleton
import dev.adrianobrito.app.dao.impl.LamentacaoDaoImpl
import net.codingwell.scalaguice.ScalaModule
import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.MongoCollection
import dev.adrianobrito.app.dao.LamentacaoDao

object TestModule extends AbstractModule with ScalaModule {

  def schema_name:String = "test"
  
  def configure {
    bind[LamentacaoDao].to[LamentacaoDaoImpl].in[Singleton]
  }
  
}