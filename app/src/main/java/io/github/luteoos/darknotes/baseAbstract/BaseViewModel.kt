package io.github.luteoos.darknotes.baseAbstract

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import io.github.luteoos.mvvmbaselib.BaseViewModel

abstract class BaseViewModel : BaseViewModel() {

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun clear(){
    }
}