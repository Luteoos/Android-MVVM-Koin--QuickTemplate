package io.github.luteoos.darknotes.baseAbstract

import io.github.luteoos.mvvmbaselib.BaseFragmentMVVM
import io.github.luteoos.mvvmbaselib.BaseViewModel

abstract class BaseFragment<T: BaseViewModel> : BaseFragmentMVVM<T>() {
}