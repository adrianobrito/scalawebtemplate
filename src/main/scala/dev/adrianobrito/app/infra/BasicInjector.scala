package dev.adrianobrito.app.infra

import com.google.inject.AbstractModule
import com.google.inject.Guice
import com.google.inject.Key
import com.google.inject.name.Names

trait BasicInjector {

  val injector = Guice.createInjector(TestModule);
  
  def inject[T:ClassManifest](name:String = null):T = {
    if(name == null){
    	val clazz:Class[T] = classManifest[T].erasure.asInstanceOf[Class[T]]
    	injector.getInstance(clazz);
    } else{
      val key:Key[T] = Key.get(classManifest[T].erasure.asInstanceOf[Class[T]], Names.named(name))
      injector.getInstance(key)
    }
    
  }
  
}