package com.example.recyclerview.model

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("todos")
    fun getEmails(): Call<List<Email>>
}