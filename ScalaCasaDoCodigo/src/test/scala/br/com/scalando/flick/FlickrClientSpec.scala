package br.com.scalando.flick

import com.typesafe.config.{ ConfigException, ConfigFactory }
import org.specs2.mutable.Specification

class FlickrClientSpec extends Specification {
    "FlickrClient.fromConfig" should {
        "work with valid configuration" in {
            val client = FlickrClient.fromConfig(ConfigFactory.load("app-test.conf"))
            client !=== null
        }

        "fail if some configuration is missing" in {
            FlickrClient.fromConfig(ConfigFactory.load("wrong.conf")) should throwAn[ConfigException]
        }
    }
}