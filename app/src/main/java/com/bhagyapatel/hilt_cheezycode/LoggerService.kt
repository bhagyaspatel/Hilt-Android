package com.bhagyapatel.hilt_cheezycode

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

//@Singleton
@ActivityScoped
class LoggerService @Inject constructor() {
    
    fun loginService(message : String){
        Log.d(TAG, "loginService ${message}")
    }
}