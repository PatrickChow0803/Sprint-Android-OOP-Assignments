package com.patrickchow.interfaceassignment.model

abstract class Vehicle {
    open var id: String? = null
    open var weight: String? = null
    open var favorite: Boolean? = null

    abstract fun fly(): String
}