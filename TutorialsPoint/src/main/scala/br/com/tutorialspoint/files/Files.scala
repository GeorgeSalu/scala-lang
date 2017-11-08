package br.com.tutorialspoint.files

import java.io._

object Files {
	def main(args: Array[String]): Unit = {
		
	    val writer = new PrintWriter(new File("Demo.txt"));
	    
	    writer.write("Hello Scala");
	    writer.close();
	    
	}
}