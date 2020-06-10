package com.example.belajarngaji;

import android.app.Activity;
import android.content.Intent;
import android.media.ImageWriter;
import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BelajarHijaiyah extends Activity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_hijaiyah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    TampilGambar = (ImageView) findViewById(R.id.popup_hijaiyah);
    show = (ImageButton) findViewById(R.id.aa_1);
    hide = (ImageButton) findViewById(R.id.aa_2);

    final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
    show.setOnClickListener(new View.OnClickListener(){
        @Override
                public void onClick(View view){
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });

        show.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });

        ImageButton show1 = (ImageButton) this.findViewById(R.id.aa_1);
        ImageButton show2 = (ImageButton) this.findViewById(R.id.aa_2);
        ImageButton show3 = (ImageButton) this.findViewById(R.id.aa_3);
        ImageButton show4 = (ImageButton) this.findViewById(R.id.aa_4);
        ImageButton show5 = (ImageButton) this.findViewById(R.id.aa_5);
        ImageButton show6 = (ImageButton) this.findViewById(R.id.aa_6);
        ImageButton show7 = (ImageButton) this.findViewById(R.id.aa_7);
        ImageButton show8 = (ImageButton) this.findViewById(R.id.aa_8);
        ImageButton show9 = (ImageButton) this.findViewById(R.id.aa_9);
        ImageButton show10 = (ImageButton) this.findViewById(R.id.aa_10);
        ImageButton show11 = (ImageButton) this.findViewById(R.id.aa_11);
        ImageButton show12 = (ImageButton) this.findViewById(R.id.aa_12);
        ImageButton show13 = (ImageButton) this.findViewById(R.id.aa_13);
        ImageButton show14 = (ImageButton) this.findViewById(R.id.aa_14);
        ImageButton show15 = (ImageButton) this.findViewById(R.id.aa_15);
        ImageButton show16 = (ImageButton) this.findViewById(R.id.aa_16);
        ImageButton show17 = (ImageButton) this.findViewById(R.id.aa_17);
        ImageButton show18 = (ImageButton) this.findViewById(R.id.aa_18);
        ImageButton show19 = (ImageButton) this.findViewById(R.id.aa_19);
        ImageButton show20 = (ImageButton) this.findViewById(R.id.aa_20);
        ImageButton show21 = (ImageButton) this.findViewById(R.id.aa_21);
        ImageButton show22 = (ImageButton) this.findViewById(R.id.aa_22);
        ImageButton show23 = (ImageButton) this.findViewById(R.id.aa_23);
        ImageButton show24 = (ImageButton) this.findViewById(R.id.aa_24);
        ImageButton show25 = (ImageButton) this.findViewById(R.id.aa_25);
        ImageButton show26 = (ImageButton) this.findViewById(R.id.aa_26);
        ImageButton show27 = (ImageButton) this.findViewById(R.id.aa_27);
        ImageButton show28 = (ImageButton) this.findViewById(R.id.aa_28);

        show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_1);
                TampilGambar.startAnimation(animScale);
            }
        });
        show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        show3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_3);
                TampilGambar.startAnimation(animScale);
            }
        });
        show4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_4);
                TampilGambar.startAnimation(animScale);
            }
        });
        show5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_5);
                TampilGambar.startAnimation(animScale);
            }
        });
        show6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_6);
                TampilGambar.startAnimation(animScale);
            }
        });
        show7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_7);
                TampilGambar.startAnimation(animScale);
            }
        });
        show8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_8);
                TampilGambar.startAnimation(animScale);
            }
        });
        show9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_9);
                TampilGambar.startAnimation(animScale);
            }
        });
        show10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_10);
                TampilGambar.startAnimation(animScale);
            }
        });
        show11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_11);
                TampilGambar.startAnimation(animScale);
            }
        });
        show12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_12);
                TampilGambar.startAnimation(animScale);
            }
        });
        show13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_13);
                TampilGambar.startAnimation(animScale);
            }
        });
        show14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_14);
                TampilGambar.startAnimation(animScale);
            }
        });
        show15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_15);
                TampilGambar.startAnimation(animScale);
            }
        });
        show16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_16);
                TampilGambar.startAnimation(animScale);
            }
        });
        show17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_17);
                TampilGambar.startAnimation(animScale);
            }
        });
        show18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_18);
                TampilGambar.startAnimation(animScale);
            }
        });
        show19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_19);
                TampilGambar.startAnimation(animScale);
            }
        });
        show20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_20);
                TampilGambar.startAnimation(animScale);
            }
        });
        show21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_21);
                TampilGambar.startAnimation(animScale);
            }
        });
        show22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_22);
                TampilGambar.startAnimation(animScale);
            }
        });
        show23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_23);
                TampilGambar.startAnimation(animScale);
            }
        });
        show24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_24);
                TampilGambar.startAnimation(animScale);
            }
        });
        show25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_25);
                TampilGambar.startAnimation(animScale);
            }
        });
        show26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_26);
                TampilGambar.startAnimation(animScale);
            }
        });
        show27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_27);
                TampilGambar.startAnimation(animScale);
            }
        });
        show28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bb_28);
                TampilGambar.startAnimation(animScale);
            }
        });

    }
}
