package com.example.bmwchallenge;

import android.location.Location;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Comparator;

public class Locations {
    private static final String TAG = "lel";
    private final String Name;
    private final String Address;
    private final String ArrivalTime;
    private final Integer ID;
    private final Float Latitude;
    private final Float Longitude;
//    MainActivity obj=new MainActivity();
//    Double userLat=obj.userLatitude;
//    Double userLong=obj.userLongitude;

    public Locations(String name, String address, String arrivalTime, Integer ID, Float latitude, Float longitude) {
        Name = name;
        Address = address;
        ArrivalTime = arrivalTime;
        this.ID = ID;
        Latitude = latitude;
        Longitude = longitude;
    }

    public static Comparator<Locations> LocationsNameComparator = new Comparator<Locations>() {
        @Override
        public int compare(Locations l1, Locations l2) {
            return l1.getName().compareTo(l2.getName());
        }
    };
    
    public static Comparator<Locations> LocationsDistanceComparator = new Comparator<Locations>() {
        @Override
        public int compare(Locations l1, Locations l2) {
            float[] results = new float[1];
//            Log.v(TAG, "l1" + (String.valueOf(l1.getLongitude())));
//            Log.v(TAG, "l1" + (String.valueOf(l1.getLatitude())));
//            Log.v(TAG, "l2" + (String.valueOf(l2.getLongitude())));
//            Log.v(TAG, "l2" + (String.valueOf(l2.getLatitude())));
//            Location.distanceBetween(l1.getLatitude(), l1.getLongitude(), l2.getLatitude(), l2.getLongitude(), results)
            return 5;
        }
    };

    public static Comparator<Locations> LocationsArrivalTimeComparator = new Comparator<Locations>() {
        @Override
        public int compare(Locations l1, Locations l2) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            return l1.getArrivalTime(format).compareTo(l2.getArrivalTime(format));
        }
    };

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getArrivalTime(SimpleDateFormat format) {
        return ArrivalTime;
    }

    public Integer getID() {
        return ID;
    }

    public Float getLatitude() {
        return Latitude;
    }

    public Float getLongitude() {
        return Longitude;
    }
}
