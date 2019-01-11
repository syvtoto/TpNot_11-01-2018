package com.example.thoma.tpnot_11_01_2019

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.thoma.tpnot_11_01_2019.activity.*

import com.example.thoma.tpnot_11_01_2019.model.KotPref

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({

            val intent: Intent = if (KotPref.isConnected==true && !(KotPref.password.isEmpty()))
                Intent(applicationContext, MainActivity::class.java)
            else
                Intent(applicationContext, LoginActivity::class.java)


            startActivity(intent)
            finish()

        }, 3000)
    }
}
