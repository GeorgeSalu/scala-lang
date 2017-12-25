package br.com.scalando.flick

import br.com.scalando.model.Foto
import com.typesafe.config.Config

import scala.xml.XML

sealed trait ResponseParser {
    def parse(str: String): Seq[Foto]
}


final class XmlFlickrParser extends ResponseParser {
    import ResponseParser._

    override def parse(xmlStr: String): Seq[Foto] =
        (XML.loadString(xmlStr) \\ "photo").map { photoXml =>
            Foto(
                (photoXml \ "@id").text,
                (photoXml \ "@owner").text,
                (photoXml \ "@secret").text,
                (photoXml \ "@server").text,
                (photoXml \ "@farm").text.toInt,
                (photoXml \ "@title").text,
                flickrBoolean((photoXml \ "@ispublic").text),
                flickrBoolean((photoXml \ "@isfriend").text),
                flickrBoolean((photoXml \ "@isfamily").text))
        }
}

final class JsonFlickrParser extends ResponseParser {
    /**
     * Implementing this is left as an exercise for the reader.
     */
    override def parse(str: String): Seq[Foto] = ???
}

object ResponseParser {

    def flickrBoolean(rawAttribute: String): Boolean =
        rawAttribute.toInt match {
            case 1 => true
            case _ => false
        }

    def fromConfig(config: Config): ResponseParser = {
        val parser = config.getString("flickr.api.parser")
        parser match {
            case "xml" => new XmlFlickrParser()
            case "json" => new JsonFlickrParser()
            case _ => new XmlFlickrParser()
        }
    }
}