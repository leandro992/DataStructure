package com.company;

import java.util.Scanner;

public class MDC {

    /**
     * @param args
     * Dados dois números inteiros a e b, escreva um algoritmo que
     * calcula o máximo divisor comum entre a e b.
     *
     */

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite A : ");
        int a = tec.nextInt();
        System.out.println("Digite B : ");
        int b = tec.nextInt();

        int dividendo = a;
        int divisor = b;
        int resto = dividendo % divisor;
        while (resto != 0){
            dividendo = divisor;
            divisor = resto;
            resto = dividendo % divisor;
            System.out.println("O mdc(" + a + "," + b + ") = " + divisor );
        }

    }
}
