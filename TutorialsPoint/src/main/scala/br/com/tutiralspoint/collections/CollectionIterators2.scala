package br.com.tutiralspoint.collections

object CollectionIterators2 {
	def main(args: Array[String]): Unit = {
		
	    val ita = Iterator(20,40,2,50,69, 90);
        val itb = Iterator(20,40,2,50,69, 90);
	    
        println("Maximun valued element : "+ita.max);
        println("Minimum valued element : "+itb.min);
        
	}
}