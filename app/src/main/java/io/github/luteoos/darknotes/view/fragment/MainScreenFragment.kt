package io.github.luteoos.darknotes.view.fragment

import android.os.Bundle
import android.view.View
import io.github.luteoos.darknotes.R
import io.github.luteoos.darknotes.baseAbstract.FragmentVM
import io.github.luteoos.darknotes.viewmodel.MainScreenViewModel
import io.github.luteoos.mvvmbaselib.Event
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class MainScreenFragment() : FragmentVM<MainScreenViewModel>() {

    override val viewModel: MainScreenViewModel by sharedViewModel()

    override fun getLayoutID() = R.layout.header_main_screen//0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        connectToVMMessage()
    }

    override fun onVMMessage(msg: Event<Int>) {
        super.onVMMessage(msg)
     }
}