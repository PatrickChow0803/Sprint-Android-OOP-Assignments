package com.patrickchow.androidinheritanceshopping

open class ShoppingItem(val colorId: Int, val product: String){

    open fun getDisplayName():String{
        return product
    }

}