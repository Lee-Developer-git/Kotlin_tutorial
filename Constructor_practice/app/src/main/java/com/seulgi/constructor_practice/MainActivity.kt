package com.seulgi.constructor_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity - onCreate() called")

        var myFriend = MyFriend() // 여기서 MyFriend()의 기본 생성자를 타게 됨...!

        Log.d(TAG, "MainActivity - myFriend.name : ${myFriend.name}")
        Log.d(TAG, "MainActivity - myFriend.age : ${myFriend.age}")
        Log.d(TAG, "MainActivity - myFriend.nickname : ${myFriend.nickname}")

        //매개변수가 들어가는 생성자
        var myFriendChulsoo = MyFriendWithParams(name = "철수",
                                                age = 17,
                                                nickname = "안철수")

        Log.d(TAG, "MainActivity - myFriendChulsoo.name : ${myFriendChulsoo.name}")
        Log.d(TAG, "MainActivity - myFriendChulsoo.age : ${myFriendChulsoo.age}")
        Log.d(TAG, "MainActivity - myFriendChulsoo.nickname : ${myFriendChulsoo.nickname}")


        var myFriendYoungSoo = MyFriendWithParams(name = "영수",
                                                age = 17,
                                                nickname = "국영수",
                                                address = "서울")
        Log.d(TAG, "MainActivity - myFreindYoungSoo.name : ${myFriendYoungSoo.name}")
        Log.d(TAG, "MainActivity - myFreindYoungSoo.age : ${myFriendYoungSoo.age}")
        Log.d(TAG, "MainActivity - myFreindYoungSoo.nickname : ${myFriendYoungSoo.nickname}")
        Log.d(TAG, "MainActivity - myFreindYoungSoo.address : ${myFriendYoungSoo.address}")

        // 추가생성자로 되어있는 친구 객체
        var myFriendJames = MyFriendWithMoreParams(name = "제임스")
        Log.d(TAG, "MainActivity - myFreindJames.name : ${myFriendJames.name}")
    }
}