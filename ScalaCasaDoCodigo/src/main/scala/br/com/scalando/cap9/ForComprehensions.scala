package br.com.scalando.cap9

import br.com.scalando.cap3.FlickrCaller

object ForComprehensions extends App {
	
    val caller = new FlickrCaller()
    val tags = Set("scala","java","jvm")
    
    tags.foreach { tag => 
        val fotos = caller.buscaFotos(tag)
        fotos foreach println
    }
    
    for {
        tag <- tags
        foto <- caller.buscaFotos(tag)
    } println (foto)
    
    val fotosMapeadas = tags.flatMap( tag => 
        caller.buscaFotos(tag).map(_.title)
    )
    
    val fotosMapeadasFor = for {
        tag <- tags
        foto <- caller.buscaFotos(tag)
    } yield foto.title
    fotosMapeadasFor foreach println
    
}