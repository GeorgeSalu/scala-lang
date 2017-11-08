package br.com.tutorialspoint.files

import scala.io.Source

object Files3 {
	def main(args: Array[String]): Unit = {
		
	    println("Following is the content read : ");
	    
	    Source.fromFile("Demo.txt").foreach{
	        print
	    }
	    
	}
}