package br.com.tutiralspoint.collections

object CollectionsMap4 {
	def main(args: Array[String]): Unit = {
		
	    val colors = Map("red" -> "#FF0000",
	                     "azure" -> "#F0FFFFF",
	                     "peru" -> "#CD853F");
	   
	    
	    if(colors.contains("red")) {
	        println("Red key exists with values : "+colors("red"));
	    }else{
	        println("Red key does not exist");
	    }
	    
	    if(colors.contains("maroon")) {
	        println("Red key exists with values : "+colors("maroon"));
	    }else{
	        println("Red key does not exist");
	    }
	    
	}
}