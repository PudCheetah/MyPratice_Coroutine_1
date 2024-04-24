package com.example.mypratice_coroutine_1

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class MyCoroutine_4: AppCompatActivity() {
    private lateinit var job1: Job
    private lateinit var job2: Job
    fun myCoroutine(){
        job1 = CoroutineScope(Dispatchers.IO).launch{
            coroutineScope {

            }
            coroutineScope {

            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()

    }
}