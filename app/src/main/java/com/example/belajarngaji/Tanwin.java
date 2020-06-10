package com.example.belajarngaji;
import java.util.Random;
public class Tanwin {
    private int listhuruf[] = {
            R.drawable.tfatain_1,
            R.drawable.tfatain_2,
            R.drawable.tfatain_3,
            R.drawable.tfatain_4,
            R.drawable.tfatain_5,
            R.drawable.tfatain_6,
            R.drawable.tfatain_7,
            R.drawable.tfatain_8,
            R.drawable.tfatain_9,
            R.drawable.tfatain_10,
            R.drawable.tkastain_11,
            R.drawable.tkastain_12,
            R.drawable.tkastain_13,
            R.drawable.tkastain_14,
            R.drawable.tkastain_15,
            R.drawable.tkastain_16,
            R.drawable.tkastain_17,
            R.drawable.tkastain_18,
            R.drawable.tkastain_19,
            R.drawable.tkastain_20,
            R.drawable.tdhomtain_21,
            R.drawable.tdhomtain_22,
            R.drawable.tdhomtain_23,
            R.drawable.tdhomtain_24,
            R.drawable.tdhomtain_25,
            R.drawable.tdhomtain_26,
            R.drawable.tdhomtain_27,
            R.drawable.tdhomtain_28
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
