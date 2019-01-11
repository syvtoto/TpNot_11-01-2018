package com.example.thoma.tpnot_11_01_2019.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.thoma.tpnot_11_01_2019.R

import com.example.thoma.tpnot_11_01_2019.model.KotPref
import com.muddzdev.styleabletoast.StyleableToast

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({


            // StyleableToast.makeText(applicationContext, "Hello World!", Toast.LENGTH_LONG, R.style.AppTheme).show();

            val intent: Intent = if (KotPref.isConnected==true && !(KotPref.password.isEmpty()))
                Intent(applicationContext, MainActivity::class.java)
            else
                Intent(applicationContext, LoginActivity::class.java)


            startActivity(intent)
            finish()

        }, 3000)
    }
}
