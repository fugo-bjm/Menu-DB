package com.qiaooapp.menudb

object CartManager {
    val cartItems = mutableListOf<CartItem>()

    fun addToCart(item: MenuItem, quantity: Int) {
        val existing = cartItems.find { it.menuId == item.id }
        if (existing != null) {
            existing.quantity += quantity
        } else {
            val cartItem = CartItem(
                menuId = item.id,
                menuName = item.menuName,
                menuImage = item.menuImage,
                menuPrice = item.menuPrice.toDouble(),
                quantity = item.quantity
            )
            cartItems.add(cartItem)
        }
    }


    fun clearCart() {
        cartItems.clear()
    }

    fun removeFromCart(item: MenuItem) {
        val existingItem = cartItems.find { it.menuId == item.id }
        if (existingItem != null) {
            if (existingItem.quantity > item.quantity) {
                existingItem.quantity -= item.quantity
            } else {
                cartItems.remove(existingItem)
            }
        }
    }

    fun getTotalPrice(): Double {
        return cartItems.sumOf { it.menuPrice * it.quantity }
    }
}
