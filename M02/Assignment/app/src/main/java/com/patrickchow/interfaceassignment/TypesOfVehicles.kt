package com.patrickchow.interfaceassignment

import com.patrickchow.interfaceassignment.model.AirTravel
import com.patrickchow.interfaceassignment.model.GroundTravel
import com.patrickchow.interfaceassignment.model.Vehicle
import com.patrickchow.interfaceassignment.model.WaterTravel


class Boat(var name: String):Vehicle(), WaterTravel{
    override fun fly(): String {
        return "$name travels by sea"
    }

    override fun sail():String {
        return "$name doesn't travel by air but by sea"
    }
}

class Plane(var name: String):Vehicle(), AirTravel{
    override fun fly(): String{
        return "$name travels by air"
    }
}

class Car(var name: String):Vehicle(), GroundTravel{
    override fun fly(): String {
        return "$name doesn't travel by air, but by ground"
    }

    override fun drive(): String {
        return "$name travels by ground"
    }
}

class Bus(var name: String):Vehicle(), GroundTravel{
    override fun fly(): String {
        return "$name doesn't travel by air, but by ground"
    }

    override fun drive(): String {
        return "$name travels by ground"
    }
}

class Train(var name: String):Vehicle(), GroundTravel{
    override fun fly(): String {
        return "$name doesn't travel by air, but by ground"
    }

    override fun drive(): String {
        return "$name travels by ground"
    }
}

class Helicopter(var name: String):Vehicle(), AirTravel{
    override fun fly(): String{
        return "$name travels by air"
    }
}