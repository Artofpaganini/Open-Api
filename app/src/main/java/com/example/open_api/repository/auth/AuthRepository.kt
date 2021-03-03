package com.example.open_api.repository.auth

import com.example.open_api.api.auth.OpenApiAuthService
import com.example.open_api.persistence.AccountPropertiesDao
import com.example.open_api.persistence.AuthTokenDao
import com.example.open_api.session.SessionManager
import javax.inject.Inject

class AuthRepository
@Inject
constructor(
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
) {
}