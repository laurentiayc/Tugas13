package com.example.ujiantengahsemester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DataDiriDosenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_diri_dosen);

        this.setTitle("SI KRS - Hai Dosen");

        Button btnDaftarKrs = (Button)findViewById(R.id.btnSimpanDataMahasiswa);
        btnDaftarKrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DataDiriDosenActivity.this, HomeDosen.class);
                startActivity(intent);
            }
        });
    }
}
