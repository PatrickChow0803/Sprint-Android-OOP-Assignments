package com.patrickchow.genericassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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
    }

    fun testingFunction(testInput: String){
    }
}

class testingClass(testInput: Int)

class CellularService(var serviceName: String)

class Phone<T: CellularService>(
    var serviceName: CellularService
)