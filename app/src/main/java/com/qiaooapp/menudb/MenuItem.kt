package com.qiaooapp.menudb

import com.google.gson.annotations.SerializedName

data class MenuItem(
    val id: String,
    @SerializedName("menu_name")
    val menuName: String,
    @SerializedName("menu_image")
    val menuImage: String,
    @SerializedName("menu_price")
    val menuPrice: String,
    var quantity: Int = 0
)

data class CheckoutItem(
    val id: Int,
    val name: String,
    val qty: Int,
    val price: Double
)
