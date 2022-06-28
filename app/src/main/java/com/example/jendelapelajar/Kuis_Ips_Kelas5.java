package com.example.jendelapelajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Kuis_Ips_Kelas5 extends AppCompatActivity {

    RadioGroup radiogr1,radiogr2,radiogr3,radiogr4,radiogr5,radiogr6,radiogr7,radiogr8,radiogr9,radiogr10;
    private Button proses;
    private RadioButton value_no1,value_no2,value_no3,value_no4,value_no5,value_no6,value_no7,value_no8,value_no9,value_no10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_ips_kelas5);

        getSupportActionBar().setTitle("SOAL IPS - 5");

        radiogr1 = findViewById(R.id.radiogroup1);
        radiogr2 = findViewById(R.id.radiogroup2);
        radiogr3 = findViewById(R.id.radiogroup3);
        radiogr4 = findViewById(R.id.radiogroup4);
        radiogr5 = findViewById(R.id.radiogroup5);
        radiogr6 = findViewById(R.id.radiogroup6);
        radiogr7 = findViewById(R.id.radiogroup7);
        radiogr8 = findViewById(R.id.radiogroup8);
        radiogr9 = findViewById(R.id.radiogroup9);
        radiogr10 = findViewById(R.id.radiogroup10);

        proses = findViewById(R.id.button_proses);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int pointa = radiogr1.getCheckedRadioButtonId();
                value_no1 = (RadioButton) findViewById(pointa);

                int pointb = radiogr2.getCheckedRadioButtonId();
                value_no2 = (RadioButton) findViewById(pointb);

                int pointc = radiogr3.getCheckedRadioButtonId();
                value_no3 = (RadioButton) findViewById(pointc);

                int pointd = radiogr4.getCheckedRadioButtonId();
                value_no4 = (RadioButton) findViewById(pointd);

                int pointe = radiogr5.getCheckedRadioButtonId();
                value_no5 = (RadioButton) findViewById(pointe);

                int pointf = radiogr6.getCheckedRadioButtonId();
                value_no6 = (RadioButton) findViewById(pointf);

                int pointg = radiogr7.getCheckedRadioButtonId();
                value_no7 = (RadioButton) findViewById(pointg);

                int pointh = radiogr8.getCheckedRadioButtonId();
                value_no8 = (RadioButton) findViewById(pointh);

                int pointi = radiogr9.getCheckedRadioButtonId();
                value_no9 = (RadioButton) findViewById(pointi);

                int pointj = radiogr10.getCheckedRadioButtonId();
                value_no10 = (RadioButton) findViewById(pointj);



                int nilai = 0; // variabel untuk menampung nilai


                if (value_no1.isChecked() && value_no2.isChecked() && value_no3.isChecked() && value_no4.isChecked() && value_no5.isChecked())
                {

                    if (value_no1.getText().toString().toLowerCase().equals("kegiatan ekonomi")) {
                        nilai = nilai + 10;
                    }
                    if (value_no2.getText().toString().toLowerCase().equals("produksi")) {
                        nilai = nilai + 10;
                    }
                    if (value_no3.getText().toString().toLowerCase().equals("industri, produksi, dan distribusi")) {
                        nilai = nilai + 10;
                    }
                    if (value_no4.getText().toString().toLowerCase().equals("distributor")) {
                        nilai = nilai + 10;
                    }
                    if (value_no5.getText().toString().toLowerCase().equals("konsumsi")) {
                        nilai = nilai + 10;
                    }
                    if (value_no6.getText().toString().toLowerCase().equals("prinsip konsumsi")) {
                        nilai = nilai + 10;
                    }
                    if (value_no7.getText().toString().toLowerCase().equals("dataran rendah")) {
                        nilai = nilai + 10;
                    }
                    if (value_no8.getText().toString().toLowerCase().equals("pabrik sepatu mengekspor produknya ke Jepang")) {
                        nilai = nilai + 10;
                    }
                    if (value_no9.getText().toString().toLowerCase().equals("kecenderungan bersikap boros")) {
                        nilai = nilai + 10;
                    }
                    if (value_no10.getText().toString().toLowerCase().equals("karyawan swasta, buruh pabrik, dan sopir")) {
                        nilai = nilai + 10;
                    }

                    Intent i = new Intent(Kuis_Ips_Kelas5.this, Kuis_Ips_Kelas5_Hasil.class);
                    i.putExtra("nilai", nilai);
                    i.putExtra("value_no1", value_no1.getText().toString());
                    i.putExtra("value_no2", value_no2.getText().toString());
                    i.putExtra("value_no3", value_no3.getText().toString());
                    i.putExtra("value_no4", value_no4.getText().toString());
                    i.putExtra("value_no5", value_no5.getText().toString());
                    i.putExtra("value_no6", value_no6.getText().toString());
                    i.putExtra("value_no7", value_no7.getText().toString());
                    i.putExtra("value_no8", value_no8.getText().toString());
                    i.putExtra("value_no9", value_no9.getText().toString());
                    i.putExtra("value_no10", value_no10.getText().toString());
                    startActivity(i);
                    finish();
                }
                else   {
                    Toast.makeText(getApplicationContext(),"Kamu Jawab Dulu",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}