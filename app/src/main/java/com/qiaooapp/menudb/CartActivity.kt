package com.qiaooapp.menudb

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CartActivity : AppCompatActivity() {

    private lateinit var recyclerCart: RecyclerView
    private lateinit var totalText: TextView
    private lateinit var btnCheckout: Button

    private lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        recyclerCart = findViewById(R.id.recyclerCart)
        totalText = findViewById(R.id.textTotal)
        btnCheckout = findViewById(R.id.btnCheckout)

        recyclerCart.layoutManager = LinearLayoutManager(this)
        recyclerCart.adapter = CartAdapter(CartManager.cartItems)

        totalText.text = "Total: Rp ${CartManager.getTotalPrice()}"

        btnCheckout.setOnClickListener {
            performCheckout()
        }

        val baseUrl = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            .getString("base_url", "http://192.168.1.x/your_api_folder/")!! // ganti default jika perlu
        apiService = RetrofitClient.getClient(baseUrl)

    }

    private fun performCheckout() {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val cartItems = CartManager.cartItems
                val total = CartManager.getTotalPrice()
                val request = CheckoutRequest("IDR", cartItems, total)

                val response = apiService.postCheckout(request)

                withContext(Dispatchers.Main) {
                    Toast.makeText(this@CartActivity, response.message(), Toast.LENGTH_LONG).show()
                    CartManager.clearCart()
                    finish()
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(this@CartActivity, "Gagal checkout: ${e.message}", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

}
