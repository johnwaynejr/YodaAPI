package com.hfad.yodaapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide


class PosterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poster)

        val imV = findViewById<ImageView>(R.id.imgPosterBig)
        val img=intent.getStringExtra("poster")

        Glide.with(this)
            .load(img)
            .into(imV)


    }
}