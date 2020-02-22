package io.github.luteoos.darknotes.view.activity

import android.content.Intent
import android.os.Bundle
import io.github.luteoos.darknotes.R
import io.github.luteoos.darknotes.utils.Session
import io.github.luteoos.darknotes.viewmodel.MainScreenViewModel
import io.github.luteoos.mvvmbaselib.BaseActivityMVVM
import io.github.luteoos.mvvmbaselib.Event
import kotlinx.android.synthetic.main.activity_main_screen.*

class MainScreenActivity : BaseActivityMVVM<MainScreenViewModel>() {

    override fun getLayoutID(): Int = R.layout.activity_main_screen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = getViewModel(this)
        connectToVMMessage()
        textView.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        setUsername()
    }

    private fun setUsername(){
        textView.text = getString(R.string.welcome_message, Session.username)
    }

    override fun onVMMessage(msg: Event<Int>) {
        super.onVMMessage(msg)
    }
}