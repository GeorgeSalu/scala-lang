package br.com.tutorialspoint.classandobject

class Point3(val xc: Int, val yc: Int) {
    
    var x: Int = xc;
    var y: Int = yc;
    
    def move(dx: Int, dy: Int) {
        x = x + dx;
        y = y + dy;
    }
    
}

object Singleton {
    def main(args: Array[String]): Unit = {
      
        val point = new Point3(10,20);
        
        printPoint3;
        
        def printPoint3 {
            println("Point x location : "+point.x);
            println("Point y location : "+point.y);
        }
        
    }
}