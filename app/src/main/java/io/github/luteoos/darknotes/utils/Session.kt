package io.github.luteoos.darknotes.utils

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import io.github.luteoos.darknotes.view.activity.SplashScreenActivity
import io.reactivex.rxjava3.core.Observable
import java.util.*

object Session {
    private val USER_UUID = "USER_UUID"
    private val TOKEN = "TOKEN"
    private val USERNAME = "USERNAME"
    lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = PreferenceManager.getDefaultSharedPreferences(context)
    }

    var token: String
        get() {
           return preferences.getString(TOKEN, "") ?: ""
        }
        set(value) {
            preferences.edit().putString(TOKEN, value).apply()
        }


    val userUUIDString: String
        get() = preferences.getString(USER_UUID, "") ?: ""
    var userUUID: UUID
        get() {
            val userUUID = preferences.getString(USER_UUID, "")
            return UUID.fromString(userUUID)
        }
        set(value) {
            preferences.edit().putString(USER_UUID, value.toString()).apply()
        }

    var username: String
        get() {
            return preferences.getString(USERNAME, "") ?: ""
        }
        set(value) {
            preferences.edit().putString(USERNAME, value).apply()
        }

    fun logout(context: Context) {
        preferences.edit().clear().apply()
        val intent = Intent(context, SplashScreenActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}