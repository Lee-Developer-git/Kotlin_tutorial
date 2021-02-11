package com.seulgi.constructor_practice

import android.util.Log


//매개변수를 가지는 클래스~ // 친구를 외부에서 설정해주는 것
//이렇게 하면 외부(MyFrend.kt)에서 변수를 가져올 수 있음
class MyFriendWithParams(var name: String?,
                         var age: Int?,
                         var nickname: String?) {
    val TAG: String = "로그"

    var address: String = ""
    // init 시작
    // 기본생성자 호출~
    init{
        Log.d(TAG, "MyFriendWithParams - init() called")
        this.name = "아조씨"
        this.age = 30
        this.nickname = "꼰대"
    }

    // 추가생성자
    // this()뒤에 이미 있던 변수들 모두 기재해야함, 만들어진 애를 반환하면서 생성해주는 것
    constructor(name: String?,
                age: Int?,
                nickname: String?,
                address: String): this(name, age, nickname){
                    this.address = address
                }
}