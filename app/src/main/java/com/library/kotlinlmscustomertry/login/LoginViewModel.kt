package com.library.kotlinlmscustomertry.login

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import com.example.kotlinmvvmsample.utils.AppController

class LoginViewModel(application:Application):AndroidViewModel(application) {
    val Context=application as AppController
}