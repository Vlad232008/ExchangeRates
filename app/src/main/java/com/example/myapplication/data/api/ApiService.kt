package com.example.myapplication.data.api

import com.example.myapplication.model.beznal.Beznal
import com.example.myapplication.model.curse.Kurse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("bank/currency")
    suspend fun getNalMoneys():Response<Kurse>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBezNalMoneys():Response<Beznal>
}