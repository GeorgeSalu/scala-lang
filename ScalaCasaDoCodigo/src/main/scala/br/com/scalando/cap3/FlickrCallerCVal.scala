package br.com.scalando.cap3

class FlickrCallerCVal(val apiKey: String)

object FlickrCallerCValMain extends App{
    val caller = new FlickrCallerCVal("apiKey");
    println(caller.apiKey)
}