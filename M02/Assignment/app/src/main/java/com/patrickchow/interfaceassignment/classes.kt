package com.patrickchow.interfaceassignment

import com.patrickchow.interfaceassignment.model.Vehicle
import com.patrickchow.interfaceassignment.model.WaterTravel


class boat(var name: String):Vehicle(), WaterTravel{
    override fun fly(): String {
        return "$name travels by ${sail()}"
    }

    override fun sail():String {
        return "dwa"
    }
}