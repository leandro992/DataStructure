package com.company;

import java.util.Scanner;

public class SomaNatural {


    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um numero");
        int number = tec.nextInt();
        int soma = 0;
        for (int i = 1; i <= number; i++){
            soma += i;
        }
        System.out.println("Soma do numero " + number + " è " + soma);
    }


}
