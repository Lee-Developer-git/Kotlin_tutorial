package com.example.androidlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.androidlifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    private var activityMainBinding : ActivityMainBinding? =null

    // 엑티비티가 생성되었을 때 oncreate()발동!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 자동으로 완성된 엑티비티 메인 바인딩 클래스 인스턴스를 가져온다.
        val binding = ActivityMainBinding.inflate(layoutInflater)
        //뷰 바인딩과 연결시킴
        activityMainBinding = binding
        setContentView(activityMainBinding!!.root)

        Log.d(TAG, "MainActivity - onCreate() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "MainActivity - onRestart() called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity - onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity - onResume() called")
    }

    override fun onPause() {
        super.onPause()
        activityMainBinding?.textView?.visibility = View.VISIBLE
        activityMainBinding?.textView?.setText("onPause()")

        Log.d(TAG, "MainActivity - onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity - onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity - onDestroy() called")
    }

}