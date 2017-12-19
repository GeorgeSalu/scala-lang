package br.com.scalando.flick

import br.com.scalando.model.Foto
import com.typesafe.config.Config

sealed trait ResponseParser {
    def parse(str: String): Seq[Foto]
}

final class XmlFlickrParser extends ResponseParser {

    import XmlFlickrParser._

    // TOOD: proper erro handling in the parsing below
    override def parse(xmlStr: String): Seq[Foto] =
        (XML.loadString(xmlStr) \\ "photo").map { photoXml =>
            Foto(
                (photoXml \ "@id").text,
                (photoXml \ "@owner").text,
                (photoXml \ "@secret").text,
                (photoXml \ "@server").text,
                (photoXml \ "@farm").text.toInt,
                (photoXml \ "@title").text,
                calcBoolean((photoXml \ "@ispublic").text),
                calcBoolean((photoXml \ "@isfriend").text),
                calcBoolean((photoXml \ "@isfamily").text))
        }
}

object XmlFlickrParser {
    // TODO: write a test for this guy
    def calcBoolean(rawAttribute: String): Boolean =
        rawAttribute.toInt match {
            case 1 => true
            case _ => false
        }

    def fromConfig(config: Config): XmlFlickrParser = new XmlFlickrParser()
}