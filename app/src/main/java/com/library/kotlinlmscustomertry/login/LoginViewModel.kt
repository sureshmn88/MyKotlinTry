package com.library.kotlinlmscustomertry.login

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.kotlinmvvmsample.utils.AppController
import com.example.kotlinmvvmsample.utils.checkTrim

class LoginViewModel(application:Application):AndroidViewModel(application) {
    val Context=application as AppController
    val memberIdTxt=MutableLiveData<String>("")
    val passwordTxt=MutableLiveData<String>("")
    val isChecked=MutableLiveData<Boolean>(false)
    val errorAlret=MutableLiveData<String>("")

    fun onLogin(){

        val strMemberId=memberIdTxt.value!!.checkTrim()
        val strPassword=passwordTxt.value!!.trim()

        when {
            strMemberId.isEmpty() -> {
                errorAlret.value="Enter MemberId"
            }
            strPassword.isEmpty() -> {
                errorAlret.value="Enter Password"
            }else->{
                errorAlret.value=""
            }
        }


    }
}