package br.com.scalando.model

sealed trait Media {
    def id: Int
}

case class Foto(id: Int)
case class Video(id: Int)