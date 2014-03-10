package dev.adrianobrito.app.infra

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule
import dev.adrianobrito.app.dao.impl.LamentacaoDao
import dev.adrianobrito.app.dao.impl.LamentacaoDaoImpl
import com.google.inject.Singleton

class TestModule extends AbstractModule with ScalaModule {
	
  def configure {
    bind[LamentacaoDao].to[LamentacaoDaoImpl].in[Singleton]
  }
  
}