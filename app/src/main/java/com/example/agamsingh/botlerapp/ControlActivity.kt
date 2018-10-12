package com.example.agamsingh.botlerapp

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View
import kotlinx.android.synthetic.main.control_layout.*

class ControlActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_layout)

        right_arrow.setOnClickListener {
            moving.visibility = View.VISIBLE
            moving.text = "Botler moving right"
        }


        left_arrow.setOnClickListener {
            moving.visibility = View.VISIBLE
            moving.text = "Botler moving left"
        }


        down_arrow.setOnClickListener {
            moving.visibility = View.VISIBLE
            moving.text = "Botler moving down"
        }


        up_arrow.setOnClickListener {
            moving.visibility = View.VISIBLE
            moving.text = "Botler moving up"
        }
    }

}