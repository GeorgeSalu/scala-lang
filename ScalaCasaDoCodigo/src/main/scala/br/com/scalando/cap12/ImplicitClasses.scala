package br.com.scalando.cap12

import br.com.scalando.cap11.Foto

object ImplicitClasses extends App {
    implicit class PrintableFoto(foto: Foto) {
        def print = println(s"printando foto [$foto]...")
    }

    Foto(1234, "jcranky", 1234, "Foto 1").print
}