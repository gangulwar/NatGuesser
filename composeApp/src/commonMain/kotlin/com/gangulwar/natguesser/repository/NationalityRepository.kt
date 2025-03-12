package com.gangulwar.natguesser.repository

import com.gangulwar.natguesser.data.model.NationalityResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.serialization.json.Json

class NationalityRepository(private val client: HttpClient) {

    suspend fun fetchNationality(name: String): NationalityResponse? {
        return try {
            val response: String = client.get("https://api.nationalize.io/?name=$name").body()
            Json { ignoreUnknownKeys = true }.decodeFromString(response)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}
