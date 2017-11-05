package br.com.tutiralspoint.collections

object Collections4 {
	def main(args: Array[String]): Unit = {
		
	    val squares = List.tabulate(6)(n => n * n);
	    println("squares : "+squares);
	    
	    val mul = List.tabulate(4,5)(_ * _);
	    println("Mul : "+mul);
	    
	}
}