package br.com.tutorialspoint.operators

object Operators3 {
    def main(args: Array[String]): Unit = {
      
        var a = true;
        var b = false;
        
        println("a && b = "+(a&&b));
        println("a || b = "+(a||b));
        println("!(a && b) = "+ !(a&&b));
        
    }
}