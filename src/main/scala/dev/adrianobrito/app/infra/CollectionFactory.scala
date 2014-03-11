package dev.adrianobrito.app.infra

import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.MongoCollection
import com.google.inject.Inject
import com.google.inject.name.Named

object CollectionFactory extends BasicInjector{
  
  val schemaName:String = inject[String]("schema");
  
  def get(collection:String):MongoCollection ={
    MongoConnection()(schemaName)(collection)
  }

}