package io.github.luteoos.darknotes.view.activity

import android.content.Intent
import android.os.Bundle
import io.github.luteoos.darknotes.R
import io.github.luteoos.darknotes.baseAbstract.ActivityNoVM
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : ActivityNoVM() {

    override fun getLayoutID(): Int = R.layout.activity_splash_screen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setWelcomeMessage()
        startMainScreenActivity()
    }

    private fun startMainScreenActivity(){
        Intent(this, MainScreenActivity::class.java).let {
            it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(it)
        }
    }

    private fun setWelcomeMessage(){
        tvWelcomeMessage.text = getString(R.string.welcome_message, session.username)
    }
}