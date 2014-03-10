package dev.adrianobrito.app.dao.impl

import org.bson.types.ObjectId
import com.mongodb.casbah.Imports._
import com.novus.salat._
import com.novus.salat.dao._
import com.novus.salat.global._
import dev.adrianobrito.app.model.Lamentacao
import dev.adrianobrito.app.infra.CollectionFactory
import dev.adrianobrito.app.dao.LamentacaoDao

class LamentacaoDaoImpl extends LamentacaoDao{

  override def salvar(lamentacao:Lamentacao) {
    LamentacaoDaoManager.insert(lamentacao);
  }
  
  override def listar():List[Lamentacao] = {
   LamentacaoDaoManager.find(ref = MongoDBObject()).toList
  }
  
  
}
object LamentacaoDaoManager extends SalatDAO[Lamentacao, ObjectId](collection = CollectionFactory.get("lamentacoes"))