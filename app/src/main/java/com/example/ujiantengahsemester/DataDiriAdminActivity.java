package com.example.ujiantengahsemester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DataDiriAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_diri_admin);
        this.setTitle("SI KRS - Hai Admin");

        Button btnSimpanAdm = (Button)findViewById(R.id.btnSimpanAdmin);
        btnSimpanAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DataDiriAdminActivity.this, HomeAdmin.class);
                startActivity(intent);
            }
        });
    }
}