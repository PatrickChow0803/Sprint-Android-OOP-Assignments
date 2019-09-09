package com.patrickchow.androidinheritanceshopping

open class ShoppingItem(val colorId: Int, val product: String){

    open fun getDisplayName():String{
        return product
    }

}

class grocery(colorId: Int, product: String, val type: String):ShoppingItem(colorId, product){
    override fun getDisplayName(): String {
        return "$product - Must be refrigerated"
    }
}

class clothing(colorId: Int,  product: String, val type: String):ShoppingItem(colorId, product){
    override fun getDisplayName(): String {
        return "$product - Size - M"
    }
}

class toy( colorId: Int, product: String,  val type: String): ShoppingItem(colorId, product) {
    override fun getDisplayName(): String {
        return "$product - Must be over the age of 6 to use"
    }
}