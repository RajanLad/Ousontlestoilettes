package com.example.usecases

import com.example.models.ToilettesPubliquesItem
import com.example.repositories.ToilettesPubliquesAPIRepository
import javax.management.loading.ClassLoaderRepository

class FetchParisToilettesInfomationFromTheAPI(private val repository: ToilettesPubliquesAPIRepository) {

    suspend operator fun invoke(offset:Int): List<ToilettesPubliquesItem> {
        return repository.getDatasets(offset = offset)
    }
}