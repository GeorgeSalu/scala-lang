package br.com.scalando.flick

import org.specs2.mutable.Specification
import br.com.scalando.flick.HttpClient.{ GetError, GetResponse }

class HttpClientSpec extends Specification {
    "the http client" should {
        "respond with a body" in {
            new HttpClient().get("https://httpbin.org/get") must beRight[GetResponse]
        }

        "respond with an error" in {
            new HttpClient().get("bla-bla") must beLeft[GetError]
        }
    }
}