package br.com.tutiralspoint.collections

object CollectionsMap2 {
	def main(args: Array[String]): Unit = {
		
	    val colors1 = Map("red" -> "#FF0000",
	                     "azure" -> "#F0FFFFF",
	                     "peru" -> "#CD853F");
	    
	    val colors2 = Map("blue" -> "#FF0000",
	                     "yellow" -> "#F0FFFFF",
	                     "red" -> "#CD853F");
	    
	    var colors = colors1 ++ colors2;
	    println(" colors1 ++ colors2 : "+colors);
	    
	    colors = colors1.++(colors2);
	    println(" colors1.++(colors2) : "+colors);
	    
	}
}