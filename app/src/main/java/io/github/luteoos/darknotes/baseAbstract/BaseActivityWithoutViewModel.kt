package io.github.luteoos.darknotes.baseAbstract

import android.os.Bundle
import io.github.luteoos.mvvmbaselib.BaseActivityMVVM
import io.github.luteoos.mvvmbaselib.BaseActivityMVVMWithoutVM

abstract class BaseActivityWithoutViewModel : BaseActivityMVVMWithoutVM(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setPortraitOrientation(true)
    }
}