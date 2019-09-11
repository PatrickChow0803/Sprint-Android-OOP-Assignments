package com.patrickchow.genericassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Task 1 - Create a list of strings and try to add an Int
        var mutableListOfStrings = mutableListOf<String>("one","two","three")
        //Compiler doesn't like this.
        //mutableListOfStrings.add(1)

        // Task 2 - Create a class and try to pass in an object that isn't of the expected type.
        //Compiler doesn't like this
        //testingClass("Test")

        //Task 3 - Create a function and try to pass in an object that isn't of the expected type.
        //Compiler doesn't like this
        //testingFunction(5)

        val tMobile = TMobile()
        val verizon = Verizon()

        val phone = Phone(tMobile, verizon)

        val myObservable = Observable.just(5,6,1)
        myObservable.subscribe(){
            Log.i(it.toString(), "Observable")
        }

        val tomC = Actor("Tom Cruise")
        val bradP = Actor("Brad Pit")

        val actObservable = Observable.just(tomC, bradP)
        actObservable.subscribe(){
            Log.i(it.name, "Actor Observable")
        }
    }

    fun testingFunction(testInput: String){
    }
}

class testingClass(testInput: Int)

open class CellularService()


class TMobile: CellularService()
class Verizon: CellularService()

class Phone<T: CellularService, X: CellularService>(
    var serviceName: T,
    var secondServiceName: X
)

data class Actor(val name: String)