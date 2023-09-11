package com.example.fragmentspractica2.entidades

import java.io.Serializable

class Cliente (nombre: String = "") : Serializable {
    var nombre: String = ""

    init{
        this.nombre = nombre
    }
}