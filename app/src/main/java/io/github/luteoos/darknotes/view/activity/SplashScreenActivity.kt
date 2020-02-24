package io.github.luteoos.darknotes.view.activity

import android.content.Intent
import android.os.Bundle
import io.github.luteoos.mvvmbaselib.BaseActivityMVVM
import io.github.luteoos.mvvmbaselib.BaseViewModel
import io.github.luteoos.darknotes.R
import io.github.luteoos.darknotes.utils.Session

class SplashScreenActivity : BaseActivityMVVM<BaseViewModel>() {

    override fun getLayoutID(): Int = R.layout.activity_splash_screen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        checkToken()
    }

    private fun checkToken(){
//        val intent = Intent(this,
//            if(Session.token.isNotEmpty())
//                MainScreenActivity::class.java
//            else
////                SignInActivity::class.java)
//        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//        startActivity(intent)
    }
}