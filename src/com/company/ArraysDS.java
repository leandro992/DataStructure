package com.company;

import java.util.Arrays;
import java.util.Collections;

public class ArraysDS {

    public static void main(String[] args) {
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};

        System.out.println(reverseArray(arrayNum));

    }

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {

        int[] invert = new int[a.length];
        int i = a.length;
       while ( a.length >= i){
            invert[i] = a[a.length-1];
            a[i] = i--;
       }
        return invert;
    }


}
