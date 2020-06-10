package com.example.belajarngaji;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Main extends Activity {
    ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // untuk hapus taskbar

        pindah =(ImageButton) findViewById(R.id.b_belajar);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntenPindah = new Intent(Main.this,Belajar.class);
                startActivity(IntenPindah);
            }
        });

        /*Untuk Memanggil semua fitur yang ada di dalam menu belajar dan menu kuis*/

        pindah =(ImageButton) findViewById(R.id.b_kuis);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntenPindah = new Intent(Main.this,Kuis.class);
                startActivity(IntenPindah);
            }
        });

        /*Untuk Memanggil semua fitur yang ada di dalam menu belajar dan menu kuis*/

        pindah =(ImageButton) findViewById(R.id.about);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntenPindah = new Intent(Main.this,About.class);
                startActivity(IntenPindah);
            }
        });
    }
}