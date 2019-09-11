package com.patrickchow.interfaceassignment

import com.patrickchow.interfaceassignment.model.AirTravel
import com.patrickchow.interfaceassignment.model.GroundTravel
import com.patrickchow.interfaceassignment.model.Vehicle
import com.patrickchow.interfaceassignment.model.WaterTravel


class Plane(id: String, weight: Int, favorite:Boolean):Vehicle(id, weight, favorite), AirTravel{
    override fun fly(): String{
        return "$id travels by flying"
    }
    override fun travel(): String {
        return fly()
    }
}

class Car(id: String, weight: Int, favorite:Boolean):Vehicle(id, weight, favorite), GroundTravel{
    override fun travel(): String {
        return drive()
    }

    override fun drive(): String {
        return "$id travels using gas"
    }
}

class Bus(id: String, weight: Int, favorite:Boolean):Vehicle(id, weight, favorite), GroundTravel{
    override fun travel(): String {
        return drive()
    }

    override fun drive(): String {
        return "$id travels using gas"
    }
}

class Train(id: String, weight: Int, favorite:Boolean):Vehicle(id, weight, favorite), GroundTravel{
    override fun travel(): String {
        return drive()
    }

    override fun drive(): String {
        return "$id ravels by ground"
    }
}

class Helicopter(id: String, weight: Int, favorite:Boolean):Vehicle(id, weight, favorite), AirTravel{
    override fun fly(): String{
        return "$id travels by air"
    }
    override fun travel(): String {
        return fly()
    }
}

class Boat(id: String, weight:Int, favorite:Boolean):Vehicle(id, weight, favorite), WaterTravel{
    override fun travel(): String {
        return sail()
    }

    override fun sail():String {
        return "$id travels by sea"
    }
}
