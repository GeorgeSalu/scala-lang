package br.com.tutiralspoint.collections

object CollectionTuple2 {
	def main(args: Array[String]): Unit = {
		
	    val t = (4,3,2,1);
	    
	    t.productIterator.foreach{ i =>
	        println("Value = "+i);
	    }
	    
	}
}