package br.com.scalando.cap4

object ObjectMedia extends App{
	
    class Media(value: String)
    
    case object Fotos extends Media("fotos")
    case object Videos extends Media("videos")
    case object Todas extends Media("all")
    
}