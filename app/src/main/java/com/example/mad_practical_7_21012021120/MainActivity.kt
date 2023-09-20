package com.example.mad_practical_7_21012021120

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1: FloatingActionButton = findViewById(R.id.mainbtn)
        btn1.setOnClickListener {

        }

    }
    private fun initvideoplayer(){
        val mediaController = MediaController(this)
        val uri:Uri= Uri.parse("android.resource"+ packageName+R.raw.)
    }
}