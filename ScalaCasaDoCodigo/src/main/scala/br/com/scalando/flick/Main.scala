package br.com.scalando.flick

import com.typesafe.config.ConfigFactory

object Main extends App {
    val config = ConfigFactory.load()
    val flickrClient = FlickrClient.fromConfig(config)

    flickrClient.buscaFotos(List("scala"))
}