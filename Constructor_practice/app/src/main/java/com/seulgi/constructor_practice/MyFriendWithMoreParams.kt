package com.seulgi.constructor_practice

import android.util.Log

class MyFriendWithMoreParams() {

    val TAG: String = "로그"

    var name: String? = null
    var age: Int? = null
    var nickname: String? = null


    init {
        Log.d(TAG, "MyFriendWithMoreParams - init() called")
        this.name = ""
    }

    // 추가 생성자
    constructor(name: String): this(){
        Log.d(TAG, "MyFriendWithMoreParams - constructor() called")
        this.name = name
    }
}