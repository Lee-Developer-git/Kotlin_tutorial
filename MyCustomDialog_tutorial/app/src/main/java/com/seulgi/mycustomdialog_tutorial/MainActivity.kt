package com.seulgi.mycustomdialog_tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

//implements
class MainActivity : AppCompatActivity(), MyCustomDialogInterface {

    val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity - onCreate() called")
    }

    fun onDialogBtnClicked(view: View){
        Log.d(TAG, "MainActivity - onDialogBtnClicked() called")

        val myCustomDialog = MyCustomDialog(this, this)
        myCustomDialog.show()
    }

     // 블로그버튼 클릭
     override fun onBlogBtnClicked() {
         Log.d(TAG, "MainActivity - onBlogBtnClicked() called")
         Toast.makeText(this, "블로그 버튼 클릭", Toast.LENGTH_SHORT).show()
     }

     // 깃헙 버튼 클릭
     override fun onGithubBtnClicked() {
         Log.d(TAG, "MainActivity - onGithubBtnClicked() called")
         Toast.makeText(this, " 좋아요 버튼 클릭", Toast.LENGTH_SHORT).show()
     }
 }