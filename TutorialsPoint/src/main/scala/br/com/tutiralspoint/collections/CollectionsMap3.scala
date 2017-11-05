package br.com.tutiralspoint.collections

object CollectionsMap3 {
	def main(args: Array[String]): Unit = {
		
	    val colors = Map("red" -> "#FF0000",
	                     "azure" -> "#F0FFFFF",
	                     "peru" -> "#CD853F");
	   
	    colors.keys.foreach{ i => 
	        println("Key : "+i);
	        println("Value : "+colors(i));
	    }
	    
	    
	}
}