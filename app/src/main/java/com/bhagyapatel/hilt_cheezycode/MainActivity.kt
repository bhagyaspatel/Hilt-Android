package com.bhagyapatel.hilt_cheezycode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // :: Field injection in Activity

//    @Inject
//    lateinit var userRepository : UserRepository

    @Inject
    lateinit var loggerService: LoggerService

    @Inject
    lateinit var loggerService2 : LoggerService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        userRepository.saveUser("bhagyapatel@gmail.com", "12345")

//        userRepository.saveUser()
    }
}