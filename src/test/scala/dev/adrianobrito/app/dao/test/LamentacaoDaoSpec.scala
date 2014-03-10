package dev.adrianobrito.app.dao.test

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.joda.time.DateTime
import dev.adrianobrito.app.dao.impl.LamentacaoDaoImpl
import dev.adrianobrito.app.model.Lamentacao
import java.util.Date
import org.scalatest.BeforeAndAfter
import dev.adrianobrito.app.dao.impl.LamentacaoDaoManager
import dev.adrianobrito.app.infra.BasicInjector
import dev.adrianobrito.app.dao.impl.LamentacaoDao
import dev.adrianobrito.app.dao.impl.LamentacaoDao
import dev.adrianobrito.app.dao.impl.LamentacaoDao

class LamentacaoDaoSpec extends FlatSpec with Matchers with BeforeAndAfter with BasicInjector{
  
  val lamentacaoDao:LamentacaoDao = inject[LamentacaoDao];
  
  "LamentacaoDao" should " salvar uma lamentação " in {
    val listaAntiga:List[Lamentacao] = lamentacaoDao.listar
    val lamentacao = Lamentacao("Adriano", "Não aguento mais a mãe enchendo o saco", new Date());
    lamentacaoDao.salvar(lamentacao)
    val listaNova:List[Lamentacao] = lamentacaoDao.listar
    
    listaAntiga.length should be (listaNova.length - 1)
  }
  
  after {
    val lamentacoes:List[Lamentacao] = lamentacaoDao.listar
    lamentacoes.foreach(l => {
      LamentacaoDaoManager.remove(l)
    })
  }
  
}