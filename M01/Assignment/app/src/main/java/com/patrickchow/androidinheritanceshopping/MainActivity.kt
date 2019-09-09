package com.patrickchow.androidinheritanceshopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_products.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ShoppingAdapter(createFakeData())
        }
    }

    fun createFakeData(): MutableList<ShoppingItem>{
        var listOfProducts = mutableListOf<ShoppingItem>()

        listOfProducts.add(grocery(111, "Pie", "food"))
        listOfProducts.add(clothing(555, "Polo Shirt", "Fabric"))
        listOfProducts.add(toy(999, "Batman Figure", "Plastic"))

        listOfProducts.add(grocery(111, "Pie", "food"))
        listOfProducts.add(clothing(555, "Polo Shirt", "Fabric"))
        listOfProducts.add(toy(999, "Batman Figure", "Plastic"))

        listOfProducts.add(grocery(111, "Pie", "food"))
        listOfProducts.add(clothing(555, "Polo Shirt", "Fabric"))
        listOfProducts.add(toy(999, "Batman Figure", "Plastic"))

        listOfProducts.add(grocery(111, "Pie", "food"))
        listOfProducts.add(clothing(555, "Polo Shirt", "Fabric"))
        listOfProducts.add(toy(999, "Batman Figure", "Plastic"))

        var allProducts = ""

        //Display all the products
        listOfProducts.forEach {
            allProducts += "${it.product}, "
        }
        Log.i(allProducts, "Testing")
        return listOfProducts
    }
}
