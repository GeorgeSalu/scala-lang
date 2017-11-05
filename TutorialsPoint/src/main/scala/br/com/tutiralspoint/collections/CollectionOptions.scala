package br.com.tutiralspoint.collections

object CollectionOptions {
    def main(args: Array[String]): Unit = {
    	
        val capitals = Map("France" -> "Paris","Japan" -> "Tokyo");
        
        println("capitals.get(france) : "+capitals.get("France") )
        println("capitals.get(japan) : "+capitals.get("Japan") )
        
    }	
}