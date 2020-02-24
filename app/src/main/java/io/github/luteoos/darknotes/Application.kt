package io.github.luteoos.darknotes

import android.app.Application
import android.os.StrictMode
import com.luteoos.kotlin.mvvmbaselib.BuildConfig
import io.github.luteoos.darknotes.utils.Session
import timber.log.Timber

class Application : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.e(this.toString())
        Session.init(applicationContext)
        if(BuildConfig.DEBUG)
            initDebugStuff()
    }

    private fun initDebugStuff() {
        Timber.plant(Timber.DebugTree())

        Timber.e("initDebugStuff")
        StrictMode.setThreadPolicy(
            StrictMode.ThreadPolicy.Builder()
                .detectDiskReads()
                .detectDiskWrites()
                .detectNetwork()
                .penaltyLog()
                .build())
        StrictMode.setVmPolicy(
            StrictMode.VmPolicy.Builder()
                .detectLeakedSqlLiteObjects()
                .detectLeakedClosableObjects()
                .penaltyLog()
                .penaltyDeath()
                .build())
    }
}