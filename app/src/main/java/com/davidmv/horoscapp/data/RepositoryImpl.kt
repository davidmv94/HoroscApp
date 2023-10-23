package com.davidmv.horoscapp.data

import android.util.Log
import com.davidmv.horoscapp.data.network.HoroscopeApiService
import com.davidmv.horoscapp.data.network.response.PredictionResponse
import com.davidmv.horoscapp.domain.Repository
import com.davidmv.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) :Repository {

    override suspend fun getPrediction(sign: String) : PredictionModel? {
        kotlin.runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("davidmv", "Ha ocurrido un error ${it.message}") }

        return null
    }
}