package com.example.consumoapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var bt_atualizar : Button
    lateinit var fato: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_atualizar = findViewById(R.id.bt_atualizar)
        fato = findViewById(R.id.fato)

        fetchCatObs()

        bt_atualizar.setOnClickListener {
            fetchCatObs()
        }

    }


    fun fetchCatObs() {
        lifecycleScope.launch {
            val response = NetworkModule.service.getFact()
            if (response.isSuccessful) {
                val fact = response.body()
                fato.text = fact?.facts?.get(0)
            } else {
                Log.e("MainActivity", "Error: ${response.errorBody()}")
            }

        }
    }
}