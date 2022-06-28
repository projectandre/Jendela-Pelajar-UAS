package com.example.jendelapelajar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView pkn,mtk,ipa,ips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Jendela Pelajar");

        pkn = findViewById(R.id.pkn);
        mtk = findViewById(R.id.mtk);
        ipa = findViewById(R.id.ipa);
        ips = findViewById(R.id.ips);

        pkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MateriPKN.class);
                startActivity(intent);
            }
        });

        mtk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MateriMTK.class);
                startActivity(intent);
            }
        });

        ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MateriIPA.class);
                startActivity(intent);
            }
        });

        ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MateriIPS.class);
                startActivity(intent);
            }
        });

    }
}