package com.example.diwithhiltdemo.repo

import com.example.diwithhiltdemo.models.Cryptocurrency

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}