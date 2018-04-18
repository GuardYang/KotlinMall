package com.kotlin.mall.common

import android.content.Context
import android.support.multidex.MultiDex
import cn.jpush.android.api.JPushInterface
import com.kotlin.base.common.BaseApplication

/*
    主工程 Application
 */
class MainApplication:BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this);
        //极光推送初始化
        JPushInterface.setDebugMode(true)
        JPushInterface.init(this)
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}


