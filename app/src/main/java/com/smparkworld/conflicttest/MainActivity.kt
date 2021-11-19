package com.smparkworld.conflicttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToasts()
    }

    private fun showToasts() {
        Toast.makeText(this, "hello, world!", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "hi~~!", Toast.LENGTH_LONG).show()
    }
}