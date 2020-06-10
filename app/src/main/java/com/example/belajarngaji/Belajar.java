package com.example.belajarngaji;
import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Belajar extends Activity {
    ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        pindah =(ImageButton) findViewById(R.id.hijaiyah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntenPindah = new Intent(Belajar.this,BelajarHijaiyah.class);
                startActivity(IntenPindah);
            }
        });

        pindah =(ImageButton) findViewById(R.id.harokat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntenPindah = new Intent(Belajar.this,BelajarHarokat.class);
                startActivity(IntenPindah);
            }
        });

        pindah =(ImageButton) findViewById(R.id.tanwin);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntenPindah = new Intent(Belajar.this,BelajarTanwin.class);
                startActivity(IntenPindah);
            }
        });
    }
}