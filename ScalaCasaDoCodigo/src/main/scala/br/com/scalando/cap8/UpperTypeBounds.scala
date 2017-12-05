package br.com.scalando.cap8

object UpperTypeBounds extends App {
    
    import LowerTypeBounds._
    
    def printaFotos(medias: Set[Media]) = medias.foreach(println)
    def printaFotos2[T <: Media](medias: Set[T]) = medias.foreach(println)
    
    val setDeFotos = Set(Foto(1,Set.empty))
    
    printaFotos2(setDeFotos);
}