package br.com.scalando.cap4

object CaseMedia extends App{
	
    case class Media(value: String)
    
    val fotos = Media("fotos")
    val videos = Media("videos")
    val all = Media("all")
    
    fotos == new Media("fotos")
    videos == new Media("videos")
    fotos == videos
    
    println(videos)
}