package com.company;

public class SalesByMatch {

    public static void main(String[] args) {

        int[] ar  = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(9, ar);

    }

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int contPair = 0;
        int posicao = ar[0];
        for(int i = 0; i < n; i++ ){
            if(ar[i] == ar[i+1]){
                contPair++;
            }
        }
        return 0;

    }



}
