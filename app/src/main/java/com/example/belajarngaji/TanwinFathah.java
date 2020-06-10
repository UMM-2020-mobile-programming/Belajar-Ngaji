package com.example.belajarngaji;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.Toast;
import android.widget.TextView;
import android.view.Gravity;
import android.content.Intent;

public class TanwinFathah extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin_fathah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TampilGambar = (ImageView) findViewById(R.id.popup_hijaiyah5);
        show = (ImageButton) findViewById(R.id.ftain_1);
        hide = (ImageButton) findViewById(R.id.ftain_2);

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

        ImageButton show1e = (ImageButton) this.findViewById(R.id.ftain_1);
        ImageButton show2e = (ImageButton) this.findViewById(R.id.ftain_2);
        ImageButton show3e = (ImageButton) this.findViewById(R.id.ftain_3);
        ImageButton show4e = (ImageButton) this.findViewById(R.id.ftain_4);
        ImageButton show5e = (ImageButton) this.findViewById(R.id.ftain_5);
        ImageButton show6e = (ImageButton) this.findViewById(R.id.ftain_6);
        ImageButton show7e = (ImageButton) this.findViewById(R.id.ftain_7);
        ImageButton show8e = (ImageButton) this.findViewById(R.id.ftain_8);
        ImageButton show9e = (ImageButton) this.findViewById(R.id.ftain_9);
        ImageButton show10e = (ImageButton) this.findViewById(R.id.ftain_10);
        ImageButton show11e = (ImageButton) this.findViewById(R.id.ftain_11);
        ImageButton show12e = (ImageButton) this.findViewById(R.id.ftain_12);
        ImageButton show13e = (ImageButton) this.findViewById(R.id.ftain_13);
        ImageButton show14e = (ImageButton) this.findViewById(R.id.ftain_14);
        ImageButton show15e = (ImageButton) this.findViewById(R.id.ftain_15);
        ImageButton show16e = (ImageButton) this.findViewById(R.id.ftain_16);
        ImageButton show17e = (ImageButton) this.findViewById(R.id.ftain_17);
        ImageButton show18e = (ImageButton) this.findViewById(R.id.ftain_18);
        ImageButton show19e = (ImageButton) this.findViewById(R.id.ftain_19);
        ImageButton show20e = (ImageButton) this.findViewById(R.id.ftain_20);
        ImageButton show21e = (ImageButton) this.findViewById(R.id.ftain_21);
        ImageButton show22e = (ImageButton) this.findViewById(R.id.ftain_22);
        ImageButton show23e = (ImageButton) this.findViewById(R.id.ftain_23);
        ImageButton show24e = (ImageButton) this.findViewById(R.id.ftain_24);
        ImageButton show25e = (ImageButton) this.findViewById(R.id.ftain_25);
        ImageButton show26e = (ImageButton) this.findViewById(R.id.ftain_26);
        ImageButton show27e = (ImageButton) this.findViewById(R.id.ftain_27);
        ImageButton show28e = (ImageButton) this.findViewById(R.id.ftain_28);
        
        show1e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_1);
                TampilGambar.startAnimation(animScale);
            }
        });
        show2e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        show3e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_3);
                TampilGambar.startAnimation(animScale);
            }
        });
        show4e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_4);
                TampilGambar.startAnimation(animScale);
            }
        });
        show5e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_5);
                TampilGambar.startAnimation(animScale);
            }
        });
        show6e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_6);
                TampilGambar.startAnimation(animScale);
            }
        });
        show7e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_7);
                TampilGambar.startAnimation(animScale);
            }
        });
        show8e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_8);
                TampilGambar.startAnimation(animScale);
            }
        });
        show9e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_9);
                TampilGambar.startAnimation(animScale);
            }
        });
        show10e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_10);
                TampilGambar.startAnimation(animScale);
            }
        });
        show11e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_11);
                TampilGambar.startAnimation(animScale);
            }
        });
        show12e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_12);
                TampilGambar.startAnimation(animScale);
            }
        });
        show13e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_13);
                TampilGambar.startAnimation(animScale);
            }
        });
        show14e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_14);
                TampilGambar.startAnimation(animScale);
            }
        });
        show15e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_15);
                TampilGambar.startAnimation(animScale);
            }
        });
        show16e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_16);
                TampilGambar.startAnimation(animScale);
            }
        });
        show17e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_17);
                TampilGambar.startAnimation(animScale);
            }
        });
        show18e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_18);
                TampilGambar.startAnimation(animScale);
            }
        });
        show19e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_19);
                TampilGambar.startAnimation(animScale);
            }
        });
        show20e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_20);
                TampilGambar.startAnimation(animScale);
            }
        });
        show21e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_21);
                TampilGambar.startAnimation(animScale);
            }
        });
        show22e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_22);
                TampilGambar.startAnimation(animScale);
            }
        });
        show23e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_23);
                TampilGambar.startAnimation(animScale);
            }
        });
        show24e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_24);
                TampilGambar.startAnimation(animScale);
            }
        });
        show25e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_25);
                TampilGambar.startAnimation(animScale);
            }
        });
        show26e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_26);
                TampilGambar.startAnimation(animScale);
            }
        });
        show27e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_27);
                TampilGambar.startAnimation(animScale);
            }
        });
        show28e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fatain_28);
                TampilGambar.startAnimation(animScale);
            }
        });

    }
}