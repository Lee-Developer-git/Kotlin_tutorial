package com.seulgi.admobtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.seulgi.admobtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG:String ="로그"
    private var activityMainBinding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        var binding = ActivityMainBinding.inflate(layoutInflater)
        activityMainBinding = binding
        setContentView(activityMainBinding!!.root)
        
        MobileAds.initialize(this) {}
        
        Log.d(TAG, "MainActivity - onCreate() called")

        val adRequest = AdRequest.Builder().build()
        //광고 요청 인스턴스를 만들어서 광고를 로드한다
        activityMainBinding?.banner?.loadAd(adRequest)

        activityMainBinding?.banner?.adListener = object: AdListener() {
            override fun onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                Log.d(TAG, "MainActivity - onAdLoaded() called")
            }

            override fun onAdFailedToLoad(adError : LoadAdError) {
                // Code to be executed when an ad request fails.
                Log.d(TAG, "MainActivity - onAdFailedToLoad() called")
            }

            override fun onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                Log.d(TAG, "MainActivity - onAdOpened() called")
            }

            override fun onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                Log.d(TAG, "MainActivity - onAdClicked() called")
            }

            override fun onAdLeftApplication() {
                // Code to be executed when the user has left the app.
                Log.d(TAG, "MainActivity - onAdLeftApplication() called")
            }

            override fun onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
                Log.d(TAG, "MainActivity - onAdClosed() called")
            }
        }
    }
}