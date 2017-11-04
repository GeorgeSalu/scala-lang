package br.com.tutorialspoint.function

object Function4 {
    def main(args: Array[String]): Unit = {
      
        println("Returned Value : "+addInt());
        
    }
    
    def addInt(a:Int = 5,b:Int = 7): Int = {
        
        var sum:Int = 0;
        sum = a + b
        
        return sum;
    }
    
}