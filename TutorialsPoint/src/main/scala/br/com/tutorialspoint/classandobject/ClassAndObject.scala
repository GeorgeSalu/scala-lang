package br.com.tutorialspoint.classandobject

class Point1(val xc: Int,val yc: Int) {
    
    var x: Int = xc;
    var y: Int = yc;
    
    def move(dx: Int,dy: Int) {
        x = x + dx;
        y = y + dy;
        println("Point1 x location : "+x);
        println("Point1 y location : "+y);
    }
    
}

class Location1(override val xc: Int, override val yc: Int,val zc: Int) extends Point1(xc, yc) {
    
    var z: Int = zc;
    
    def move(dx: Int, dy: Int, dz: Int) {
        x = x + dx;
        y = y + dy;
        z = z + dz;
        
        println("Point location : "+x);
        println("Point location : "+y);
        println("Point location : "+z);
    }
    
}

object ClassAndObject {
    def main(args: Array[String]): Unit = {
      
        val loc = new Location1(10,10,15);
        
        loc.move(10, 10, 5);
    }
}