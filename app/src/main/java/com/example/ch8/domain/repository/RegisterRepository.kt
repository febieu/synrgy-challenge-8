package com.example.ch8.domain.repository

interface RegisterRepository {
    suspend fun validateInput(
        username: String,
        email: String,
        password: String,
        confirmPassword: String,
    ): Boolean

    suspend fun register(
        username: String,
        email: String,
        password: String,
        confirmPassword: String,
    )
}
