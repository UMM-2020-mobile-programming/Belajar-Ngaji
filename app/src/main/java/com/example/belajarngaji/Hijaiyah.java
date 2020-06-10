package com.example.belajarngaji;

import java.util.Random;
public class Hijaiyah {
    private int listhuruf[] = {
            R.drawable.t_1,
            R.drawable.t_2,
            R.drawable.t_3,
            R.drawable.t_4,
            R.drawable.t_5,
            R.drawable.t_6,
            R.drawable.t_7,
            R.drawable.t_8,
            R.drawable.t_9,
            R.drawable.t_10,
            R.drawable.t_11,
            R.drawable.t_12,
            R.drawable.t_13,
            R.drawable.t_14,
            R.drawable.t_15,
            R.drawable.t_16,
            R.drawable.t_17,
            R.drawable.t_18,
            R.drawable.t_19,
            R.drawable.t_20,
            R.drawable.t_21,
            R.drawable.t_22,
            R.drawable.t_23,
            R.drawable.t_24,
            R.drawable.t_25,
            R.drawable.t_26,
            R.drawable.t_27,
            R.drawable.t_28
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
