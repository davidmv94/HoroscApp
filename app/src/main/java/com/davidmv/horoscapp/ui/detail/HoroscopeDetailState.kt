package com.davidmv.horoscapp.ui.detail

import com.davidmv.horoscapp.domain.model.HoroscopeModel

/*
** Coded by David Montes on 23/10/2023.
** https://github.com/davidthar
*/

sealed class HoroscopeDetailState {
    data object Loading:HoroscopeDetailState()
    data class Error(val error:String):HoroscopeDetailState()
    data class Success(val prediction:String, val sign:String, val horoscopeModel:HoroscopeModel):HoroscopeDetailState()
}