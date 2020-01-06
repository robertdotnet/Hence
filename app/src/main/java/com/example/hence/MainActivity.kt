package com.example.hence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickSignIn(view: View) {
        Toast.makeText(applicationContext,"sign in button pressed. just testing out :) ", Toast.LENGTH_SHORT).show()
    }

}

