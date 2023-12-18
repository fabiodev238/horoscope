package com.devs.horoscope.data.network.response



import com.devs.horoscope.motherobject.HoroscopeMotherObject.anyResponse
import io.kotlintest.shouldBe
import org.junit.Test

class PredictionResponseTest {

    @Test
    fun `toDomain should return a correct PredictionModel`() {


        val horoscopeResponse = anyResponse


        val predictionModel = horoscopeResponse.toDomain()


        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope

    }
}


