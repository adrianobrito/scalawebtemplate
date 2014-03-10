package dev.adrianobrito.app.infra

import com.google.inject.AbstractModule
import com.google.inject.Guice

trait BasicInjector {

  val injector = Guice.createInjector(TestModule);
  
  def inject[T:ClassManifest]():T = {
    val clazz:Class[T] = classManifest[T].erasure.asInstanceOf[Class[T]]
    injector.getInstance(clazz);
  }
  
}