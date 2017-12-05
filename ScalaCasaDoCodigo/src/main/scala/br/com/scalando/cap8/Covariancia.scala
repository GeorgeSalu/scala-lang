package br.com.scalando.cap8

import br.com.scalando.cap8.Invariancia.FotoDetalhada


object Covariancia extends App {

    import LowerTypeBounds._
    import Invariancia.FotoDetalhada
    
    val fotos = List(new Foto(1,Set.empty))    
    val fotosDetalhadas = List(
        new FotoDetalhada(2,"jcranck",321,"scalax2",Set.empty,"detalhes da foto")        
    )
    
    def printFotos(fotos: List[Foto]) = fotos foreach println
    
    printFotos(fotos)
    printFotos(fotosDetalhadas)
}