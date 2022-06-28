package com.example.jendelapelajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Kuis_Pkn_Kelas4_Hasil extends AppCompatActivity {
    TextView txt_nilai,txt_comment,soal_no1,soal_no2,soal_no3,soal_no4,soal_no5,soal_no6,soal_no7,soal_no8,soal_no9,soal_no10;
    Button btn_materi, cobalagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_pkn_kelas4_hasil);

        getSupportActionBar().setTitle("HASIL");

        txt_nilai = findViewById(R.id.txt_nilai);
        txt_comment = findViewById(R.id.txt_comment);
        btn_materi = findViewById(R.id.btn_materi);
        cobalagi = findViewById(R.id.btn_cobalagi);
        soal_no1 = findViewById(R.id.soal_1);
        soal_no2 = findViewById(R.id.soal_2);
        soal_no3 = findViewById(R.id.soal_3);
        soal_no4 = findViewById(R.id.soal_4);
        soal_no5 = findViewById(R.id.soal_5);
        soal_no6 = findViewById(R.id.soal_6);
        soal_no7 = findViewById(R.id.soal_7);
        soal_no8 = findViewById(R.id.soal_8);
        soal_no9 = findViewById(R.id.soal_9);
        soal_no10 = findViewById(R.id.soal_10);

        int nilai = getIntent().getExtras().getInt("nilai");
        String soal_1 = getIntent().getExtras().getString("value_no1");
        String soal_2 = getIntent().getExtras().getString("value_no2");
        String soal_3 = getIntent().getExtras().getString("value_no3");
        String soal_4 = getIntent().getExtras().getString("value_no4");
        String soal_5 = getIntent().getExtras().getString("value_no5");
        String soal_6 = getIntent().getExtras().getString("value_no6");
        String soal_7 = getIntent().getExtras().getString("value_no7");
        String soal_8 = getIntent().getExtras().getString("value_no8");
        String soal_9 = getIntent().getExtras().getString("value_no9");
        String soal_10 = getIntent().getExtras().getString("value_no10");
        txt_nilai.setText(String.valueOf(nilai));
        soal_no1.setText(String.valueOf(soal_1));
        soal_no2.setText(String.valueOf(soal_2));
        soal_no3.setText(String.valueOf(soal_3));
        soal_no4.setText(String.valueOf(soal_4));
        soal_no5.setText(String.valueOf(soal_5));
        soal_no6.setText(String.valueOf(soal_6));
        soal_no7.setText(String.valueOf(soal_7));
        soal_no8.setText(String.valueOf(soal_8));
        soal_no9.setText(String.valueOf(soal_9));
        soal_no10.setText(String.valueOf(soal_10));
        if(nilai >= 80) {
            txt_comment.setText("Selamat kamu lulus, Kerenn!!");
        }else if(nilai >= 60) {
            txt_comment.setText("Kamu lulus kok, tapi belajar lagi ya!");
        }else {
            txt_comment.setText("Kamu harus belajar lagi!");
        }

        btn_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Kuis_Pkn_Kelas4_Hasil.this, MateriPKN.class);
                finish();
                startActivity(i);

            }
        });

        cobalagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Kuis_Pkn_Kelas4_Hasil.this, Kuis_Pkn_Kelas4.class);
                finish();
                startActivity(i);

            }
        });
    }
}