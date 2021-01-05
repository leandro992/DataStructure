package com.company;

public class SimpleArraySum {

    public static void main(String[] args) {

        int[] arlist = {1, 2, 3};

        System.out.println(simpleArraySum(arlist));
    }

    static int simpleArraySum(int[] ar) {
        int sum = 0;

        for(int i = 0; i <= ar.length -1; i++){
                sum += ar[i];
        }
        return sum;
    }

}
