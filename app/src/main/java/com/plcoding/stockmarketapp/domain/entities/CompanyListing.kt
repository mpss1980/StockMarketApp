package com.plcoding.stockmarketapp.domain.entities

data class CompanyListing(
    val name: String,
    val symbol: String,
    val exchange: String,
)
