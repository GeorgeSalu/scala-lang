package br.com.tutorialspoint.patternmatching

object PatternMatching2 {
	def main(args: Array[String]): Unit = {
		println(matchDemo("two"));
		println(matchDemo("Demo"));
		println(matchDemo(1));
	}
	
	def matchDemo(x: Any):Any = x match {
	    case 1 => "one";
	    case "two" => 2;
	    case y: Int => "scala.Int";
	    case _ => "many";
	}
	
}