package br.com.tutiralspoint.collections

object CollectionsSet2 {
	def main(args: Array[String]): Unit = {
		
	    val fruit1 = Set("apples","oranges","pears");
	    val fruit2 = Set("mangoes","banana");
	    
	    //use two 
	    var fruit = fruit1 ++ fruit2;
	    println(" fruit1 ++ fruit2 : "+fruit);
	    
	    fruit = fruit1.++(fruit2);
	    println(" fruit1.++(fruit2) : "+fruit);
	    
	}
}