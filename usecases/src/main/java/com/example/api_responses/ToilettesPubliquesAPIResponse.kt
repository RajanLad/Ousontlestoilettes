package com.example.api_responses


import com.example.models.ToilettesPubliquesItem

data class ToilettesPubliquesAPIResponse(val totalCount: Int = 0,
                                         val results: List<ToilettesPubliquesItem>?)