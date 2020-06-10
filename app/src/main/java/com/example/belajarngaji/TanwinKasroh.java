package com.example.belajarngaji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class TanwinKasroh extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin_kasroh);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TampilGambar = (ImageView) findViewById(R.id.popup_hijaiyah7);
        show = (ImageButton) findViewById(R.id.ktain_1);

        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });
        show.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });

        ImageButton show1f = (ImageButton) this.findViewById(R.id.ktain_1);
        ImageButton show2f = (ImageButton) this.findViewById(R.id.ktain_2);
        ImageButton show3f = (ImageButton) this.findViewById(R.id.ktain_3);
        ImageButton show4f = (ImageButton) this.findViewById(R.id.ktain_4);
        ImageButton show5f = (ImageButton) this.findViewById(R.id.ktain_5);
        ImageButton show6f = (ImageButton) this.findViewById(R.id.ktain_6);
        ImageButton show7f = (ImageButton) this.findViewById(R.id.ktain_7);
        ImageButton show8f = (ImageButton) this.findViewById(R.id.ktain_8);
        ImageButton show9f = (ImageButton) this.findViewById(R.id.ktain_9);
        ImageButton show10f = (ImageButton) this.findViewById(R.id.ktain_10);
        ImageButton show11f = (ImageButton) this.findViewById(R.id.ktain_11);
        ImageButton show12f = (ImageButton) this.findViewById(R.id.ktain_12);
        ImageButton show13f = (ImageButton) this.findViewById(R.id.ktain_13);
        ImageButton show14f = (ImageButton) this.findViewById(R.id.ktain_14);
        ImageButton show15f = (ImageButton) this.findViewById(R.id.ktain_15);
        ImageButton show16f = (ImageButton) this.findViewById(R.id.ktain_16);
        ImageButton show17f = (ImageButton) this.findViewById(R.id.ktain_17);
        ImageButton show18f = (ImageButton) this.findViewById(R.id.ktain_18);
        ImageButton show19f = (ImageButton) this.findViewById(R.id.ktain_19);
        ImageButton show20f = (ImageButton) this.findViewById(R.id.ktain_20);
        ImageButton show21f = (ImageButton) this.findViewById(R.id.ktain_21);
        ImageButton show22f = (ImageButton) this.findViewById(R.id.ktain_22);
        ImageButton show23f = (ImageButton) this.findViewById(R.id.ktain_23);
        ImageButton show24f = (ImageButton) this.findViewById(R.id.ktain_24);
        ImageButton show25f = (ImageButton) this.findViewById(R.id.ktain_25);
        ImageButton show26f = (ImageButton) this.findViewById(R.id.ktain_26);
        ImageButton show27f = (ImageButton) this.findViewById(R.id.ktain_27);
        ImageButton show28f = (ImageButton) this.findViewById(R.id.ktain_28);

        show1f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_1);
                TampilGambar.startAnimation(animScale);
            }
        });
        show2f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        show3f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_3);
                TampilGambar.startAnimation(animScale);
            }
        });
        show4f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_4);
                TampilGambar.startAnimation(animScale);
            }
        });
        show5f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_5);
                TampilGambar.startAnimation(animScale);
            }
        });
        show6f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_6);
                TampilGambar.startAnimation(animScale);
            }
        });
        show7f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_7);
                TampilGambar.startAnimation(animScale);
            }
        });
        show8f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_8);
                TampilGambar.startAnimation(animScale);
            }
        });
        show9f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_9);
                TampilGambar.startAnimation(animScale);
            }
        });
        show10f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_10);
                TampilGambar.startAnimation(animScale);
            }
        });
        show11f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_11);
                TampilGambar.startAnimation(animScale);
            }
        });
        show12f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_12);
                TampilGambar.startAnimation(animScale);
            }
        });
        show13f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_13);
                TampilGambar.startAnimation(animScale);
            }
        });
        show14f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_14);
                TampilGambar.startAnimation(animScale);
            }
        });
        show15f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_15);
                TampilGambar.startAnimation(animScale);
            }
        });
        show16f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_16);
                TampilGambar.startAnimation(animScale);
            }
        });
        show17f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_17);
                TampilGambar.startAnimation(animScale);
            }
        });
        show18f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_18);
                TampilGambar.startAnimation(animScale);
            }
        });
        show19f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_19);
                TampilGambar.startAnimation(animScale);
            }
        });
        show20f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_20);
                TampilGambar.startAnimation(animScale);
            }
        });
        show21f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_21);
                TampilGambar.startAnimation(animScale);
            }
        });
        show22f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_22);
                TampilGambar.startAnimation(animScale);
            }
        });
        show23f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_23);
                TampilGambar.startAnimation(animScale);
            }
        });
        show24f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_24);
                TampilGambar.startAnimation(animScale);
            }
        });
        show25f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_25);
                TampilGambar.startAnimation(animScale);
            }
        });
        show26f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_26);
                TampilGambar.startAnimation(animScale);
            }
        });
        show27f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_27);
                TampilGambar.startAnimation(animScale);
            }
        });
        show28f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kastain_28);
                TampilGambar.startAnimation(animScale);
            }
        });
    }
}