package br.com.tutorialspoint.arrays

import Array._

object Arrays3 {
	def main(args: Array[String]): Unit = {
		
	    var myList1 = Array(1.9,2.9,3.4,3.5);
	    var myList2 = Array(5.9,6.9,0.4,7.5);
	    
	    var myList3 = concat(myList1,myList2);
	    
	    //print all the elements
	    for(x <- myList3) {
	        println(x);
	    }
	    
	}
}