package com.example.thoma.tpnot_11_01_2019.model

import com.chibatching.kotpref.KotprefModel

object KotPref: KotprefModel() {
    var name by stringPref(default = "")
    var isConnected by booleanPref(default = false)
}