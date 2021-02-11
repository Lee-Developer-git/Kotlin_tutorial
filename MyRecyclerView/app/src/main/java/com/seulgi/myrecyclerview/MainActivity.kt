package com.seulgi.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    var modelList = ArrayList<MyModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")

        Log.d(TAG, "MainActivity - 반복문 돌리기 전 this.modelList.size: ${this.modelList.size}")

        //10번 반복하는 것
        for (i in 1..10){
            var myModel = MyModel(name = "프로필 $i", profileImage = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cc/XEIcon_xi-message.svg/40px-XEIcon_xi-message.svg.png")
            this.modelList.add(myModel)
        }

        Log.d(TAG, "MainActivity - 반복문 돌린 후 this.modelList.size: ${this.modelList.size}")
    }
}