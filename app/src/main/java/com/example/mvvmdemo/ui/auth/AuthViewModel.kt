package com.example.mvvmdemo.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel(){
    var email : String? = null;
    var password : String? = null;

    var authListener : AuthListener? = null;

    fun onLoginBtnClicked(view : View){
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailure("Invalid email or password")
            return
        }
        authListener?.onSuccess()
    }

}