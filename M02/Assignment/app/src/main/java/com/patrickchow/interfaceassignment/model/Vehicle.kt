package com.patrickchow.interfaceassignment.model

abstract class Vehicle(
    val id: String? = null,
    val weight: Int? = null,
    val favorite: Boolean = false
) {
    abstract fun travel(): String
}