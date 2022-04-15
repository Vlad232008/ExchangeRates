package com.example.myapplication.data.repository

import com.example.myapplication.data.api.RetrofitInstance
import com.example.myapplication.model.beznal.Beznal
import com.example.myapplication.model.curse.Kurse
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Kurse> {
        return RetrofitInstance.api.getNalMoneys()
    }
    suspend fun getBezNal():Response<Beznal>{
        return RetrofitInstance.api.getBezNalMoneys()
    }
}