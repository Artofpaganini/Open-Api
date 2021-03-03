package com.example.open_api

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out dagger.android.support.DaggerApplication>? {
//        return DaggerAppComponent.builder().application(this).build()
        return null
    }

}