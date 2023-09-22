package com.devs.horoscope.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.NavArgs
import androidx.navigation.navArgs
import com.devs.horoscope.R
import com.devs.horoscope.databinding.ActivityHoroscopeDetailBinding
import com.devs.horoscope.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HoroscopeDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHoroscopeDetailBinding

    private val horoscopeDetailViewModel: HoroscopeDetailViewModel by viewModels()
    //  private val horoscopeViewModel by viewModels<HoroscopeViewModel>()

    private val args: HoroscopeDetailActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        args.type

    }
}