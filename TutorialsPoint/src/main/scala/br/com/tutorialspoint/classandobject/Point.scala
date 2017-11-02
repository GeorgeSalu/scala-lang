package br.com.tutorialspoint.classandobject

import java.io._

class Point(val xc: Int,val yc: Int ) {
    
    var x: Int = xc;
    var y: Int = yc;
    
    def move(dx: Int,dy: Int) {
        x = x + dx;
        y = y + dy;
        
        println("Point x Location : "+x);
        println("Point y Location : "+y);
        
    }
    
}

object Demo {
    def main(args: Array[String]): Unit = {
      
        val pt = new Point(10,20);
        
        pt.move(10, 20);
    }
}