package com.abdullah996.curreencyconverter.data.models


import com.google.gson.annotations.SerializedName

data class CurrencyResponse(
    @SerializedName("base")
    val base: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("rates")
    val rates: Rates,
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("timestamp")
    val timestamp: Int
)