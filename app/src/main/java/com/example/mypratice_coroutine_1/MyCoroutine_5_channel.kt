package com.example.mypratice_coroutine_1

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class MyCoroutine_5_channel {
    private lateinit var job1: Job
    private lateinit var job2: Job
    fun myCoroutine(){
        job1 = CoroutineScope(Dispatchers.IO).launch{
            var myChannel = Channel<Int>()
            coroutineScope {
                val data = 3
                myChannel.send(data)
            }
            coroutineScope {
                val myData = myChannel.receive()
            }
        }
    }

}