package br.com.tutorialspoint.regularexpression

import scala.util.matching.Regex

object RegularExpression2 {
	def main(args: Array[String]): Unit = {
		
	    val pattern = new Regex("(S|s)cala");
	    val str = "Scala is scalable and cool"
	    
	    println((pattern findFirstIn str).mkString(","));
	    
	}
}