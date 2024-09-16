package com.devs.horoscope.data

import android.util.Log
import com.devs.horoscope.data.network.HoroscopeApiService
import com.devs.horoscope.domain.Repository
import com.devs.horoscope.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching {
            apiService.getHoroscope(sign)
        }
            .onSuccess { return it.toDomain()}
            .onFailure { Log.e("Search", "Ha ocurrido un Error!${it.message}") }

        return null
    }
}