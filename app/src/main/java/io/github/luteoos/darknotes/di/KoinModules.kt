package io.github.luteoos.darknotes.di

import io.github.luteoos.darknotes.utils.Session
import io.github.luteoos.darknotes.viewmodel.MainScreenViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { Session(androidContext()) }

}

val vmModule = module {
    viewModel { MainScreenViewModel() }

}

val koinModules = listOf(appModule, vmModule)