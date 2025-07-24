package com.sympla.testeandroid.data.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Networking {
    private const val BASE_URL = "https://api.sympla.com.br/public/v1.5.1/"
    private const val API_KEY = "API_KEY_AQUI"

    private val client = OkHttpClient.Builder()
        .addInterceptor { chain ->
            val originalRequest = chain.request()
            val requestWithApiKey = originalRequest.newBuilder()
                .header("s_token", API_KEY)
                .build()
            chain.proceed(requestWithApiKey)
        }
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val symplaApiService: SymplaApiService by lazy {
        retrofit.create(SymplaApiService::class.java)
    }
}