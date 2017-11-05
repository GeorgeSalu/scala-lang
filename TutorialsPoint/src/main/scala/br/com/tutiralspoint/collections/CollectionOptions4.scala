package br.com.tutiralspoint.collections

object CollectionOptions4 {
	def main(args: Array[String]): Unit = {
		
	    val a: Option[Int] = Some(5);
	    val b: Option[Int] = None;
	    
	    println("a.getOrElse(0) : "+a.isEmpty);
	    println("a.getOrElse(0) : "+b.isEmpty);
	    
	}
}