package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class youtubeActivity : AppCompatActivity() {
    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        webView = findViewById(R.id.web)
        val btn: FloatingActionButton = findViewById(R.id.button)

        initYoutubePlayer()
        btn.setOnClickListener{
            Intent(this@youtubeActivity,MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    val youtubeId="fJn9B64Znrk"

    fun initYoutubePlayer()
    {
        val webSettings:WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        webView.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}