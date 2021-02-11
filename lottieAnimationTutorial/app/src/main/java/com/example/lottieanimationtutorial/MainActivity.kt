package com.example.lottieanimationtutorial

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lottieanimationtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"
    var isLiked: Boolean =false
    // 좋아요의 상태를 담는 변수!! 변수이므로 var로 해줘야

    private var activityMainBinding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)

        isLiked = false

        activityMainBinding = binding
        setContentView(activityMainBinding!!.root)

        activityMainBinding?.likeBtn?.setOnClickListener{ //람다식 리스너 사용
            Log.d(TAG, "MainActivity - onCreate() /좋아요 버튼이 클릭되었다")

            if (isLiked == false ){
                // 애니메이션의 커스텀
                // Custom animation speed or duration.
                // ofFloat(시작지점, 종료지점).setDuration(지속시간)
                // 0f = 0퍼센트, 0.5f = 50퍼센트 -> 반까지만 실행되도록 설정
                // 1000 -> 1초를 뜻한다
                val animator = ValueAnimator.ofFloat(0f, 0.5f).setDuration(1000)
                animator.addUpdateListener { animation: ValueAnimator ->
                    activityMainBinding?.likeBtn?.progress = animation.getAnimatedValue() as Float
                }
                animator.start()
                isLiked = true
            }
            else {
                Log.d(TAG, "MainActivity - onCreate() /좋아요가 없어졌다")

                val animator = ValueAnimator.ofFloat(0.5f, 1f).setDuration(1000)
                animator.addUpdateListener { animation: ValueAnimator ->
                    activityMainBinding?.likeBtn?.progress = animation.getAnimatedValue() as Float
                }
                animator.start()
                isLiked = false
            }
        }

    }
}