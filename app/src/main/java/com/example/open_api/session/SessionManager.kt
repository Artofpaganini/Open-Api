package com.example.open_api.session

import android.app.Application
import com.example.open_api.persistence.AuthTokenDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SessionManager @Inject
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
) {
}