package com.davidmv.horoscapp.domain.usecases

import com.davidmv.horoscapp.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke(sign:String) = repository.getPrediction(sign)
}