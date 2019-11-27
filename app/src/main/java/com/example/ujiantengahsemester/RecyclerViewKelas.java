package com.example.ujiantengahsemester;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ujiantengahsemester.Adapter.KelasAdapter;
import com.example.ujiantengahsemester.Model.Kelas;

import java.util.ArrayList;

public class RecyclerViewKelas extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KelasAdapter kelasAdapter;
    private ArrayList<Kelas> kelasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_kelas);

        this.setTitle("SI KRS - Hai Dosen");

        tambahData();

        recyclerView = findViewById(R.id.rvKelas);
        kelasAdapter = new KelasAdapter(kelasList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewKelas.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(kelasAdapter);
    }

    public void tambahData() {
        kelasList = new ArrayList<>();
        kelasList.add(new Kelas("SI1313", "Dasar-Dasar Pemrograman", "3", "Senin", "Drs. Jong Jek Siang, M.Sc.", "30"));
        kelasList.add(new Kelas("SI1343", "Konsep Sistem Informasi", "3", "Senin", "Yetli Oslan, S.Kom., M.T.", "75"));
    }
}
