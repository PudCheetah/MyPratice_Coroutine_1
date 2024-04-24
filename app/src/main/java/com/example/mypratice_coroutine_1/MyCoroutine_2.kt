package com.example.mypratice_coroutine_1

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class MyCoroutine_2 {
    private lateinit var job: Job

    fun myPratice(){
        var myCoroutinContext = Dispatchers.IO
        job = CoroutineScope(myCoroutinContext).launch {
            //doSomething
        }
        job.cancel()
    }
}