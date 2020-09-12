package com.example.tuk2020.app

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.POST

interface ApiService{
    @POST("register")
    fun register(
        @Field("name") Nama :String,
        @Field("email") Email :String,
        @Field("password") Password :String
    ):Call<ResponseBody>
    @POST("login")
    fun login(
        @Field("name") Nama :String,
        @Field("email") Email :String,
        @Field("password") Password :String
    ):Call<ResponseBody>
}