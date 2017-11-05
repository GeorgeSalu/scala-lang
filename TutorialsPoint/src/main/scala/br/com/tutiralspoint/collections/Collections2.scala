package br.com.tutiralspoint.collections

object Collections2 {
	def main(args: Array[String]): Unit = {
		
	    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil));
	    val fruit2 = "mangoes" :: ("banana" :: Nil);
	    
	    //use two or more lists
	    var fruit = fruit1 ::: fruit2;
	    println("fruit1 ::: fruit2 : "+fruit);
	    
	    //use two lists with Set .:::() method
	    fruit = fruit1.:::(fruit2);
	    println("fruit1.:::(fruit2) : "+fruit);
	    
	    //pass two or more lists as argumenst
	    fruit = List.concat(fruit1,fruit2);
	    println("List.concat(fruit1,fruit2) : "+fruit);
	    
	}
}