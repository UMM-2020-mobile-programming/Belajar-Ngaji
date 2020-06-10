package com.example.belajarngaji;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class TanwinDhomah extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin_dhomah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TampilGambar = (ImageView) findViewById(R.id.popup_hijaiyah6);
        show = (ImageButton) findViewById(R.id.dtain_1);
        hide = (ImageButton) findViewById(R.id.dtain_2);

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

        ImageButton show1d = (ImageButton) this.findViewById(R.id.dtain_1);
        ImageButton show2d = (ImageButton) this.findViewById(R.id.dtain_2);
        ImageButton show3d = (ImageButton) this.findViewById(R.id.dtain_3);
        ImageButton show4d = (ImageButton) this.findViewById(R.id.dtain_4);
        ImageButton show5d = (ImageButton) this.findViewById(R.id.dtain_5);
        ImageButton show6d = (ImageButton) this.findViewById(R.id.dtain_6);
        ImageButton show7d = (ImageButton) this.findViewById(R.id.dtain_7);
        ImageButton show8d = (ImageButton) this.findViewById(R.id.dtain_8);
        ImageButton show9d = (ImageButton) this.findViewById(R.id.dtain_9);
        ImageButton show10d = (ImageButton) this.findViewById(R.id.dtain_10);
        ImageButton show11d = (ImageButton) this.findViewById(R.id.dtain_11);
        ImageButton show12d = (ImageButton) this.findViewById(R.id.dtain_12);
        ImageButton show13d = (ImageButton) this.findViewById(R.id.dtain_13);
        ImageButton show14d = (ImageButton) this.findViewById(R.id.dtain_14);
        ImageButton show15d = (ImageButton) this.findViewById(R.id.dtain_15);
        ImageButton show16d = (ImageButton) this.findViewById(R.id.dtain_16);
        ImageButton show17d = (ImageButton) this.findViewById(R.id.dtain_17);
        ImageButton show18d = (ImageButton) this.findViewById(R.id.dtain_18);
        ImageButton show19d = (ImageButton) this.findViewById(R.id.dtain_19);
        ImageButton show20d = (ImageButton) this.findViewById(R.id.dtain_20);
        ImageButton show21d = (ImageButton) this.findViewById(R.id.dtain_21);
        ImageButton show22d = (ImageButton) this.findViewById(R.id.dtain_22);
        ImageButton show23d = (ImageButton) this.findViewById(R.id.dtain_23);
        ImageButton show24d = (ImageButton) this.findViewById(R.id.dtain_24);
        ImageButton show25d = (ImageButton) this.findViewById(R.id.dtain_25);
        ImageButton show26d = (ImageButton) this.findViewById(R.id.dtain_26);
        ImageButton show27d = (ImageButton) this.findViewById(R.id.dtain_27);
        ImageButton show28d = (ImageButton) this.findViewById(R.id.dtain_28);

        show1d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_1);
                TampilGambar.startAnimation(animScale);
            }
        });
        show2d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        show3d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_3);
                TampilGambar.startAnimation(animScale);
            }
        });
        show4d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_4);
                TampilGambar.startAnimation(animScale);
            }
        });
        show5d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_5);
                TampilGambar.startAnimation(animScale);
            }
        });
        show6d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_6);
                TampilGambar.startAnimation(animScale);
            }
        });
        show7d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_7);
                TampilGambar.startAnimation(animScale);
            }
        });
        show8d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_8);
                TampilGambar.startAnimation(animScale);
            }
        });
        show9d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_9);
                TampilGambar.startAnimation(animScale);
            }
        });
        show10d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_10);
                TampilGambar.startAnimation(animScale);
            }
        });
        show11d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_11);
                TampilGambar.startAnimation(animScale);
            }
        });
        show12d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_12);
                TampilGambar.startAnimation(animScale);
            }
        });
        show13d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_13);
                TampilGambar.startAnimation(animScale);
            }
        });
        show14d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_14);
                TampilGambar.startAnimation(animScale);
            }
        });
        show15d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_15);
                TampilGambar.startAnimation(animScale);
            }
        });
        show16d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_16);
                TampilGambar.startAnimation(animScale);
            }
        });
        show17d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_17);
                TampilGambar.startAnimation(animScale);
            }
        });
        show18d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_18);
                TampilGambar.startAnimation(animScale);
            }
        });
        show19d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_19);
                TampilGambar.startAnimation(animScale);
            }
        });
        show20d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_20);
                TampilGambar.startAnimation(animScale);
            }
        });
        show21d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_21);
                TampilGambar.startAnimation(animScale);
            }
        });
        show22d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_22);
                TampilGambar.startAnimation(animScale);
            }
        });
        show23d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_23);
                TampilGambar.startAnimation(animScale);
            }
        });
        show24d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_24);
                TampilGambar.startAnimation(animScale);
            }
        });
        show25d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_25);
                TampilGambar.startAnimation(animScale);
            }
        });
        show26d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_26);
                TampilGambar.startAnimation(animScale);
            }
        });
        show27d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_27);
                TampilGambar.startAnimation(animScale);
            }
        });
        show28d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhutain_28);
                TampilGambar.startAnimation(animScale);
            }
        });

    }
}
