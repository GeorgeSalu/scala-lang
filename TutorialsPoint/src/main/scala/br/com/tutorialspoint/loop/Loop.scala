package br.com.tutorialspoint.loop

object Loop {
    def main(args: Array[String]): Unit = {
      
        var a = 10;
        
        while(a < 20) {
            println("Value of a : "+a);
            a = a + 1;
        }
        
    }
}