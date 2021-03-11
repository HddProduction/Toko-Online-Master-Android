package com.example.tokoonline.helper

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class SharedPref(activity: Activity) {
    val Login = "Login"
    val myPref = "MAIN_PREF"
    val sp:SharedPreferences

    init {
        sp = activity.getSharedPreferences(myPref, Context.MODE_PRIVATE)
    }

    fun setStatusLogin(status:Boolean){
        sp.edit().putBoolean(Login,status).apply()
    }

    fun getStatusLogin():Boolean{
        return sp.getBoolean(Login, false)
    }
 }