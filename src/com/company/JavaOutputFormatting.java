package com.company;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        for(int i=0; i<3; i++) {
            String sl=sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", sl, x);
        }

    }





}
