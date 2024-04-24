package com.example.mypratice_coroutine_1

import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MyCoroutine {
    lateinit var job: Job
    suspend fun run() = coroutineScope {
        job = launch {
            repeat(100){i ->
                println("job: wait $i...")
                delay(500L)
                if(i == 10){
                    job.cancel()
                }
            }
        }
    }
}