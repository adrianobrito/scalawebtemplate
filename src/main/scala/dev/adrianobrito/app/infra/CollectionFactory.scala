package dev.adrianobrito.app.infra

import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.MongoCollection

object CollectionFactory {
  
  def get(collection:String):MongoCollection ={
    MongoConnection()("test")(collection)
  }

}