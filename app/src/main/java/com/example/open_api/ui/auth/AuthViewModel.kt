package com.example.open_api.ui.auth

import androidx.lifecycle.ViewModel
import com.example.open_api.repository.auth.AuthRepository

class AuthViewModel constructor(
    val authRepository: AuthRepository
):ViewModel() {
}