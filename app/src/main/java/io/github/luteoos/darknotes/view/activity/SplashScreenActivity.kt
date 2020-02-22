package io.github.luteoos.darknotes.view.activity

import android.content.Intent
import android.os.Bundle
import io.github.luteoos.darknotes.R
import io.github.luteoos.darknotes.utils.Session
import io.github.luteoos.mvvmbaselib.BaseActivityMVVMWithoutVM
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : BaseActivityMVVMWithoutVM() {

    override fun getLayoutID(): Int = R.layout.activity_splash_screen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setWelcomeMessage()
        startMainScreenActivity()
//        checkToken()
    }

    private fun startMainScreenActivity(){
        Intent(this, MainScreenActivity::class.java).let {
            it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(it)
        }
    }

    private fun setWelcomeMessage(){
        tvWelcomeMessage.text = getString(R.string.welcome_message, Session.username)
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