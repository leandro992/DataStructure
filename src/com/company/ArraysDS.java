package com.company;

import java.util.Arrays;

public class ArraysDS {

    public static void main(String[] args) {
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};

        System.out.println(reverseArray(arrayNum));

    }

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int aux = 0;
        int n = a.length;
        for (int i = 0; i < n/2; ++i) {
            aux = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = aux;
        }
        return a;
    }


}
