package com.example.a13j901.zooapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.drawee.view.SimpleDraweeView

class LoginActivity : AppCompatActivity() {
    var imageView:SimpleDraweeView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this)
        setContentView(R.layout.activity_login)

        imageView = findViewById(R.id.imageView)
        var controller: DraweeController = Fresco.newDraweeControllerBuilder()
                        .setUri("http://i.imgur.com/jLBIIZg.gif")
                        .setAutoPlayAnimations(true)
                        .build()
        imageView?.controller = controller

        // cargando 3 segundos
        Handler().postDelayed({
            val intent  = Intent(this, ListaActivity::class.java)
            startActivity(intent)
        }, 5000)

    }
}
