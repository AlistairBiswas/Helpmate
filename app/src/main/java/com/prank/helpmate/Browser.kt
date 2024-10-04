package com.prank.helpmate

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_browser.*

class Browser : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Browser"
        setContentView(R.layout.activity_browser)
        val msg : String = intent.getStringExtra("message").toString()
        webSetup(msg)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    public fun webSetup(link : String){
        web.webViewClient = WebViewClient()
        web.apply {
            loadUrl(link)
            settings.javaScriptEnabled = true
        }

    }

    override fun onBackPressed() {

        if(web.canGoBack())
            web.goBack()
        else
            super.onBackPressed()

    }
}