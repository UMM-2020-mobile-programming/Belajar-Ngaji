package com.example.belajarngaji;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class BelajarTanwin extends Activity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_tanwin);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        pindah =(ImageButton) findViewById(R.id.harokat_dhomahtain);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntenPindah = new Intent(BelajarTanwin.this,TanwinDhomah.class);
                startActivity(IntenPindah);
            }
        });

        pindah =(ImageButton) findViewById(R.id.harokat_kasrohtain);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntenPindah = new Intent(BelajarTanwin.this,TanwinKasroh.class);
                startActivity(IntenPindah);
            }
        });

        pindah =(ImageButton) findViewById(R.id.harokat_fathahtain);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntenPindah = new Intent(BelajarTanwin.this,TanwinFathah.class);
                startActivity(IntenPindah);
            }
        });
    }
}