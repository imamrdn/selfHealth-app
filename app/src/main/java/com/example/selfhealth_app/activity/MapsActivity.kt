package com.example.selfhealth_app.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.selfhealth_app.R

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.selfhealth_app.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val hospital1 = LatLng(-7.768414317381166, 110.37348492575882)
        mMap.addMarker(MarkerOptions().position(hospital1).title("RSUP Dr.Sardjito"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hospital1))

        val hospital2 = LatLng(-7.800527903281889, 110.3623322545951)
        mMap.addMarker(MarkerOptions().position(hospital2).title("RS PKU Muhammadiyah"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hospital2))

        val hospital3 = LatLng(-7.776973231044184, 110.376172354595)
        mMap.addMarker(MarkerOptions().position(hospital3).title("RS Umum Panti Rapih"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hospital3))

    }
}