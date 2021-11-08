package com.abdullah996.curreencyconverter.data

import com.abdullah996.curreencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    @GET("/latest?access_key=d20e8f77d06fba56833ad96c2079c8fd")
    suspend fun getRates(
        @Query("base") base:String
    ):Response<CurrencyResponse>
}