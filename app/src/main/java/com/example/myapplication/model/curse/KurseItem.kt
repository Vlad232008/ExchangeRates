package com.example.myapplication.model.curse

data class KurseItem(
    val currencyCodeA: Int,
    val currencyCodeB: Int,
    val date: Int,
    val rateBuy: Double,
    val rateCross: Double,
    val rateSell: Double
)