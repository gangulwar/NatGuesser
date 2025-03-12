package com.gangulwar.natguesser.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.gangulwar.natguesser.data.model.NationalityResponse
import com.gangulwar.natguesser.repository.NationalityRepository
import io.ktor.client.HttpClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NationalityViewModel : ViewModel() {
    private val client = HttpClient()
    private val repository = NationalityRepository(client)

    suspend fun fetchNationality(name: String): NationalityResponse? {
        return if (name.isNotEmpty()) {
            try {
                withContext(Dispatchers.Main) {
                    repository.fetchNationality(name)                }
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        } else {
            null
        }
    }
}
