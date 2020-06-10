package com.example.belajarngaji;

import java.util.Random;

public class BacaanHarokat {
    private int listhuruf[] = {
            R.drawable.fa_1,
            R.drawable.fa_2,
            R.drawable.fa_3,
            R.drawable.fa_4,
            R.drawable.fa_5,
            R.drawable.fa_6,
            R.drawable.fa_7,
            R.drawable.fa_8,
            R.drawable.fa_9,
            R.drawable.fa_10,
            R.drawable.kas_11,
            R.drawable.kas_12,
            R.drawable.kas_13,
            R.drawable.kas_14,
            R.drawable.kas_15,
            R.drawable.kas_16,
            R.drawable.kas_17,
            R.drawable.kas_18,
            R.drawable.kas_19,
            R.drawable.kas_20,
            R.drawable.dhu_21,
            R.drawable.dhu_22,
            R.drawable.dhu_23,
            R.drawable.dhu_24,
            R.drawable.dhu_25,
            R.drawable.dhu_26,
            R.drawable.dhu_27,
            R.drawable.dhu_28
    };
    private int listhuruf2[] = {
            R.drawable.fathah_1,
            R.drawable.fathah_2,
            R.drawable.fathah_3,
            R.drawable.fathah_4,
            R.drawable.fathah_5,
            R.drawable.fathah_6,
            R.drawable.fathah_7,
            R.drawable.fathah_8,
            R.drawable.fathah_9,
            R.drawable.fathah_10,
            R.drawable.kasroh_11,
            R.drawable.kasroh_12,
            R.drawable.kasroh_13,
            R.drawable.kasroh_14,
            R.drawable.kasroh_15,
            R.drawable.kasroh_16,
            R.drawable.kasroh_17,
            R.drawable.kasroh_18,
            R.drawable.kasroh_19,
            R.drawable.kasroh_20,
            R.drawable.dhommah_21,
            R.drawable.dhommah_22,
            R.drawable.dhommah_23,
            R.drawable.dhommah_24,
            R.drawable.dhommah_25,
            R.drawable.dhommah_26,
            R.drawable.dhommah_27,
            R.drawable.dhommah_28
    };

    public int[] getlist(){
        return listhuruf;
    }
    public int[] getlist2(){
        return listhuruf2;
    }
    public int getrandomhuruf(){
        int rnd = new Random().nextInt(listhuruf.length);
        return rnd;
    }
    public int getimagesoal(int i){
        return listhuruf[i];
    }
    public int getimagejwbn(int i){
        return listhuruf2[i];
    }
    public int getjumlah(){
        return listhuruf.length;
    }
    public int getjumlah2(){
        return listhuruf2.length;
    }
}
