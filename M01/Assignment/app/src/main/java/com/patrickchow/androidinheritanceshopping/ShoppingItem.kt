package com.patrickchow.androidinheritanceshopping

open class ShoppingItem(val colorId: Int, val product: String){

    open fun getDisplayName():String{
        return product
    }

}

class grocery(colorId: Int, product: String, type: String):ShoppingItem(colorId, product){

}

class clothing(colorId: Int, product: String, type: String):ShoppingItem(colorId, product){

}

class toy(colorId: Int, product: String, type: String): ShoppingItem(colorId, product){
    
}