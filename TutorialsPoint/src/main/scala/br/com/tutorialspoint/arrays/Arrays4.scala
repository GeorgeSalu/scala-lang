package br.com.tutorialspoint.arrays

import Array._

object Arrays4 {
	def main(args: Array[String]): Unit = {
		
	    var myList1 = range(10, 20,2);
	    var myList2 = range(10, 20);
	    
	    //print all the array elements
	    for(x <- myList1) {
	        print(" "+x)
	    }
	    println();
	    
	    for(x <- myList2) {
	        print(" "+x)
	    }
	    
	}
}