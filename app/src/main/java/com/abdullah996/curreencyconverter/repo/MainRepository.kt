package com.abdullah996.curreencyconverter.repo

import com.abdullah996.curreencyconverter.data.models.CurrencyResponse
import com.abdullah996.curreencyconverter.util.Resource

interface MainRepository {
    suspend fun getRates(base:String):Resource<CurrencyResponse>
}