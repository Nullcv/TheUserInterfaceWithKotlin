package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

//import kotlinx.android.synthetic.main.activity_main.*
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var container: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button4.setOnClickListener {
            val userName = binding.nameInput.text.toString()
            val password = binding.passwordInput.text.toString()
            val message = getString(R.string.login_message, userName, password)

            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }

        //grabbing objects by id
//        container = findViewById<LinearLayout>(R.id.linearLayout)
//        container = findViewById(R.id.linearLayout)


        addTextView(getString(R.string.hello))
        addTextView(getString(R.string.from))
        addTextView(getString(R.string.android))

    }

    private fun addTextView(label: String) {
        val view = TextView(this)
        view.text = label
        view.textSize = 28f
        view.setTextColor(Color.parseColor("#ff0000"))
//        binding.linearLayout.addView(view)
        //video 5 get view references by findViewById
//        container.addView(view)
    }
}