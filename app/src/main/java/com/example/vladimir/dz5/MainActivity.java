package com.example.vladimir.dz5;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends Activity implements OnMapReadyCallback {

    GoogleMap mGoogleMap;
    MapFragment mMapFragment;
    private GoogleMap.OnMapClickListener mCustomOnMapClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initialize();
    }

    private void initialize() {
        this.mMapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fGoogleMap);
        this.mMapFragment.getMapAsync(this);
        this.mCustomOnMapClickListener = new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                MarkerOptions newMarkerOptions = new MarkerOptions();
                newMarkerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.pin));
                newMarkerOptions.title("My place");
                newMarkerOptions.snippet("I declare this my teritory!");
                newMarkerOptions.position(latLng);
                mGoogleMap.addMarker(newMarkerOptions);
            }
        };
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        this.mGoogleMap = googleMap;
        UiSettings uiSettings = this.mGoogleMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);
        uiSettings.setMyLocationButtonEnabled(true);
        uiSettings.setZoomGesturesEnabled(true);
        this.mGoogleMap.setOnMapClickListener(this.mCustomOnMapClickListener);

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        this.mGoogleMap.setMyLocationEnabled(true);

    }
}
