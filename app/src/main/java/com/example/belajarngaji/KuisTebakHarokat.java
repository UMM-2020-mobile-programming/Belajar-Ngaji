package com.example.belajarngaji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class KuisTebakHarokat extends AppCompatActivity {

    ImageButton pilih;
    ImageButton jw1, jw2, jw3;
    ImageView soal;
    int s,s1,j1,j2,j3;
    int skor=0;

    Harokat harokat = new Harokat();
    int n = harokat.getjumlah();

    boolean jawabanbenar = true;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_tebak_harokat);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        soal = (ImageView) findViewById(R.id.soal1);
        jw1 = (ImageButton) findViewById(R.id.jawaban1a);
        jw2 = (ImageButton) findViewById(R.id.jawaban2a);
        jw3 = (ImageButton) findViewById(R.id.jawaban3a);

        newlevel();

        jw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j1 ==s);
            }
        });
        jw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j2 ==s);
            }
        });
        jw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j3 ==s);
            }
        });
    }
    public  void newlevel(){
        s =  harokat.getrandomhuruf();
        s1 = harokat.getrandomhuruf();
        int i = new Random().nextInt(3) +1;

        if(i==1){
            j1=s;
        }
        else{
            j1 = harokat.getrandomhuruf();
        }
        if(i==2){
            j2=s;
        }
        else{
            j2 = harokat.getrandomhuruf();
        }
        if(i==3){
            j3=s;
        }
        else{
            j3 = harokat.getrandomhuruf();
        }

        soal.setBackgroundResource(harokat.getimagesoal(s));
        jw1.setBackgroundResource(harokat.getimagejwbn(j1));
        jw2.setBackgroundResource(harokat.getimagejwbn(j2));
        jw3.setBackgroundResource(harokat.getimagejwbn(j3));

    }
    public void isCorrect(boolean input){
        TextView tampilSkor =(TextView) findViewById(R.id.skor_harokat);
        if(input && i < n){
            skor +=10;
            newlevel();
            i++;
        }else{
            skor -=5;
        }

        tampilSkor.setText("SKOR : "+ skor);

    }
}