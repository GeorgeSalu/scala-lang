package br.com.tutorialspoint.loop

import scala.util.control.Breaks

object Loop7 {
    def main(args: Array[String]): Unit = {
      
        var a = 0;
        var b = 0;
        val numList1 = List(1,2,3,4,5,6);
        val numList2 = List(11,12,13,14);
        
        val outer = new Breaks;
        val inner = new Breaks;
        
        outer.breakable {
            for(a <- numList1) {
                println("value of a : "+a);
                inner.breakable {
                    for(b <- numList2) {
                        println("Value of b : "+b);
                        if(b == 12) {
                            inner.break;
                        }
                    }
                }
            }
        }
        
    }
}