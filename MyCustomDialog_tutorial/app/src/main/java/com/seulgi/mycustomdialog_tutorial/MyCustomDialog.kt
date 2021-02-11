package com.seulgi.mycustomdialog_tutorial

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import com.seulgi.mycustomdialog_tutorial.databinding.CustomDialogBinding


class MyCustomDialog(context: Context,
                    myCustomDialogInterface: MyCustomDialogInterface)
                    : Dialog(context), View.OnClickListener {
    val TAG: String = "로그"

    private var myCustomDialogInterface: MyCustomDialogInterface? = null
    //이 인터페이스를 어떻게 연결시키느냐? 외부에서 연결시켜주는 것. 생성자쪽에서 연결


    var binding = CustomDialogBinding.inflate(layoutInflater)
    private var customDialogBinding = binding

    var blogbtn = customDialogBinding?.blogBtn
    var githubbtn = customDialogBinding?.githubBtn

    // 인터페이스 연결
    init{
        this.myCustomDialogInterface = myCustomDialogInterface
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(customDialogBinding!!.root)

        Log.d(TAG, "MyCustomDialog - onCreate() called")
        //배경 투명하게 만들기
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

         blogbtn?.setOnClickListener(this)
         githubbtn?.setOnClickListener(this)
    }

    //onClick에 대한 implement
    override fun onClick(view: View?) {
        when(view){
            blogbtn ->{ // 블로그 버튼이 클릭되었을 때
                Log.d(TAG, "MyCustomDialog 블로그 버튼 클릭!")
                this.myCustomDialogInterface?.onBlogBtnClicked()
                //생성자로 들어온 myCustomDialogInterface은 아님,, init에서 연결시켜주는 것
            }
            githubbtn ->{
                Log.d(TAG, "MyCustomDialog github 버튼 클릭")
                this.myCustomDialogInterface?.onGithubBtnClicked()
            }
        }
    }
}