package br.com.scalando.cap9

object ForComprehensions2 extends App {
	
    val caller = new FlickrCaller()
    val tags = Set("scala","java","jvm")    
    
    //filter
    println
    println("-"*50)
    
    val nomesFiltrados = tags.filter(_.startsWith("j"))
            .flatMap(tag => caller.buscaFotos(tag).map(_.title))
            
    nomesFiltrados foreach println
    
    println("-"*50)
    
    val nomesFiltradosFor = for {
        tag <- tags if tag.startsWith("j")
        foto <- caller.buscaFotos(tag)
    }yield foto.title
    
    nomesFiltradosFor foreach println
    
}