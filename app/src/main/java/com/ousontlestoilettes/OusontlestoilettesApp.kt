package com.ousontlestoilettes

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import org.maplibre.android.MapLibre

@HiltAndroidApp
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