package com.malin.hook

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * 宿主中未注册的AppCompatActivity类型的Activity
 */
@SuppressLint("SetTextI18n", "Registered")
class TargetAppCompatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "$TAG:onCreate")
        val relativeLayout = RelativeLayout(this)
        relativeLayout.gravity = Gravity.CENTER
        val textView = TextView(this)
        textView.text = "[宿主]宿主中未注册的TargetAppCompatActivity,启动成功!"
        textView.setTextColor(Color.parseColor("#000000"))
        relativeLayout.addView(textView)
        setContentView(relativeLayout)
        setTitle("[宿主]TargetAppCompatActivity");
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "$TAG:onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "$TAG:onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "$TAG:onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "$TAG:onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "$TAG:onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "$TAG:onDestroy")
    }

    companion object {
        private const val TAG = "TargetAppCompatActivity"
    }
}
