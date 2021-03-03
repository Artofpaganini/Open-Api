package com.example.open_api.di

import com.example.open_api.di.auth.AuthFragmentBuildersModule
import com.example.open_api.di.auth.AuthModule
import com.example.open_api.di.auth.AuthScope
import com.example.open_api.di.auth.AuthViewModelModule
import com.example.open_api.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
        modules = [AuthModule::class, AuthFragmentBuildersModule::class, AuthViewModelModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity

}