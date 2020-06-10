package com.example.belajarngaji;
import java.util.Random;
public class Harokat {
    private int listhuruf[] = {
            R.drawable.tfat_1,
            R.drawable.tfat_2,
            R.drawable.tfat_3,
            R.drawable.tfat_4,
            R.drawable.tfat_5,
            R.drawable.tfat_6,
            R.drawable.tfat_7,
            R.drawable.tfat_8,
            R.drawable.tfat_9,
            R.drawable.tfat_10,
            R.drawable.tkas_11,
            R.drawable.tkas_12,
            R.drawable.tkas_13,
            R.drawable.tkas_14,
            R.drawable.tkas_15,
            R.drawable.tkas_16,
            R.drawable.tkas_17,
            R.drawable.tkas_18,
            R.drawable.tkas_19,
            R.drawable.tkas_20,
            R.drawable.tdhom_21,
            R.drawable.tdhom_22,
            R.drawable.tdhom_23,
            R.drawable.tdhom_24,
            R.drawable.tdhom_25,
            R.drawable.tdhom_26,
            R.drawable.tdhom_27,
            R.drawable.tdhom_28
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
