package com.example.bmwchallenge;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

        @GET("Locations")
        Call<List<Locations>> getLocations();
}
