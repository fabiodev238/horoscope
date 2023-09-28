package com.devs.horoscope.domain

import com.devs.horoscope.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String):PredictionModel?
}