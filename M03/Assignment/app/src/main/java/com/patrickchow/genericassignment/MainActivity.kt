package com.patrickchow.genericassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mutableListOfStrings = mutableListOf<String>("one","two","three")
        //Compiler does not like this.
        //mutableListOfStrings.add(1)
    }
}
