package br.com.tutorialspoint.function

import java.util.Date

object Function7 {
    def main(args: Array[String]): Unit = {
      
        val date = new Date;
        val logWithDateBound = log(date, _: String)
        
        logWithDateBound("message1")
        Thread.sleep(1000);
        
        logWithDateBound("message2")
        Thread.sleep(1000);
        
        logWithDateBound("message3")
        Thread.sleep(1000);
        
    }
    
    def log(date: Date,message: String) = {
        println(date+"---------"+message);
    }
    
}