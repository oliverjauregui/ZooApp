package com.example.a13j901.zooapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.a13j901.zooapp.R.layout.activity_not_found
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.drawee.view.SimpleDraweeView

class NotFoundActivity : AppCompatActivity() {
    var imageView: SimpleDraweeView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this)
        setContentView(activity_not_found)

        imageView = findViewById(R.id.imageView2)
        var controller: DraweeController = Fresco.newDraweeControllerBuilder()
                .setUri("https://i.postimg.cc/Hx0TRVgY/llama.gif")
                .setAutoPlayAnimations(true)
                .build()

        imageView?.controller = controller
    }
}
