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

        // Task 2 - create a class and pass in an object that isn't of the expected type.
        //Compiler doesn't like this
        //testingClass("Test")
    }
}

class testingClass(testInput: Int)