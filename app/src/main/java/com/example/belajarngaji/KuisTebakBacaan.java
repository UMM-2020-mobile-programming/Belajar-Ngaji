package com.example.belajarngaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class KuisTebakBacaan extends AppCompatActivity {
ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_tebak_bacaan);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.bacaan1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KuisTebakBacaan.this, KuisTebakBacaanHijaiyah.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.bacaan2);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KuisTebakBacaan.this, KuisTebakBacaanHarokat.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.bacaan3);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KuisTebakBacaan.this, KuisTebakBacaanTanwin.class);
                startActivity(intent);
            }
        });

    }
}
