package com.example.belajarngaji;

import java.util.Random;

public class BacaanTanwin {
    private int listhuruf[] = {
            R.drawable.fatain_1,
            R.drawable.fatain_2,
            R.drawable.fatain_3,
            R.drawable.fatain_4,
            R.drawable.fatain_5,
            R.drawable.fatain_6,
            R.drawable.fatain_7,
            R.drawable.fatain_8,
            R.drawable.fatain_9,
            R.drawable.fatain_10,
            R.drawable.kastain_11,
            R.drawable.kastain_12,
            R.drawable.kastain_13,
            R.drawable.kastain_14,
            R.drawable.kastain_15,
            R.drawable.kastain_16,
            R.drawable.kastain_17,
            R.drawable.kastain_18,
            R.drawable.kastain_19,
            R.drawable.kastain_20,
            R.drawable.dhutain_21,
            R.drawable.dhutain_22,
            R.drawable.dhutain_23,
            R.drawable.dhutain_24,
            R.drawable.dhutain_25,
            R.drawable.dhutain_26,
            R.drawable.dhutain_27,
            R.drawable.dhutain_28
    };
    private int listhuruf2[] = {
            R.drawable.ftain_1,
            R.drawable.ftain_2,
            R.drawable.ftain_3,
            R.drawable.ftain_4,
            R.drawable.ftain_5,
            R.drawable.ftain_6,
            R.drawable.ftain_7,
            R.drawable.ftain_8,
            R.drawable.ftain_9,
            R.drawable.ftain_10,
            R.drawable.ktain_11,
            R.drawable.ktain_12,
            R.drawable.ktain_13,
            R.drawable.ktain_14,
            R.drawable.ktain_15,
            R.drawable.ktain_16,
            R.drawable.ktain_17,
            R.drawable.ktain_18,
            R.drawable.ktain_19,
            R.drawable.ktain_20,
            R.drawable.dtain_21,
            R.drawable.dtain_22,
            R.drawable.dtain_23,
            R.drawable.dtain_24,
            R.drawable.dtain_25,
            R.drawable.dtain_26,
            R.drawable.dtain_27,
            R.drawable.dtain_28
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
