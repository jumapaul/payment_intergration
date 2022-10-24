package com.pauljuma.paymentintergration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pauljuma.hackathon.fragments.EnterInfoFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        supportFragmentManager.beginTransaction().replace(R.id.flFragments, EnterInfoFragment()).commit()
    }
}