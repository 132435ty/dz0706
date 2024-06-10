package com.grobik.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.grobik.myapplication.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        var i = 0
        binding.button3.setOnClickListener {
            if (i == 0) {
                binding.textView3.text = "Вжух"
                i = 1
            } else if (i == 1) {
                binding.textView3.text = "Привет"
                i = 2
            } else {
                binding.textView3.text = "нажми↓↓↓↓"
                i = 0
            }
        }
    }
}
