package br.com.scalando.cap10

import br.com.scalando.cap9.Foto

object ClassesAbstratas extends App {

    abstract class ResponseParser {
        def parse(str: String): Set[Foto]
    }
    
    class XMLParser extends ResponseParser {
        def parse(str: String): Set[Foto] = ???
    }
    
    class JsonParser extends ResponseParser {
        def parse(str: String): Set[Foto] = ???
    }
    
}