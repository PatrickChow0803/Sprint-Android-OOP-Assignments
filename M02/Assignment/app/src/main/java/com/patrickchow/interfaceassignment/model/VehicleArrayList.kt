package com.patrickchow.interfaceassignment.model

import com.patrickchow.interfaceassignment.*

object VehicleArrayList {

    val ITEMS: MutableList<Vehicle> = ArrayList()

    init{
        ITEMS.add(Boat("Titanic", 300, false))
        ITEMS.add(Plane("Jet",100, false))
        ITEMS.add(Car("Honda",600, false))
        ITEMS.add(Bus("B-31",700, false))
        ITEMS.add(Train("M Train",200, false))
        ITEMS.add(Helicopter("AH-64",200, false))

    }
}