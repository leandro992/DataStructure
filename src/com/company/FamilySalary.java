package com.company;

import java.util.Scanner;

public class FamilySalary {


    /**
     * O valor do salário-família será de R$ 37.18, por lho de até
     * 14 anos incompletos ou inválido, para quem ganhar até R$ 725.02. Já para
     * o trabalhador que receber de R$ 725.02 até R$ 1089.72, o valor do saláriofamília por lho
     * de até 14 anos de idade ou inválido de qualquer idade será
     * de R$ 26.20. Escreva um algoritmo que recebe como entrada o salário e
     * o número de lhos de acordo com as restrições acima e calcula o valor do
     * salário família do trabalhador.
     * Validar informações fornecidas ao programa é parte da lógica do algoritmo, para resolver o
     * problema do salário família devemos garantir que o
     * salário e o nº de lhos sejam não negativos.
     */


    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double salary, familySalary = 0;
        int numberChildren;

        do {
            System.out.println("Digite o numero de filhos ");
            numberChildren = tec.nextInt();
        } while (numberChildren < 0);

        do {
            System.out.println("Digite o seu salario ");
            salary = tec.nextDouble();
        } while (salary < 0);

        if (salary <= 725.5) {
            familySalary = numberChildren * 37.18;
        }
        else if ( salary <= 1089.72) {
            familySalary = numberChildren * 26.20;
        }
        System.out.println("O salario da familie é " + familySalary);
    }


}
