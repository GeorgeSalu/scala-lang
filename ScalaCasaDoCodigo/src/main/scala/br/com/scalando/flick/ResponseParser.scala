package br.com.scalando.flick

import br.com.scalando.model.Foto
import com.typesafe.config.Config

sealed trait ResponseParser {
    def parse(str: String): Seq[Foto]
}

final class XmlFlickrParser extends ResponseParser {
    override def parse(str: String): Seq[Foto] = Nil
}

object XmlFlickrParser {
    def fromConfig(config: Config): XmlFlickrParser = new XmlFlickrParser()
}