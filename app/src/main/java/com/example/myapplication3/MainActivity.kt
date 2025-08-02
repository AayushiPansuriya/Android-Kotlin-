package com.example.myapplication3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val fnm:EditText=findViewById(R.id.firstvalue)
        val lnm:EditText=findViewById(R.id.lastvalue)

        val add:Button=findViewById(R.id.add)
        val sub:Button=findViewById(R.id.sub)
        val mul:Button=findViewById(R.id.mul)
        val div:Button=findViewById(R.id.div)
        val result:TextView=findViewById(R.id.result)

        add.setOnClickListener {
            val a = fnm.text.toString()
            val b = lnm.text.toString()
            val sum = a.toInt() + b.toInt()
            result.text = "Result add: $sum"    // ✅ fixed
        }

        sub.setOnClickListener {
            val a = fnm.text.toString()
            val b = lnm.text.toString()
            val diff = a.toInt() - b.toInt()
            result.text = "Result sub: $diff"   // ✅ fixed
        }

        mul.setOnClickListener {
            val a = fnm.text.toString()
            val b = lnm.text.toString()
            val mul = a.toInt() * b.toInt()
            result.text = "Result mul: $mul"
        }

        div.setOnClickListener {
            val a = fnm.text.toString()
            val b = lnm.text.toString()
            val div = a.toInt() / b.toInt()
            result.text = "Result div: $div"
        }

    }
}