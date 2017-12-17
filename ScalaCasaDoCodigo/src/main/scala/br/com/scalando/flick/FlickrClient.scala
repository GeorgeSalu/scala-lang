package br.com.scalando.flick

import com.typesafe.config.Config

import com.typesafe.config.Config
import FlickrClient._
import br.com.scalando.model.Foto

class FlickrClient(apiKey: String, baseUrl: String, httpClient: HttpClient, responseParser: ResponseParser) {

    def buscaFotos(tags: List[String]): Seq[Foto] = {

        ???
    }
}

object FlickrClient {
    val searchMethod = "flickr.photos.search"

    def fromConfig(config: Config): FlickrClient = {
        val apiKey = config.getString("flickr.api.key")
        val baseUrl = config.getString("flickr.api.baseurl")

        new FlickrClient(apiKey, baseUrl, HttpClient.fromConfig(), XmlFlickrParser.fromConfig(config))
    }
}