package com.plcoding.stockmarketapp.data.local

import androidx.room.*

@Dao
interface StockDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCompanyListings(
        companyListingModels: List<CompanyListingModel>
    )

    @Query("DELETE FROM companylistingentity")
    suspend fun clearCompanyListings()

    @Query(
        """
            SELECT * 
            FROM companylistingentity
            WHERE LOWER(name) LIKE '%' || LOWER(:query) || '%' OR
                UPPER(:query) == symbol
              """
    )
    suspend fun searchCompanyListing(query: String): List<CompanyListingModel>
}