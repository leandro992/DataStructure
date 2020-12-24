package com.company;

import java.util.Scanner;

public class SumEvenNumbers {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int resto = 0, soma = 0;
        System.out.println("Digite um numero ");
        int n = tec.nextInt();

        while (n != 0){
            resto = n % 10;
            n /= 10;
            if (resto % 2 == 0){
                soma += resto;
                n /= 10;
            }
        }
        System.out.println("Soma " + soma);

    }

}
