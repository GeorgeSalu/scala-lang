package br.com.scalando.cap7

import br.com.scalando.cap6.Foto

object SortWith extends App {

    val foto1 = new Foto("id1", "jcranky", 1, "uma foto do jcranky")
    val foto2 = new Foto("id2", "jcranky", 1, "outra foto do jcranky")
    val foto3 = new Foto("id3", "jcranky", 1, "mais uma foto do jcranky")

    val fotos = List(foto1, foto2, foto3, foto1)

    val numeros = List(1,2,3,4,5)
    val ordenada = numeros.sortWith((x,y) => x < y)
    println(ordenada)
    
    println("-"*50)
    
    def ehMaior(x: Int,y: Int) = x < y
    val ordenada2 = numeros sortWith ehMaior
    
    println("-"*50)
    
    val fotosOrdenadas = fotos.sortWith((f1,f2) => f1.title < f2.title)
    println(fotosOrdenadas)
    
    println("-"*50)
    
    val fotosOrdenadas2 = fotos.sortWith(_.title < _.title)
    println(fotosOrdenadas2)
}