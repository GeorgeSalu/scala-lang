package br.com.scalando.cap7

import br.com.scalando.cap6.Foto

object FilterFind extends App{
	
    val foto1 = new Foto("id1", "jcranky", 1, "uma foto do jcranky")
    val foto2 = new Foto("id2", "jcranky", 1, "outra foto do jcranky")
    val foto3 = new Foto("id3", "jcranky", 1, "mais uma foto do jcranky")

    val fotos = List(foto1, foto2, foto3, foto1)

    def fotoJcranck(foto: Foto) = foto.owner == "jcranky"
    def fotosDoJCranck = fotos.filter(fotoJcranck)
    
    println(fotosDoJCranck)
    
    println("-"*50)
    
    def fotoDe(owner: String,foto: Foto) = foto.owner == owner
    val fotosDoJCrancky2 = fotos.filter(fotoDe("jcranck", _))
    println(fotosDoJCrancky2)
    
    
    val fotoDoJCranckOpt = fotos find fotoJcranck
    println(fotoDoJCranckOpt)
    
    println("-"*50)
    
    val fotosDoJCranck3 = fotos.filter(_.owner == "jcranck")
    val fotoDoJCranckOpt2 = fotos.find(_.owner == "jcranck")
    
    println(fotosDoJCranck3)
    println(fotoDoJCranckOpt2)
    
}