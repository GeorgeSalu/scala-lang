package br.com.scalando.cap7

import br.com.scalando.cap6.Foto

object Filter extends App {
    
    val foto1 = new Foto("id1", "jcranky", 1, "uma foto do jcranky")
    val foto2 = new Foto("id2", "jcranky", 1, "outra foto do jcranky")
    val foto3 = new Foto("id3", "jcranky", 1, "mais uma foto do jcranky")

    val fotos = List(foto1, foto2, foto3, foto1)

    def fotosDoJCrancky(foto: Foto) = foto.owner == "jcrancky"
    val p: (Foto) => Boolean = fotosDoJCrancky
    
    fotos.filter(fotosDoJCrancky)

    println("-"*50)
    
    fotos.filter(p)
    
    println("-"*50)
    
    fotos.filter(foto => foto.owner == "jcrancky")
    
    println("-"*50)
    
    fotos.filter(_.owner == "jcrancky")
    
}