package com.sympla.testeandroid.data.network

import com.sympla.testeandroid.data.model.SymplaEventsResponse
import retrofit2.http.GET

interface SymplaApiService {
    @GET("events")
    suspend fun getEvents(): SymplaEventsResponse
}