package dev.adrianobrito.app.model

import java.util.Date
import org.bson.types.ObjectId

case class Lamentacao (message:String, nome:String, data:Date = new Date, id:ObjectId = new ObjectId) { }