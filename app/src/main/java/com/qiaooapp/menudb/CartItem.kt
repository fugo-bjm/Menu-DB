package com.qiaooapp.menudb

import com.google.gson.annotations.SerializedName

data class CartItem(
    @SerializedName("menu_id") val menuId: String,
    @SerializedName("menu_name") val menuName: String,
    @SerializedName("menu_image") val menuImage: String,
    @SerializedName("menu_price") val menuPrice: Double,
    @SerializedName("quantity") var quantity: Int
)
