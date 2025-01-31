package com.YOUR_APP_NAME.modules  // Replace with your actual package name

import android.view.View
import com.ola.mapsdk.view.OlaMapView
import com.ola.mapsdk.map.OlaMap
import com.ola.mapsdk.map.OlaMapCallback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext

class OlaMapModule : SimpleViewManager<OlaMapView>() {

    companion object {
        const val REACT_CLASS = "OlaMapView"
    }

    private lateinit var mapView: OlaMapView

    override fun getName(): String {
        return REACT_CLASS
    }

    override fun createViewInstance(reactContext: ThemedReactContext): OlaMapView {
        mapView = OlaMapView(reactContext)

        // Initialize the Ola Map with an API key
        mapView.getMap("<YOUR_OLA_API_KEY>", object : OlaMapCallback {
            override fun onMapReady(olaMap: OlaMap) {
                // Map is ready to use
            }

            override fun onMapError(error: String) {
                // Handle error
            }
        })

        return mapView
    }
}
