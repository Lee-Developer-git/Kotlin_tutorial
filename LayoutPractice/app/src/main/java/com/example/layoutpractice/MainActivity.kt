package com.example.layoutpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.layoutpractice.databinding.ActivityMainBinding

//메인화면
class MainActivity : AppCompatActivity() {

    private var activityMainBinding : ActivityMainBinding? =null

    val TAG: String ="로그"
    //view가 생성되었을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityMainBinding.inflate(layoutInflater)

        //xml파일을 연결시켜준다(여기서 뷰 바인딩 사용 가능!), 즉 설정한다
        //setContentView(R.layout.activity_main)
        activityMainBinding = binding
        setContentView(activityMainBinding!!.root)

//        activityMainBinding?.loginBtn?.setOnClickListener(View.OnClickListener {
//
//            onLoginButtonClicked()
//        })

        activityMainBinding?.loginBtn?.setOnClickListener{
            onLoginButtonClicked()
        }
    }

    fun onLoginButtonClicked(){
        Log.d(TAG, "MainActivity - onLoginButtonClicked() called")

        val intent = Intent(this, SecondActivity::class.java)

        startActivity(intent)
    }
}