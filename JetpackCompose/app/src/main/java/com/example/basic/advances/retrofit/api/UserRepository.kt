package com.example.basic.advances.retrofit.api

import com.example.basic.advances.retrofit.model.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserRepository {

    private val api: Api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(Api::class.java)
    }

    fun getUser(): Flow<List<User>> = flow {
        val response = api.getAllUser()
        emit(response)
    }

}