package com.davidmv.horoscapp.ui.providers

import org.junit.Test
import org.junit.jupiter.api.Assertions.*


class RandomCardProviderTest {

    @Test
    fun `getRandomCard should return a random card`(){
        val randomCard = RandomCardProvider()

        val card = randomCard.getLucky()

        assertNotNull(card)
    }
}