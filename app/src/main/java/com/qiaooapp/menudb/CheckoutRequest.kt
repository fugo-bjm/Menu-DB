package com.qiaooapp.menudb

data class CheckoutRequest(
    val currency: String,
    val items: List<CartItem>, // <-- ini harus List<CartItem>
    val total: Double
)
