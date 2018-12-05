package com.example.a13j901.zooapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ListaActivity : AppCompatActivity() {

    var btnMoreInfo: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        btnMoreInfo = findViewById(R.id.buttonMoreInfo)
        btnMoreInfo?.setOnClickListener {
            var intent = Intent(this, DetalleActivity::class.java)
            startActivity(intent)
        }
    }
}
