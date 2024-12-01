package com.manop.amphibians.data

import com.manop.amphibians.network.Amphibian

interface AmphibiansRepository {
    suspend fun getAmphibians(): List<Amphibian>
}