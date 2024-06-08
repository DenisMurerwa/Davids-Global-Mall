package com.example.davidsglobalmall

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var myWeb: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myWeb = findViewById(R.id.myWeb)
        myWeb.settings.javaScriptEnabled = true
        myWeb.webViewClient = WebViewClient()
        myWeb.loadUrl("https://davidsglobalmall.co.ke/")
    }

    override fun onBackPressed() {
        if (myWeb.canGoBack()) {
            myWeb.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
