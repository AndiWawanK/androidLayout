package com.example.layoutbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var followText: Boolean = false
        button8.setOnClickListener {
            followText = !followText
            if(followText == true){
                val color = ResourcesCompat.getColor(getResources(), R.color.btnPrimaryDark, null)
                button8.setText("Unfollow")
                button8.setBackgroundColor(color)
            }else{
                val color = ResourcesCompat.getColor(getResources(), R.color.btnPrimary, null)
                button8.setText("Follow")
                button8.setBackgroundColor(color)
            }
        }

    }
}