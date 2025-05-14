package com.qiaooapp.menudb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.util.*

class CartAdapter(private val cartList: List<CartItem>) :
    RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    class CartViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageMenu: ImageView = view.findViewById(R.id.imageCart)
        val textName: TextView = view.findViewById(R.id.textCartName)
        val textQty: TextView = view.findViewById(R.id.textCartQty)
        val textSubtotal: TextView = view.findViewById(R.id.textCartSubtotal)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cart, parent, false)
        return CartViewHolder(view)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val item = cartList[position]
        holder.textName.text = item.menuName
        holder.textQty.text = "Qty: ${item.quantity}"
        val subtotal = item.menuPrice * item.quantity
        holder.textSubtotal.text = "Subtotal: Rp ${String.format(Locale("in", "ID"), "%,.0f", subtotal)}"

        Glide.with(holder.itemView.context)
            .load(item.menuImage)
            .into(holder.imageMenu)
    }

    override fun getItemCount(): Int = cartList.size
}
