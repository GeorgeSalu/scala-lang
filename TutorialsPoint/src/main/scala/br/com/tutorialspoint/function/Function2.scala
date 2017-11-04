package br.com.tutorialspoint.function

object Function2 {
    def main(args: Array[String]): Unit = {
      
        delayed(time());
        
    }
    
    def time() = {
        println("Getting time in nano seconds");
        System.nanoTime();
    }
    
    def delayed(t: => Long) = {
        
        println("In delayed method");
        println("Param : "+t);
        
        
    }
    
}