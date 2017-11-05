package br.com.tutorialspoint.arrays

object Arrays {
	def main(args: Array[String]): Unit = {
		
	    var myList = List(1.9,2.9,3.4,3.5);
	    
	    //print all the list
	    for(x <- myList) {
	        println(x)
	    }
	    
	    //print sum of all elements
	    var total = 0.0;
	    for(i <- 0 to (myList.length - 1)) {
	        total += myList(i);
	    }
	    println("Total is "+total);
	    
	    
	    //finding the largest element
	    var max = myList(0);
	    for(i <- 1 to (myList.length - 1)) {
	        if(myList(i) > max) max = myList(i);
	    }
	    println("Max is "+max);
	    
	}
}