package com.company;

import java.util.List;

public class FizzBuzz {


    public static void main(String[] args) {

        fizzBuzz(15);

    }


    public static void fizzBuzz(int n) {
        // Write your code here

        for (int x = 1; x <= n; x++){
            if ((x % 3 == 0) && (x % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if(x % 3 == 0){
                System.out.println("Fizz");
            } else if(x % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
        }

    }

   static final int total = 2 * 100_000_000;

    public static int finalInstances(int instances, List<Integer> averageUtil) {
        // Write your code here

        for( int i = 0;  i < averageUtil.size(); i++){
            int cont = averageUtil.get(i);
            if(cont < 25 && instances > 1){
                instances = instances / 2 + (instances & 1);
                i += 10;

            } else if(cont > 65){
                int nova = instances * 2;

                if(nova <= total){
                    instances = nova;
                    i += 10;
                }
            }
        }
        return instances;
    }


    public static int findMinComplexity(List<Integer> complexity, int days) {

        int[][] lista = new int[days + 1][complexity.size() + 1];

        int soma = 0;
        for (int i = 1; i < complexity.size() + 1; i++) {
            lista[0][i] = Integer.MAX_VALUE;
            for (int j = 1; j < days + 1; j++) {
                for (i = j; j < complexity.size() + 1; j++) {
                    if (i == j) {
                        soma = soma + complexity.get(j - 1);
                        lista[i][j] = soma;

                    } else {
                        lista[i][j] = Integer.MAX_VALUE;
                        int ultima = 0;
                        for (int h = 1; h < j - 1 + 2; h++) {
                            ultima = Math.max(ultima, complexity.get(j - h));
                            if (lista[i - 1][j - h] < Integer.MAX_VALUE) {
                                lista[i][j] = Math.min(lista[i][j], lista[i - 1][j - h] + ultima);
                            }
                        }
                    }
                }
            }
        }
        return lista[days][complexity.size()];
    }

}

