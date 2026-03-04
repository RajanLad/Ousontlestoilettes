package com.example.models

data class ToilettesPubliquesItem(val horaire: String = "",
                       val urlFicheEquipement: String = "",
                       val accesPmr: String = "",
                       val relaisBebe: String = "",
                       val geoPointD: GeoPointD,
                       val arrondissement: String = "",
                       val geoShape: GeoShape,
                       val adresse: String = "",
                       val type: String = "",
                       val statut: String = "")