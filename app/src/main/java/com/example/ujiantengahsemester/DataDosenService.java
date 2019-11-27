package com.example.ujiantengahsemester;

import com.example.ujiantengahsemester.Model.Dosen;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DataDosenService {
    @GET("/api/progmob/dosen/{nim_progmob}")
    Call<ArrayList<Dosen>> getDosenALL(@Path("nim_progmob") String nimProgmob);
}