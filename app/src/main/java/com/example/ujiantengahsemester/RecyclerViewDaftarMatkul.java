package com.example.ujiantengahsemester;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ujiantengahsemester.Adapter.MatkulAdapter;
import com.example.ujiantengahsemester.Model.Matakuliah;

import java.util.ArrayList;

public class RecyclerViewDaftarMatkul extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MatkulAdapter matkulAdapter;
    private ArrayList<Matakuliah> mkList;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.create,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu1){
            Intent intent = new Intent(RecyclerViewDaftarMatkul.this,CreateMatkulActivity.class);
            startActivity(intent);
        }
        return  true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_daftar_matkul);
        this.setTitle("SI KRS - Hai Admin");

        tambahData();

        recyclerView = findViewById(R.id.rvMatkul);
        matkulAdapter = new MatkulAdapter(mkList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewDaftarMatkul.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(matkulAdapter);
    }

    public void tambahData(){
        mkList = new ArrayList<>();
        mkList.add(new Matakuliah("SI1313","Dasar-Dasar Pemrograman","Senin","3","1"));
        mkList.add(new Matakuliah("SI1343","Konsep Sistem Informasi","Senin","3","2"));
        mkList.add(new Matakuliah("SI1413","Statistika","Senin","3","3"));
        mkList.add(new Matakuliah("SI2353", "Analisis Data Bisnis","Senin","3","4"));
        mkList.add(new Matakuliah("SI2413", "Rekayasa Perangkat Lunak","Selasa","3","2"));
    }
}