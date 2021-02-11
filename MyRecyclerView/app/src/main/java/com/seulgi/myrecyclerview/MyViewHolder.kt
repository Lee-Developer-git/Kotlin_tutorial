package com.seulgi.myrecyclerview

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.seulgi.myrecyclerview.databinding.LayoutRecylerviewItemBinding

class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val TAG: String = "로그"

    private lateinit var binding: LayoutRecylerviewItemBinding
    

    // 기본생성자
    init{
        Log.d(TAG, "MyViewHolder - init() called")
    }

    //데이터와 뷰를 묶는다.
    fun bind(myModel: MyModel){
        Log.d(TAG, "MyViewHolder - bind() called")

    }
}