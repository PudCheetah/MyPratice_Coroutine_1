package com.example.mypratice_coroutine_1

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

//使用CoroutineScope介面
class MyCoroutine_1: CoroutineScope{
    private lateinit var job: Job
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.IO + job

    fun myPratice(){
        job = Job()
        launch {
            //doSomething
        }
        job.cancel()
    }
}