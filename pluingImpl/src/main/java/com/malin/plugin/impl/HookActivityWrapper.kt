package com.malin.plugin.impl

import android.content.Context
import android.os.Build
import android.util.Log

object HookActivityWrapper {
    fun hookStartActivity(context: Context, subActivityClass: Class<*>, isAppCompat: Boolean) {
        Log.i("sanbo","inside HookActivityWrapper.hookStartActivity~~")
        hookPackageManager(context, subActivityClass, isAppCompat)
        HookActivity.hookStartActivity(context, subActivityClass)
        HookActivity.hookLauncherActivity()
        Log.i("sanbo","out HookActivityWrapper.hookStartActivity... success")
    }

    fun hookPackageManager(context: Context, subActivityClass: Class<*>, isAppCompat: Boolean) {
        Log.i("sanbo","inside HookActivityWrapper.hookPackageManager~~  isAppCompat:"+isAppCompat +"----subActivityClass:"+subActivityClass)
        // 处理启动的Activity为AppCompatActivity类或者子类的情况
        if (isAppCompat || Build.VERSION.SDK_INT <= 18) {
            HookActivity.hookPackageManager(context, subActivityClass)
        }
        Log.i("sanbo","out HookActivityWrapper.hookPackageManager~~ " )

    }
}
