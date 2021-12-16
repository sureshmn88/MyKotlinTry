package com.library.kotlinlmscustomertry.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.kotlinmvvmsample.utils.showToast
import com.library.kotlinlmscustomertry.R
import com.library.kotlinlmscustomertry.databinding.ActivityLoginBinding
import com.library.kotlinlmscustomertry.home.HomeActivity

class LoginActivity : AppCompatActivity() {
    lateinit var viewDataBinding: ActivityLoginBinding
    val viewModel:LoginViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding=DataBindingUtil.setContentView(this,R.layout.activity_login)
        viewDataBinding.loginModel=viewModel
        viewDataBinding.lifecycleOwner=this
        setContentView(viewDataBinding.root)
        init()
    }
    private fun init(){
        viewModel.errorAlret.observe(this,{
            if(it.isNotEmpty()){
                showToast(it)
            }else
                startActivity(Intent(this, HomeActivity::class.java))
        })

    }
}