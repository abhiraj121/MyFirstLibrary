package com.abhirajsharma.my_library

import android.util.Log

class LogDebug {

    val TAG = "AWESOME_APP"

    private fun p(message:String){
        Log.d(TAG,message)
    }
}