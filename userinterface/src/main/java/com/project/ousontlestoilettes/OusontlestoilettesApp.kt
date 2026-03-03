package com.project.ousontlestoilettes

import android.app.Application
import org.maplibre.android.MapLibre

class OusontlestoilettesApp: Application() {
    override fun onCreate() {
        super.onCreate()

        initialiseMapLibre()
    }

    private fun initialiseMapLibre() {
        // Init MapLibre
        MapLibre.getInstance(this)
    }
}