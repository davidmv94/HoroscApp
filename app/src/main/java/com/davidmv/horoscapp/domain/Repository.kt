package com.davidmv.horoscapp.domain

import com.davidmv.horoscapp.data.network.response.PredictionResponse
import com.davidmv.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String) : PredictionModel?
}