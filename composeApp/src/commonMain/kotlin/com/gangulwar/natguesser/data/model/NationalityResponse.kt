package com.gangulwar.natguesser.data.model

import kotlinx.serialization.Serializable

@Serializable
data class NationalityResponse(
    val name: String,
    val country: List<CountryProbability>
)

@Serializable
data class CountryProbability(
    val country_id: String,
    val probability: Double
)
