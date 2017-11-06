package br.com.tutorialspoint.regularexpression

import scala.util.matching.Regex

object RegularExpression4 {
    def main(args : Array[String]) : Unit = {

        val pattern = new Regex("abl[ae]\\d+")
        val str = "ablaw is able1 and cool"
        
        println((pattern findAllIn str).mkString(","))

    }
}