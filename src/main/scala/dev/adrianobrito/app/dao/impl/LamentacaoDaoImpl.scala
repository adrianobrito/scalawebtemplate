package dev.adrianobrito.app.dao.impl

import com.novus.salat._
import com.novus.salat.global._
import com.novus.salat.annotations._
import com.novus.salat.dao._
import com.mongodb.casbah.Imports._
import org.bson.types.ObjectId
import com.mongodb.casbah.MongoConnection
import dev.adrianobrito.app.model.Lamentacao

class LamentacaoDaoImpl extends LamentacaoDao{

  override def salvar(lamentacao:Lamentacao) {
    LamentacaoDaoManager.insert(lamentacao);
  }
  
  override def listar():List[Lamentacao] = {
   LamentacaoDaoManager.find(ref = MongoDBObject()).toList
  }
  
}
object LamentacaoDaoManager extends SalatDAO[Lamentacao, ObjectId](collection = MongoConnection()("scalatemplate")("lamentacoes"))