package br.com.scalando.flick

import br.com.scalando.model.Foto

sealed trait ResponseParser {
    def parse(str: String): Seq[Foto]
}

final class XmlParser extends ResponseParser {
    override def parse(str: String): Seq[Foto] = ???
}

object XmlParser {
    def fromConfig(): XmlParser = new XmlParser()
}