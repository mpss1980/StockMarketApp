package com.plcoding.stockmarketapp.data.mappers

import com.plcoding.stockmarketapp.data.local.CompanyListingModel
import com.plcoding.stockmarketapp.domain.entities.CompanyListing

fun CompanyListingModel.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange,
    )
}

fun CompanyListing.toCompanyListingModel(): CompanyListingModel {
    return CompanyListingModel(
        name = name,
        symbol = symbol,
        exchange = exchange,
    )
}