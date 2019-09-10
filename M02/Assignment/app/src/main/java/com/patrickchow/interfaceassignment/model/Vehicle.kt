package com.patrickchow.interfaceassignment.model

abstract class Vehicle {
    var id: String? = null
    var weight: String? = null
    var favorite: Boolean? = null

    abstract fun fly(): String
}