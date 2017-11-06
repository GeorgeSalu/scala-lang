package br.com.tutorialspoint.patternmatching

object PatternMatching {
	def main(args: Array[String]): Unit = {
		println(matchDemo(3));
	}
	
	def matchDemo(x: Int): String = x match {
	    case 1 => "one";
	    case 2 => "two";
	    case _ => "many";
	}
	
}