package com.example.belajarngaji;

import java.util.Random;

public class Bacaan {
    private int listhuruf[] = {
            R.drawable.bb_1,
            R.drawable.bb_2,
            R.drawable.bb_3,
            R.drawable.bb_4,
            R.drawable.bb_5,
            R.drawable.bb_6,
            R.drawable.bb_7,
            R.drawable.bb_8,
            R.drawable.bb_9,
            R.drawable.bb_10,
            R.drawable.bb_11,
            R.drawable.bb_12,
            R.drawable.bb_13,
            R.drawable.bb_14,
            R.drawable.bb_15,
            R.drawable.bb_16,
            R.drawable.bb_17,
            R.drawable.bb_18,
            R.drawable.bb_19,
            R.drawable.bb_20,
            R.drawable.bb_21,
            R.drawable.bb_22,
            R.drawable.bb_23,
            R.drawable.bb_24,
            R.drawable.bb_25,
            R.drawable.bb_26,
            R.drawable.bb_27,
            R.drawable.bb_28
    };
    private int listhuruf2[] = {
            R.drawable.aa_1,
            R.drawable.aa_2,
            R.drawable.aa_3,
            R.drawable.aa_4,
            R.drawable.aa_5,
            R.drawable.aa_6,
            R.drawable.aa_7,
            R.drawable.aa_8,
            R.drawable.aa_9,
            R.drawable.aa_10,
            R.drawable.aa_11,
            R.drawable.aa_12,
            R.drawable.aa_13,
            R.drawable.aa_14,
            R.drawable.aa_15,
            R.drawable.aa_16,
            R.drawable.aa_17,
            R.drawable.aa_18,
            R.drawable.aa_19,
            R.drawable.aa_20,
            R.drawable.aa_21,
            R.drawable.aa_22,
            R.drawable.aa_23,
            R.drawable.aa_24,
            R.drawable.aa_25,
            R.drawable.aa_26,
            R.drawable.aa_27,
            R.drawable.aa_28
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
