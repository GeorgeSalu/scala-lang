package br.com.scalando.cap3

import br.com.scalando.cap2.ContaFoto.Foto

class FlickrCaller {
	val apiKey = "sua-api-key";
	
	//sem chaves, implementacao com apenas uma linha
	def buscaFotosUmaLinha(tag: String): Seq[Foto] = ???
	
	def buscaFotos(tag: String): Seq[Foto] = {
	    //algoritmo complexo de acesso ao flickr aqui
	    
	    ???
	}
	
	//usando return, deve ser evitado
	def buscaFotosReturn(tag: String): Seq[Foto] = {
	    //algoritmo complexo de acesso ao flickr aqui
	    return ???
	}
	
}