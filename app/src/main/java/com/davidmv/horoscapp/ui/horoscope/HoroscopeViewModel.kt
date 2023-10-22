package com.davidmv.horoscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.davidmv.horoscapp.data.providers.HoroscopeProvider
import com.davidmv.horoscapp.domain.model.HoroscopeInfo
import com.davidmv.horoscapp.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

/*
** Coded by David Montes on 22/10/2023.
** https://github.com/davidthar
*/

@HiltViewModel
class HoroscopeViewModel @Inject constructor(horoscopeProvider: HoroscopeProvider) : ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope : StateFlow<List<HoroscopeInfo>> = _horoscope

    init {
        _horoscope.value = horoscopeProvider.getHoroscopes()
    }
}