package br.com.scalando.cap3

object Usuario extends App {
	
    val usuarioOpt: Option[String] = None
    
    def usuarioAtual() = usuarioOpt match {
        case Some(usuario) => usuario
        case None => "anonimo"
    }
    
    def usuarioAtualUniforme = usuarioOpt match {
        case Some(usuario) => usuario
        case None => "anonimo"
    }
    
    println(s"Usuario: ${usuarioAtual()}")
    
}