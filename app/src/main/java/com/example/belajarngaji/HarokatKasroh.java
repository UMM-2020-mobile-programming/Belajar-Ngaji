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

public class HarokatKasroh extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat_kasroh);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TampilGambar = (ImageView) findViewById(R.id.popup_hijaiyah3);
        show = (ImageButton) findViewById(R.id.kasroh_1);
        hide = (ImageButton) findViewById(R.id.kasroh_2);

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

        ImageButton show1c = (ImageButton) this.findViewById(R.id.kasroh_1);
        ImageButton show2c = (ImageButton) this.findViewById(R.id.kasroh_2);
        ImageButton show3c = (ImageButton) this.findViewById(R.id.kasroh_3);
        ImageButton show4c = (ImageButton) this.findViewById(R.id.kasroh_4);
        ImageButton show5c = (ImageButton) this.findViewById(R.id.kasroh_5);
        ImageButton show6c = (ImageButton) this.findViewById(R.id.kasroh_6);
        ImageButton show7c = (ImageButton) this.findViewById(R.id.kasroh_7);
        ImageButton show8c = (ImageButton) this.findViewById(R.id.kasroh_8);
        ImageButton show9c = (ImageButton) this.findViewById(R.id.kasroh_9);
        ImageButton show10c = (ImageButton) this.findViewById(R.id.kasroh_10);
        ImageButton show11c = (ImageButton) this.findViewById(R.id.kasroh_11);
        ImageButton show12c = (ImageButton) this.findViewById(R.id.kasroh_12);
        ImageButton show13c = (ImageButton) this.findViewById(R.id.kasroh_13);
        ImageButton show14c = (ImageButton) this.findViewById(R.id.kasroh_14);
        ImageButton show15c = (ImageButton) this.findViewById(R.id.kasroh_15);
        ImageButton show16c = (ImageButton) this.findViewById(R.id.kasroh_16);
        ImageButton show17c = (ImageButton) this.findViewById(R.id.kasroh_17);
        ImageButton show18c = (ImageButton) this.findViewById(R.id.kasroh_18);
        ImageButton show19c = (ImageButton) this.findViewById(R.id.kasroh_19);
        ImageButton show20c = (ImageButton) this.findViewById(R.id.kasroh_20);
        ImageButton show21c = (ImageButton) this.findViewById(R.id.kasroh_21);
        ImageButton show22c = (ImageButton) this.findViewById(R.id.kasroh_22);
        ImageButton show23c = (ImageButton) this.findViewById(R.id.kasroh_23);
        ImageButton show24c = (ImageButton) this.findViewById(R.id.kasroh_24);
        ImageButton show25c = (ImageButton) this.findViewById(R.id.kasroh_25);
        ImageButton show26c = (ImageButton) this.findViewById(R.id.kasroh_26);
        ImageButton show27c = (ImageButton) this.findViewById(R.id.kasroh_27);
        ImageButton show28c = (ImageButton) this.findViewById(R.id.kasroh_28);
        
        show1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_1);
                TampilGambar.startAnimation(animScale);
            }
        });
        show2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        show3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_3);
                TampilGambar.startAnimation(animScale);
            }
        });
        show4c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_4);
                TampilGambar.startAnimation(animScale);
            }
        });
        show5c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_5);
                TampilGambar.startAnimation(animScale);
            }
        });
        show6c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_6);
                TampilGambar.startAnimation(animScale);
            }
        });
        show7c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_7);
                TampilGambar.startAnimation(animScale);
            }
        });
        show8c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_8);
                TampilGambar.startAnimation(animScale);
            }
        });
        show9c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_9);
                TampilGambar.startAnimation(animScale);
            }
        });
        show10c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_10);
                TampilGambar.startAnimation(animScale);
            }
        });
        show11c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_11);
                TampilGambar.startAnimation(animScale);
            }
        });
        show12c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_12);
                TampilGambar.startAnimation(animScale);
            }
        });
        show13c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_13);
                TampilGambar.startAnimation(animScale);
            }
        });
        show14c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_14);
                TampilGambar.startAnimation(animScale);
            }
        });
        show15c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_15);
                TampilGambar.startAnimation(animScale);
            }
        });
        show16c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_16);
                TampilGambar.startAnimation(animScale);
            }
        });
        show17c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_17);
                TampilGambar.startAnimation(animScale);
            }
        });
        show18c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_18);
                TampilGambar.startAnimation(animScale);
            }
        });
        show19c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_19);
                TampilGambar.startAnimation(animScale);
            }
        });
        show20c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_20);
                TampilGambar.startAnimation(animScale);
            }
        });
        show21c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_21);
                TampilGambar.startAnimation(animScale);
            }
        });
        show22c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_22);
                TampilGambar.startAnimation(animScale);
            }
        });
        show23c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_23);
                TampilGambar.startAnimation(animScale);
            }
        });
        show24c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_24);
                TampilGambar.startAnimation(animScale);
            }
        });
        show25c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_25);
                TampilGambar.startAnimation(animScale);
            }
        });
        show26c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_26);
                TampilGambar.startAnimation(animScale);
            }
        });
        show27c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_27);
                TampilGambar.startAnimation(animScale);
            }
        });
        show28c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kas_28);
                TampilGambar.startAnimation(animScale);
            }
        });

    /*    //TOAS
        https://developer.android.com/guide/topics/ui/notifiers/toasts.html
        help = (ImageButton)findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast,
                        (ViewGroup) findViewById(R.id.toast_layout_root));

                TextView text = (TextView) layout.findViewById(R.id.text);
                text.setText("Dammah adalah harakat yang berbentuk wau kecil yang diletakan di atas suatu huruf hijaiyah untuk melambangkan fonem 'U' ");

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
        });
        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.back);
        next_button.setOnClickListener(new View.OnClickListener() {
            /*Perpindahan ke Main Belajar apabila di klik Button belajar
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent explicit_intent = new Intent(Belajar_Harokat_Dhomah.this,
                        Belajar_Harokat_1.class); //Tujuan Class
                startActivity(explicit_intent);
            }

        });*/
    }
}
