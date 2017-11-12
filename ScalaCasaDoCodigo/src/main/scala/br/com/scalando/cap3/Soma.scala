package br.com.scalando.cap3

object Soma extends App {
	
    def soma(x: Int,y: Int) = x + y
    
    //retorno explicito
    def somaExplicita(x: Int, y: Int): Int = x + y
    
    //alterando o tipo de retorno 
    def somaAlterada(x: Int,y: Int) = x + y + 1.0
    
}