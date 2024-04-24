package com.example.mypratice_coroutine_1

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycling
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyCoroutine_3: AppCompatActivity(){
//使用lifecycleScope，lifescycleScope不用寫cancle,Coroutine會自動隨Activity消滅而消滅
    fun myPratice(){
        lifecycleScope.launch(Dispatchers.IO){
            //doSomething
        }
    }
}