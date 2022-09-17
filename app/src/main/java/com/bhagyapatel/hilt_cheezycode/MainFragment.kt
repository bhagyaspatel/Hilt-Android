package com.bhagyapatel.hilt_cheezycode

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

// :: Field injection in Activity

@AndroidEntryPoint
class MainFragment : Fragment() {

//    @Inject
//    @Named("sql")
//    lateinit var userRepository: UserRepository

    @Inject
    @SQLQualifier
    lateinit var userRepository: UserRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        userRepository.saveUser("bpatel@gmail.com", "abc")

//        userRepository.saveUser()
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}

// NOTICE :: if we have used this annotatino on fragment then jaha par bhi yeh fragment use Activity
// pe bhi @AndroidEntryPoint use karna hoga