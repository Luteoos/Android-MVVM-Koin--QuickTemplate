package io.github.luteoos.darknotes.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import io.github.luteoos.darknotes.R
import io.github.luteoos.darknotes.baseAbstract.ActivityVM
import io.github.luteoos.darknotes.view.fragment.MainScreenFragment
import io.github.luteoos.darknotes.viewmodel.MainScreenViewModel
import io.github.luteoos.mvvmbaselib.Event
import kotlinx.android.synthetic.main.header_main_screen.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainScreenActivity : ActivityVM<MainScreenViewModel>() {

    override val viewModel: MainScreenViewModel by viewModel()

    override fun getLayoutID(): Int = R.layout.activity_main_screen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        connectToVMMessage()
        setBindings()
        switchFragment(MainScreenFragment())
    }

    override fun onResume() {
        super.onResume()
        setUsername()
    }

    private fun setBindings(){
        btnSettings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }

    private fun switchFragment(piece: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, piece)
            .commitAllowingStateLoss()
    }

    private fun setUsername(){
        tvWelcome.text = getString(R.string.welcome_message, session.username)
    }

    override fun onVMMessage(msg: Event<Int>) {
        super.onVMMessage(msg)
    }
}