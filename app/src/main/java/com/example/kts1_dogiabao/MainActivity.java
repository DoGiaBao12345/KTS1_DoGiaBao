package com.example.kts1_dogiabao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1,img2,img3,img4,img5;
    Intent i ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.canhan);
        img2 = findViewById(R.id.khachhang);
        img3 = findViewById(R.id.chitieubanhan);
        img4 = findViewById(R.id.danhsachtuyen);
        img5 = findViewById(R.id.tracuusanpham);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }
}