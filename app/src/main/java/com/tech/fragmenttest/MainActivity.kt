package com.tech.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_one.setOnClickListener {
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
            //this code will excetue only ,if will click on btn one
            var fManager = supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.add(R.id.my_frame, FirstFrag())//here the will be added to actviity
            tx.commit()
        }

        btn_two.setOnClickListener {
            var fManager = supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.add(R.id.my_frame, SecondFrag())//here the will be added to actviity
            tx.commit()
        }

        btn_three.setOnClickListener {
            var fManager = supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.add(R.id.my_frame, ThirdFrag())//here the will be added to actviity
            tx.commit()
        }

        btn_four.setOnClickListener {
            var fManager = supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.add(R.id.my_frame, FourFrag())//here the will be added to actviity
            tx.commit()
        }

        btn_five.setOnClickListener {
            var fManager = supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.add(R.id.my_frame, FiveFrag())//here the will be added to actviity
            tx.commit()
        }
    }
}
