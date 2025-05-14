package com.qiaooapp.menudb

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.qiaooapp.menudb.R

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val inputUrl = findViewById<EditText>(R.id.inputBaseUrl)
        val btnSave = findViewById<Button>(R.id.btnSave)

        val prefs = getSharedPreferences("settings", Context.MODE_PRIVATE)
        inputUrl.setText(prefs.getString("base_url", ""))

        btnSave.setOnClickListener {
            val newUrl = inputUrl.text.toString()
            prefs.edit().putString("base_url", newUrl).apply()
            Toast.makeText(this, "Base URL disimpan", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}

