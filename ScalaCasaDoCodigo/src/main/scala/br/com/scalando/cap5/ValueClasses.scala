package br.com.scalando.cap5

class IntDobrado(val x: Int) extends AnyVal {
  def dobrado: Int = x * 2
}

object ValueClasses extends App {
  val dobro = new IntDobrado(10).dobrado
  println(dobro)
}