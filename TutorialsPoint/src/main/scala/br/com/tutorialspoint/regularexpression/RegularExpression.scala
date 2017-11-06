package br.com.tutorialspoint.regularexpression

object RegularExpression {
	def main(args: Array[String]): Unit = {
		
	    val pattern = "Scala".r
	    val str = "Scala is Scalable and cool"
	    
	    
	    println(pattern findFirstIn str);
	    
	}
}