package com.bhagyapatel.hilt_cheezycode

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

// :: Field injection in application

@HiltAndroidApp //this annotaion generates Dagger code behind the scene
class UserApplication : Application() { //every time we do Hilt injection we need to make an Application class

//    @Inject
//    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()
        //jaise hi super.onCreate call hoga jitni bhi field ke upar @Inject annotaion hai woh on ho jayegi

//        userRepository.saveUser("bhagya@gmail.com", "123456")
//        userRepository.saveUser()
    }
}

// NOTICE :: ADD THE ENTRY OF UserApplication IN MANIFEST
