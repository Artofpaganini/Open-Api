package com.example.open_api.session

import android.app.Application
import com.example.open_api.persistence.AuthTokenDao

class SessionManager constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
) {
}