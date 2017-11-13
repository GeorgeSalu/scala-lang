package br.com.scalando.cap3

abstract class AbstractMedia(val value: String)

object Fotos extends AbstractMedia("fotos")
object Videos extends AbstractMedia("videos")
object Todas extends AbstractMedia("all")
