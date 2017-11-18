package br.com.scalando.cap6

object Tuplas extends App {
	
    val dadosFoto = ("jcranck","reuniao dos scaladores")
    println(s"owner : ${dadosFoto._1} - title: ${dadosFoto._2}")
    
    val dadosFotos2 = (123,"reuniao dos scaladores")
    println(s"id : ${dadosFotos2._1} - title: ${dadosFotos2._2}")
    
    val dadosFoto3 = (123,"jcranck","reuniao dos scaladores")
    println(s"id: ${dadosFoto3._1} - owner : ${dadosFoto3._2} - title : ${dadosFoto3._3}")
    
    val dadosFoto4 = (123,"reunioa dos scaladores")
    val (id, title) = dadosFoto4
    
    println(s"id : $id")
    println(s"title : $title")
    
    val (id2, title2) = (123, "reunião dos scaladores")
    
    println(s"id: $id2")
    println(s"title: $title2")
    
}