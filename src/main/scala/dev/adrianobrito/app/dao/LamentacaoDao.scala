package dev.adrianobrito.app.dao

import dev.adrianobrito.app.model.Lamentacao
import dev.adrianobrito.app.model.Lamentacao

trait LamentacaoDao {

  def salvar(lamentacao:Lamentacao)
  def listar():List[Lamentacao]
  
}