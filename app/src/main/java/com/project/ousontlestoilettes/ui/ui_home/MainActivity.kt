package com.project.ousontlestoilettes.ui.ui_home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.project.ousontlestoilettes.ui.theme.OusontlestoilettesTheme
import org.maplibre.android.camera.CameraPosition
import org.maplibre.android.geometry.LatLng
import org.maplibre.android.maps.MapView

class MainActivity : ComponentActivity() {
    lateinit var mapView: MapView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //initializations
        mapView = MapView(this)

        enableEdgeToEdge()
        setContent {
            OusontlestoilettesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize().padding(innerPadding),
                        color = MaterialTheme.colorScheme.background
                    ) {

                        HomeMapView(mapView = mapView)
                    }
                }
            }
        }
    }
}

@Composable
fun HomeMapView(mapView: MapView) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            mapView.getMapAsync { map ->

//                map.setStyle("https://demotiles.maplibre.or?g/style.json")

                //Base map
                map.setStyle("https://basemaps.cartocdn.com/gl/dark-matter-gl-style/style.json")
                //paris co ordinates : 48.856123042763045, 2.3454701293625657
                map.cameraPosition = CameraPosition.Builder().target(LatLng(48.856123042763045, 2.3454701293625657)).zoom(11.0).build()
            }

            mapView
        }
    )
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OusontlestoilettesTheme {
        Greeting("Android")
    }
}