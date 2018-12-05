package com.example.a13j901.zooapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class DetalleActivity : AppCompatActivity() {
    var buttonDatos: Button? = null
    var buttonInfo: Button? = null
    var buttonGaleria: Button? = null
    var btnRegresarLista: ImageButton? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        btnRegresarLista = findViewById(R.id.btnRegresarLista)
        btnRegresarLista?.setOnClickListener{
            var intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
        }

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
