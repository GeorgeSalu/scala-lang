package br.com.tutorialspoint.string

object String4 {
	def main(args: Array[String]): Unit = {
		
	    var floatVar = 12.456;
	    var intVar = 2000;
	    var stringVar = "Hello, Scala!";
	    
	    var fs = printf("The value of the variables is"+
	                    "%f, while the value the integer "+
	                    "variables is %d, and the string"+
	                    "is %s", floatVar,intVar,stringVar);
	    
	    println(fs);
	    
	}
}