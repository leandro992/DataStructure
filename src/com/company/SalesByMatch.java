package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class SalesByMatch {

    public static void main(String[] args) {

        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int result = 0;
        System.out.println(result = sockMerchant(10, ar));

    }


    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int current = ar[0];
        int count = 1;
        int pair = 0;
        for (int i = 1; i < n; i++){
            if (ar[i] == current){
                count++;
                if (count == 2){
                    pair++;
                    count -= 2;

                }
            }else{
                current = ar[i];
                count = 1;
            }
        }
        return pair;
    }


}
