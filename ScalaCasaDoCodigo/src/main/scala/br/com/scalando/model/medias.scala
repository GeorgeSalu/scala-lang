package br.com.scalando.model

sealed trait Media {
    def id: String
    def owner: String
    def secret: String
    def server: String
    def farm: String
    def title: String
    def ispublic: String
    def isfriend: String
    def isfamily: String
}

final case class Foto(id: String) extends Media
final case class Video(id: String) extends Media