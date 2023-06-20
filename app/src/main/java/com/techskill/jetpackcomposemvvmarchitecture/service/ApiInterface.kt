package com.techskill.jetpackcomposemvvmarchitecture.service

import com.techskill.jetpackcomposemvvmarchitecture.data.UserResponse
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface ApiInterface {
    @GET("todos")
    suspend fun getUserData(): List<UserResponse>
}