package br.com.tutorialspoint.loop

object Loop3 {
    def main(args: Array[String]): Unit = {
      
        var a = 10;
        
        for(a <- 1 to 10) {
            println("Value of a: "+a);
        }
        
    }
}