package com.persistent.sourabh_mandal.mapmarkerpath;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

public class PathAndMarkerActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    static final LatLng Stall_1 = new LatLng(12.921, 77.681);
    static final LatLng Stall_2 = new LatLng(12.923, 77.683);
    static final LatLng Stall_3 = new LatLng(12.925, 77.685);
    static final LatLng Stall_4 = new LatLng(12.927, 77.687);

    List<LatLng> Stalls = new ArrayList<LatLng>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_and_marker);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Stalls.add(Stall_1);
        Stalls.add(Stall_2);
        Stalls.add(Stall_3);
        Stalls.add(Stall_4);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng blore = new LatLng(12, 77);
        /*mMap.addMarker(new MarkerOptions().position(Stall_1).title("STALL 1"));//.icon(BitmapDescriptorFactory.fromResource(R.raw.stall)));
        mMap.addMarker(new MarkerOptions().position(Stall_2).title("STALL 2"));//.icon(BitmapDescriptorFactory.fromResource(R.raw.stall)));
        mMap.addMarker(new MarkerOptions().position(Stall_3).title("STALL 3"));//.icon(BitmapDescriptorFactory.fromResource(R.raw.stall)));
        mMap.addMarker(new MarkerOptions().position(Stall_4).title("STALL 4"));//.icon(BitmapDescriptorFactory.fromResource(R.raw.stall)));
*/
        int counter =0;
        for(LatLng l : Stalls)
        {
            counter = 0;
            while()
            mMap.addMarker(new MarkerOptions().position(l).title("STALL "+ counter++));
            Polyline line1 = mMap.addPolyline(new PolylineOptions().add(Stall_1, Stall_2).width(5).color(Color.RED));
        }

        mMap.moveCamera(CameraUpdateFactory.newLatLng(blore));


//        Polyline line2 = mMap.addPolyline(new PolylineOptions().add(Stall_3, Stall_4).width(5).color(Color.DKGRAY));
    }
}
