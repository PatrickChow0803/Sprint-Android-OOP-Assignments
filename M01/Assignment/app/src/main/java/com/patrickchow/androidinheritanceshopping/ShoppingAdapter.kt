package com.patrickchow.androidinheritanceshopping

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.product_item.view.*

class ShoppingAdapter (val shoppingProduct: MutableList<ShoppingItem>): RecyclerView.Adapter<ShoppingAdapter.ViewHolder>(){
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        //Obtain the views
        val productNameTextView: TextView = view.tv_product_name
        val productTypeTextView: TextView = view.tv_product_type
        val productRL: ConstraintLayout = view.cl_rv_card_holder
        val productCardView: CardView = view.cv_holder

        fun editModel(productItem: ShoppingItem){
            productNameTextView.text = "Product Name: ${productItem.product}"

            if(productItem.colorId == 999)
                productCardView.setCardBackgroundColor(Color.CYAN)

            else if(productItem.colorId == 111)
                productCardView.setBackgroundColor(Color.RED)
            else
                productCardView.setBackgroundColor(Color.YELLOW)
        }
    }

    //Converts the XML card into a viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false) as View)
    }

    override fun getItemCount(): Int {
        return shoppingProduct.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentProduct = shoppingProduct[position]
        holder.editModel(currentProduct)

    }
}