package br.com.scalando.cap6

object ImprimeFoto extends App{
	def imprimeFoto(f: Foto) = println(s"Foto id = ${f.id} owner = ${f.owner}")
	
	val foto1 = Foto("1","jcranck",123,"Minha foto 1")
	val foto2 = Foto("1","jcranck",123,"Minha foto 2")
	
	val fotos = List(foto1,foto2)
	fotos.foreach(imprimeFoto)
	
}