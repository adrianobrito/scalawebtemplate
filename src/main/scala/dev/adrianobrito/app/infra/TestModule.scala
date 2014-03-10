package dev.adrianobrito.app.infra

import com.google.inject.AbstractModule
import com.google.inject.Singleton

import dev.adrianobrito.app.dao.impl.LamentacaoDao
import dev.adrianobrito.app.dao.impl.LamentacaoDaoImpl
import net.codingwell.scalaguice.ScalaModule

object TestModule extends AbstractModule with ScalaModule {
	
  def configure {
    bind[LamentacaoDao].to[LamentacaoDaoImpl].in[Singleton]
  }
  
}