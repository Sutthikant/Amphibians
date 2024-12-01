package com.manop.amphibians.data

import com.manop.amphibians.network.Amphibian
import com.manop.amphibians.network.AmphibiansApiService

class NetworkAmphibiansRepository(
    private val amphibiansApiService: AmphibiansApiService): AmphibiansRepository  {
    override suspend fun getAmphibians(): List<Amphibian> =
        amphibiansApiService.getAmphibians()
}