package br.com.tutorialspoint.loop

object Loop5 {
    def main(args: Array[String]): Unit = {
      
        var a = 0;
        var b = 0;
        
        for(a <- 1 to 3;b <- 1 to 3) {
            println("Value of a : "+a);
            println("Value of b : "+b);
        }
        
    }
}