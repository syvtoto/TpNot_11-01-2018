package com.example.thoma.tpnot_11_01_2019.activity


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.thoma.tpnot_11_01_2019.R
import com.example.thoma.tpnot_11_01_2019.model.KotPref
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {

            KotPref.name = editName.text.toString()
            if(true){
                KotPref.password = editPassword.text.toString()
            }

            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()

        }

    }
}
