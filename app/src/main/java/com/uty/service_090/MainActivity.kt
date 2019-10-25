package com.uty.service_090

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_twitter.setOnClickListener({
            val i = Intent (Intent.ACTION_VIEW,
                Uri.parse("http://www.twitter.com/ @Syahrl_RR "))
                startActivity(i)

        })

        btn_instagram.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
            Uri.parse("http://www.instagram.com/ syahrul_rr"))
            startActivity(i)
        })


        var MediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.bintang)

        playIV.setOnClickListener {
            MediaPlayer?.start()
        }

        pauseIV.setOnClickListener{
            MediaPlayer?.pause()
        }

        stopIV.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }

    }
}
