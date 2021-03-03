package com.example.open_api.ui.auth

import androidx.lifecycle.ViewModel
import com.example.open_api.repository.auth.AuthRepository
import javax.inject.Inject

class AuthViewModel
@Inject
constructor(
    val authRepository: AuthRepository
) : ViewModel() {
}