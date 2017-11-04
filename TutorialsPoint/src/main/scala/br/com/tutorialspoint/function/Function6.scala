package br.com.tutorialspoint.function

import java.util.Date

object Function6 {
    def main(args: Array[String]): Unit = {
      
        val date = new Date();
        
        log(date, "message1")
        Thread.sleep(1000);
        
        log(date, "message2")
        Thread.sleep(1000);
        
        log(date, "message3")
        Thread.sleep(1000);
        
    }
    
    def log(date: Date,message: String) = {
        println(date+"-------"+message);
    }
    
}