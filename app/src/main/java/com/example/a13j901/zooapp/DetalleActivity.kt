package com.example.a13j901.zooapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetalleActivity : AppCompatActivity() {
    var buttonDatos: Button? = null
    var buttonInfo: Button? = null
    var buttonGaleria: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        buttonDatos = findViewById(R.id.button_datos)
        buttonInfo = findViewById(R.id.button_info)
        buttonGaleria = findViewById(R.id.button_galeria)

        supportFragmentManager.beginTransaction().replace(R.id.container, DatosFragment.newInstance()).addToBackStack(null).commit()

        buttonDatos?.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.container, DatosFragment.newInstance()).addToBackStack(null).commit()
        }

        buttonInfo?.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.container, InfoFragment.newInstance()).addToBackStack(null).commit()
        }
    }
}
