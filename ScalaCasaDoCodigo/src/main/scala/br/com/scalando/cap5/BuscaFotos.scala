package br.com.scalando.cap5

object BuscaFotos {
	def buscaFotos(tag: Option[String]) = {
	    val tagBusca = tag.getOrElse("sem tag");
	    
	    val tagBuscaComErro = tag.get
	    val tagExiste = tag.isDefined
	    
	    ???
	}
	
	buscaFotos(Some("scala"))
	buscaFotos(None)
}