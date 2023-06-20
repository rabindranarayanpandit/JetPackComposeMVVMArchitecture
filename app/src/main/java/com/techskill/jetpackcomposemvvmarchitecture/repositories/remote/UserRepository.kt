package com.techskill.jetpackcomposemvvmarchitecture.repositories.remote

import com.techskill.jetpackcomposemvvmarchitecture.data.UserResponse
import com.techskill.jetpackcomposemvvmarchitecture.service.ApiInterface
import com.techskill.jetpackcomposemvvmarchitecture.utils.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class UserRepository @Inject constructor(
    private val apiInterface: ApiInterface
) {

    suspend fun getUserResponse(): Resource<List<UserResponse>> {
        val response = try {
            apiInterface.getUserData()
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred: ${e.localizedMessage}")
        }

        return Resource.Success(response)
    }
}