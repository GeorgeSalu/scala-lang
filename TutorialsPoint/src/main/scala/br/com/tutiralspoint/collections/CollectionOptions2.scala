package br.com.tutiralspoint.collections

object CollectionOptions2 {
	def main(args: Array[String]): Unit = {
		
	     val capitals = Map("France" -> "Paris","Japan" -> "Tokyo");
	     
	     println("show(capitals.get(Japan)) : "+show(capitals.get("Japan")));
	     println("show(capitals.get(Indian)) : "+show(capitals.get("Indian")));
	    
	}
	
	def show(x: Option[String]) = x match {
	    case Some(s) => s
	    case None => "?"
	}
	
}