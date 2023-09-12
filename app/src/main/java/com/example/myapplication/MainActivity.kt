package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val videoView: VideoView=findViewById(R.id.videoView)
        val btn: FloatingActionButton= findViewById(R.id.button)

        initvideoplayer()

        btn.setOnClickListener{
            Intent(this@MainActivity,youtubeActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun initvideoplayer(){
        val videoView: VideoView=findViewById(R.id.videoView)
        val mediaController=MediaController(this)
        val uri: Uri =Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}