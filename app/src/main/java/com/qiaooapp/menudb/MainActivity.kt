package com.qiaooapp.menudb

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerMenu: RecyclerView
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout

    private fun loadData() {
        val api = RetrofitClient.getClient(baseUrl)

        lifecycleScope.launch {
            swipeRefreshLayout.isRefreshing = true // tampilkan animasi loading

            try {
                val menuList = api.getMenus()
                val rates = api.getRates()
                val rateIdrUsd = rates["IDRUSD"] ?: 0.0 * 1.11

                recyclerMenu.adapter = MenuAdapter(
                    menuList,
                    basesUrl = baseUrl,
                    rateIdrUsd = rateIdrUsd
                )
                Log.d("MainActivity", "Jumlah menu: ${menuList.size}")
            } catch (e: Exception) {
                e.printStackTrace()
                Toast.makeText(this@MainActivity, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
            } finally {
                swipeRefreshLayout.isRefreshing = false // hentikan animasi loading
            }
        }
    }

    val baseUrl: String
        get() {
            val prefs = getSharedPreferences("settings", MODE_PRIVATE)
            return prefs.getString("base_url", "http://192.168.1.77/") ?: ""
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerMenu = findViewById(R.id.recyclerMenu)
        recyclerMenu.layoutManager = LinearLayoutManager(this)

        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout)

        swipeRefreshLayout.setOnRefreshListener {
            loadData()
        }

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.btn_cart)
        fab.setOnClickListener {
            // Misal buka halaman keranjang
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }


        loadData()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                val intent = Intent(this, SettingsActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
