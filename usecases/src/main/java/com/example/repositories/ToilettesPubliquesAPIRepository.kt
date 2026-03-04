package com.example.repositories

import com.example.models.ToilettesPubliquesItem
import java.time.ZoneOffset

interface  ToilettesPubliquesAPIRepository {
    suspend fun getDatasets(offset: Int): List<ToilettesPubliquesItem>
}