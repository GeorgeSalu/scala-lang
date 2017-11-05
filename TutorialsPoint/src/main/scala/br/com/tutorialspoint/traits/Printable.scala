package br.com.tutorialspoint.traits

trait Printable extends Any {
    def print() : Unit = println(this)
}

class Wrapper(val underlying : Int) extends AnyVal with Printable

object DemoTrait {
    def main(args : Array[String]) {
        val w = new Wrapper(3)
        w.print() 
    }
}