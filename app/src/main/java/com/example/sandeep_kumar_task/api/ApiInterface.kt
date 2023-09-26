package com.example.sandeep_kumar_task.api

import com.example.sandeep_kumar_task.model.User
import retrofit2.Response
import retrofit2.http.GET


interface ApiInterface {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>

}