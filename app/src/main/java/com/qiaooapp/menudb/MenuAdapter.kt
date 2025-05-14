package com.qiaooapp.menudb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.text.NumberFormat
import java.util.Locale

class MenuAdapter(
    private val menuList: List<MenuItem>,
    val basesUrl: String,
    private val rateIdrUsd: Double
) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    class MenuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageMenu: ImageView = view.findViewById(R.id.imageMenu)
        val textMenuName: TextView = view.findViewById(R.id.textMenuName)
        val textMenuPrice: TextView = view.findViewById(R.id.textMenuPrice)
        val textMenuUsd: TextView = itemView.findViewById(R.id.textMenuUsd)

        val btnPlus: Button = itemView.findViewById(R.id.btn_plus)
        val btnMinus: Button = itemView.findViewById(R.id.btn_minus)
        val tvQuantity: TextView = itemView.findViewById(R.id.tv_quantity)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val item = menuList[position]

        holder.btnPlus.setOnClickListener {
            item.quantity++
            holder.tvQuantity.text = item.quantity.toString()
            CartManager.addToCart(item)
        }

        holder.btnMinus.setOnClickListener {
            if (item.quantity > 0) {
                item.quantity--
                holder.tvQuantity.text = item.quantity.toString()
                CartManager.removeFromCart(item)
            }
        }

        holder.textMenuName.text = item.menuName

        val priceIdr = item.menuPrice.toDoubleOrNull() ?: 0.0

        // Harga IDR
        val formattedPrice = formatShortCurrency(priceIdr, Locale("in", "ID"), "Rp ")
        holder.textMenuPrice.text = formattedPrice

        // Harga USD
        val usdPrice = priceIdr * rateIdrUsd
        val formattedUsd = formatShortCurrency(usdPrice, Locale.US, "$")
        holder.textMenuUsd.text = formattedUsd

        Glide.with(holder.itemView.context)
            .load(basesUrl + item.menuImage.replace("./", "")) // pastikan path benar
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.imageMenu)


    }


    override fun getItemCount() = menuList.size

    private fun formatShortCurrency(amount: Double, locale: Locale, prefix: String): String {
        val formatted = when {
            amount >= 1_000_000 -> String.format(locale, "%.1fM", amount / 1_000_000)
            amount >= 1_000 -> String.format(locale, "%.1fK", amount / 1_000)
            else -> NumberFormat.getNumberInstance(locale).format(amount)
        }
        return "$prefix$formatted"
    }
}
