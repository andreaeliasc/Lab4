package com.example.andrea.lab4

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lab1.*

class Lab1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab1)

        sendButton.setOnClickListener {
            loadWebpage()
        }
    }

        @Throws(UnsupportedOperationException::class)
        fun buildUri(authority: String): Uri {
            val builder = Uri.Builder()
            builder.scheme("https")
                .authority(authority)
            return builder.build()
        }


        fun loadWebpage() {
            webview.loadUrl("")
            val uri: Uri
            try {
                uri = buildUri(uriText.text.toString())
                webview.loadUrl(uri.toString())
            } catch(e: UnsupportedOperationException) {
                e.printStackTrace()
            }
        }






    }


