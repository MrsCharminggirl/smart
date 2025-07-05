package com.example.smartmarketss

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class productform : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_form)

        val name = findViewById<EditText>(R.id.NameId)
        val price = findViewById<EditText>(R.id.PriceId)
        val quantity = findViewById<EditText>(R.id.QuantityId)
        val btnSave = findViewById<Button>(R.id.btnSaveProduct)

        btnSave.setOnClickListener {
            Toast.makeText(this, "Place a product", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, product_lists::class.java))
            finish()
        }
    }
}
