package br.com.tutorialspoint.regularexpression

object RegularExpression3 {
	def main(args: Array[String]): Unit = {
		
	    val pattern = ("(S|s)cala").r;
	    val str = "Scala is scalable and cool"
	    
	    println(pattern replaceFirstIn(str, "java"))
	    
	}
}