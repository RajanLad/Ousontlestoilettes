package com.example.api_responses

import com.example.models.ResultsItem

data class ToilettesPubliquesAPIResponse(val totalCount: Int = 0,
                                         val results: List<ResultsItem>?)