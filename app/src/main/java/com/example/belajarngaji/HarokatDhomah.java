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


public class HarokatDhomah extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat_dhomah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TampilGambar = (ImageView) findViewById(R.id.popup_hijaiyah4);
        show = (ImageButton) findViewById(R.id.dhomah_1);
        hide = (ImageButton) findViewById(R.id.dhomah_2);

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

        ImageButton show1a = (ImageButton) this.findViewById(R.id.dhomah_1);
        ImageButton show2a = (ImageButton) this.findViewById(R.id.dhomah_2);
        ImageButton show3a = (ImageButton) this.findViewById(R.id.dhomah_3);
        ImageButton show4a = (ImageButton) this.findViewById(R.id.dhomah_4);
        ImageButton show5a = (ImageButton) this.findViewById(R.id.dhomah_5);
        ImageButton show6a = (ImageButton) this.findViewById(R.id.dhomah_6);
        ImageButton show7a = (ImageButton) this.findViewById(R.id.dhomah_7);
        ImageButton show8a = (ImageButton) this.findViewById(R.id.dhomah_8);
        ImageButton show9a = (ImageButton) this.findViewById(R.id.dhomah_9);
        ImageButton show10a = (ImageButton) this.findViewById(R.id.dhomah_10);
        ImageButton show11a = (ImageButton) this.findViewById(R.id.dhomah_11);
        ImageButton show12a = (ImageButton) this.findViewById(R.id.dhomah_12);
        ImageButton show13a = (ImageButton) this.findViewById(R.id.dhomah_13);
        ImageButton show14a = (ImageButton) this.findViewById(R.id.dhomah_14);
        ImageButton show15a = (ImageButton) this.findViewById(R.id.dhomah_15);
        ImageButton show16a = (ImageButton) this.findViewById(R.id.dhomah_16);
        ImageButton show17a = (ImageButton) this.findViewById(R.id.dhomah_17);
        ImageButton show18a = (ImageButton) this.findViewById(R.id.dhomah_18);
        ImageButton show19a = (ImageButton) this.findViewById(R.id.dhomah_19);
        ImageButton show20a = (ImageButton) this.findViewById(R.id.dhomah_20);
        ImageButton show21a = (ImageButton) this.findViewById(R.id.dhomah_21);
        ImageButton show22a = (ImageButton) this.findViewById(R.id.dhomah_22);
        ImageButton show23a = (ImageButton) this.findViewById(R.id.dhomah_23);
        ImageButton show24a = (ImageButton) this.findViewById(R.id.dhomah_24);
        ImageButton show25a = (ImageButton) this.findViewById(R.id.dhomah_25);
        ImageButton show26a = (ImageButton) this.findViewById(R.id.dhomah_26);
        ImageButton show27a = (ImageButton) this.findViewById(R.id.dhomah_27);
        ImageButton show28a = (ImageButton) this.findViewById(R.id.dhomah_28);


        show1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_1);
                TampilGambar.startAnimation(animScale);
            }
        });
        show2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        show3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_3);
                TampilGambar.startAnimation(animScale);
            }
        });
        show4a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_4);
                TampilGambar.startAnimation(animScale);
            }
        });
        show5a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_5);
                TampilGambar.startAnimation(animScale);
            }
        });
        show6a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_6);
                TampilGambar.startAnimation(animScale);
            }
        });
        show7a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_7);
                TampilGambar.startAnimation(animScale);
            }
        });
        show8a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_8);
                TampilGambar.startAnimation(animScale);
            }
        });
        show9a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_9);
                TampilGambar.startAnimation(animScale);
            }
        });
        show10a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_10);
                TampilGambar.startAnimation(animScale);
            }
        });
        show11a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_11);
                TampilGambar.startAnimation(animScale);
            }
        });
        show12a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_12);
                TampilGambar.startAnimation(animScale);
            }
        });
        show13a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_13);
                TampilGambar.startAnimation(animScale);
            }
        });
        show14a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_14);
                TampilGambar.startAnimation(animScale);
            }
        });
        show15a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_15);
                TampilGambar.startAnimation(animScale);
            }
        });
        show16a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_16);
                TampilGambar.startAnimation(animScale);
            }
        });
        show17a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_17);
                TampilGambar.startAnimation(animScale);
            }
        });
        show18a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_18);
                TampilGambar.startAnimation(animScale);
            }
        });
        show19a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_19);
                TampilGambar.startAnimation(animScale);
            }
        });
        show20a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_20);
                TampilGambar.startAnimation(animScale);
            }
        });
        show21a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_21);
                TampilGambar.startAnimation(animScale);
            }
        });
        show22a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_22);
                TampilGambar.startAnimation(animScale);
            }
        });
        show23a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_23);
                TampilGambar.startAnimation(animScale);
            }
        });
        show24a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_24);
                TampilGambar.startAnimation(animScale);
            }
        });
        show25a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_25);
                TampilGambar.startAnimation(animScale);
            }
        });
        show26a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_26);
                TampilGambar.startAnimation(animScale);
            }
        });
        show27a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_27);
                TampilGambar.startAnimation(animScale);
            }
        });
        show28a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dhu_28);
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
