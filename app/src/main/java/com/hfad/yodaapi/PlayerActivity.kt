package com.hfad.yodaapi

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlayerActivity : AppCompatActivity() {
    private lateinit var play: Button
    private var mediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)
        play = findViewById(R.id.playButton)
    }
}