package br.com.tutorialspoint.arrays

import Array._

object Arrays2 {
	def main(args: Array[String]): Unit = {
		
	    var myMatrix = ofDim[Int](3,3);
	    
	    //build a matrix
	    for(i <- 0 to 2) {
	        for(j <- 0 to 2) {
	            myMatrix(i)(j) = j;
	        }
	    }
	    
	    //print two dimensional array
	    for(i <- 0 to 2) {
	        for(j <- 0 to 2) {
	            println(" "+myMatrix(i)(j));
	        }
	        println();
	    }
	    
	}
}