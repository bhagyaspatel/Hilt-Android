package com.bhagyapatel.hilt_cheezycode

import android.util.Log
import javax.inject.Inject

const val TAG = "HILT_APP"

//class UserRepository @Inject constructor(){
//
//    fun saveUser(email : String, password : String){
//        Log.d(TAG, "saveUser: User saved in db")
//    }
//}


// :: Field injection in Service

//class UserRepository @Inject constructor(val loggerService: LoggerService){
//
//    fun saveUser(){
//        loggerService.loginService("saveUser service: User saved in db")
//    }
//}


// :: Field Injection using modules

interface UserRepository{
    fun saveUser(email :String, password : String)
}

//Since there is an @Inject() annotation Hilt knows how to make an object of this class
class SQLRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: implementaion of UserRepository interface :user saved in SQL")
    }
}

//FirebaseRepository does not have @Inject() Annotation so we need to use Modules
class FirebaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: implementaion of UserRepository interface :user saved in firebase")
    }
}