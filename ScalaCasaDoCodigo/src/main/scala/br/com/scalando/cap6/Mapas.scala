package br.com.scalando.cap6

object Mapas extends App {
	
    val services = Map (
        ("busca", "flickr.photos.search"),
        ("tamanhos", "flickr.photos.getSizes")
    )
    
    val service2 = Map(
        "busca" -> "flickr.photos.search",
        "tamanhos" -> "flickr.photos.getSizes"
    )
    
    println(services == service2)

    val metodoBusca = services("busca")
    val metodoBuscaOpt = services.get("busca")
    
    val metodoBuscaPadrao = services.getOrElse("busca", "metodo padrao");
    
    val novosServices = services + ("untaged" -> "flickr.photo.getUntagged")
    println(novosServices)
    
    val menosServices = services - "busca"
    println(menosServices)
    
    val servicesAtualizados = services.updated("busca", "flick.photos.newSearch")
    println(servicesAtualizados)
}