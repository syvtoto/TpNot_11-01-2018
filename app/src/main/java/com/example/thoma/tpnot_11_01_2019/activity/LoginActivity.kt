package com.example.thoma.tpnot_11_01_2019.activity


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.thoma.tpnot_11_01_2019.R
import com.example.thoma.tpnot_11_01_2019.model.KotPref
import com.muddzdev.styleabletoast.StyleableToast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        if(KotPref.name.toString().isNotEmpty()){
            editName.setText(KotPref.name.toString());
        }


        btnLogin.setOnClickListener {

            KotPref.name = editName.text.toString()
            if(editName.text.toString().isNotEmpty()){
                KotPref.password = editPassword.text.toString()
            }

            if(CheckRemember.isChecked){
                KotPref.isConnected = true
            }
            else{
                KotPref.isConnected = false
            }

            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()

        }

    }
}
