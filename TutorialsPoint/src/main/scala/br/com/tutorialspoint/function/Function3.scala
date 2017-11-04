package br.com.tutorialspoint.function

object Function3 {
    def main(args: Array[String]): Unit = {

        printStrings("Hello","String","Scala");
        
    }
    
    def printStrings(args: String*) = {
        
        var i: Int = 0;
        
        for(arg <- args) {
            println("Args Value ["+i+"] = "+arg);
            i = i + 1;
        }
        
    }
    
}