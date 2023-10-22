package com.davidmv.horoscapp.data.providers

import com.davidmv.horoscapp.domain.model.HoroscopeInfo
import com.davidmv.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

/*
** Coded by David Montes on 22/10/2023.
** https://github.com/davidthar
*/

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}