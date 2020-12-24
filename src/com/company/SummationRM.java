package com.company;

import java.util.Scanner;

public class SummationRM {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int resto = 0, soma = 0;
        System.out.println("Digite o RM: ");

        int rm = tec.nextInt();
        while (rm != 0){
            resto = rm % 10;
            soma += resto;
            rm /= 10;
        }
        System.out.println("Soma do RM " + soma );
    }


}
