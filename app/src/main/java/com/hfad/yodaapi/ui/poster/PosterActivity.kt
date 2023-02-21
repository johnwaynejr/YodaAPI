package com.hfad.yodaapi.ui.poster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.hfad.yodaapi.R


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