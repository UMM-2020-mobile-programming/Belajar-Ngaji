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

public class HarokatFathah extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat_fathah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TampilGambar = (ImageView) findViewById(R.id.popup_hijaiyah2);
        show = (ImageButton) findViewById(R.id.fathah_1);
        hide = (ImageButton) findViewById(R.id.fathah_2);

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

        ImageButton show1b = (ImageButton) this.findViewById(R.id.fathah_1);
        ImageButton show2b = (ImageButton) this.findViewById(R.id.fathah_2);
        ImageButton show3b = (ImageButton) this.findViewById(R.id.fathah_3);
        ImageButton show4b = (ImageButton) this.findViewById(R.id.fathah_4);
        ImageButton show5b = (ImageButton) this.findViewById(R.id.fathah_5);
        ImageButton show6b = (ImageButton) this.findViewById(R.id.fathah_6);
        ImageButton show7b = (ImageButton) this.findViewById(R.id.fathah_7);
        ImageButton show8b = (ImageButton) this.findViewById(R.id.fathah_8);
        ImageButton show9b = (ImageButton) this.findViewById(R.id.fathah_9);
        ImageButton show10b = (ImageButton) this.findViewById(R.id.fathah_10);
        ImageButton show11b = (ImageButton) this.findViewById(R.id.fathah_11);
        ImageButton show12b = (ImageButton) this.findViewById(R.id.fathah_12);
        ImageButton show13b = (ImageButton) this.findViewById(R.id.fathah_13);
        ImageButton show14b = (ImageButton) this.findViewById(R.id.fathah_14);
        ImageButton show15b = (ImageButton) this.findViewById(R.id.fathah_15);
        ImageButton show16b = (ImageButton) this.findViewById(R.id.fathah_16);
        ImageButton show17b = (ImageButton) this.findViewById(R.id.fathah_17);
        ImageButton show18b = (ImageButton) this.findViewById(R.id.fathah_18);
        ImageButton show19b = (ImageButton) this.findViewById(R.id.fathah_19);
        ImageButton show20b = (ImageButton) this.findViewById(R.id.fathah_20);
        ImageButton show21b = (ImageButton) this.findViewById(R.id.fathah_21);
        ImageButton show22b = (ImageButton) this.findViewById(R.id.fathah_22);
        ImageButton show23b = (ImageButton) this.findViewById(R.id.fathah_23);
        ImageButton show24b = (ImageButton) this.findViewById(R.id.fathah_24);
        ImageButton show25b = (ImageButton) this.findViewById(R.id.fathah_25);
        ImageButton show26b = (ImageButton) this.findViewById(R.id.fathah_26);
        ImageButton show27b = (ImageButton) this.findViewById(R.id.fathah_27);
        ImageButton show28b = (ImageButton) this.findViewById(R.id.fathah_28);

        show1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_1);
                TampilGambar.startAnimation(animScale);
            }
        });
        show2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        show3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_3);
                TampilGambar.startAnimation(animScale);
            }
        });
        show4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_4);
                TampilGambar.startAnimation(animScale);
            }
        });
        show5b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_5);
                TampilGambar.startAnimation(animScale);
            }
        });
        show6b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_6);
                TampilGambar.startAnimation(animScale);
            }
        });
        show7b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_7);
                TampilGambar.startAnimation(animScale);
            }
        });
        show8b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_8);
                TampilGambar.startAnimation(animScale);
            }
        });
        show9b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_9);
                TampilGambar.startAnimation(animScale);
            }
        });
        show10b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_10);
                TampilGambar.startAnimation(animScale);
            }
        });
        show11b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_11);
                TampilGambar.startAnimation(animScale);
            }
        });
        show12b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_12);
                TampilGambar.startAnimation(animScale);
            }
        });
        show13b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_13);
                TampilGambar.startAnimation(animScale);
            }
        });
        show14b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_14);
                TampilGambar.startAnimation(animScale);
            }
        });
        show15b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_15);
                TampilGambar.startAnimation(animScale);
            }
        });
        show16b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_16);
                TampilGambar.startAnimation(animScale);
            }
        });
        show17b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_17);
                TampilGambar.startAnimation(animScale);
            }
        });
        show18b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_18);
                TampilGambar.startAnimation(animScale);
            }
        });
        show19b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_19);
                TampilGambar.startAnimation(animScale);
            }
        });
        show20b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_20);
                TampilGambar.startAnimation(animScale);
            }
        });
        show21b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_21);
                TampilGambar.startAnimation(animScale);
            }
        });
        show22b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_22);
                TampilGambar.startAnimation(animScale);
            }
        });
        show23b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_23);
                TampilGambar.startAnimation(animScale);
            }
        });
        show24b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_24);
                TampilGambar.startAnimation(animScale);
            }
        });
        show25b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_25);
                TampilGambar.startAnimation(animScale);
            }
        });
        show26b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_26);
                TampilGambar.startAnimation(animScale);
            }
        });
        show27b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_27);
                TampilGambar.startAnimation(animScale);
            }
        });
        show28b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.fa_28);
                TampilGambar.startAnimation(animScale);
            }
        });

     /*   //TOAS
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
