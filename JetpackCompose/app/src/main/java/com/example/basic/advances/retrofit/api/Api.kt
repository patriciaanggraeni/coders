package com.example.basic.advances.retrofit.api

import com.example.basic.advances.retrofit.model.User
import retrofit2.http.GET

interface Api {

    @GET("users")
    suspend fun getAllUser(): List<User>
}