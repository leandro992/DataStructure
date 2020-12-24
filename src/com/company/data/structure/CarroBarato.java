package com.company.data.structure;

import com.company.data.structure.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class CarroBarato {

    /*public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1000000);
        list.add(46000);
        list.add(16000);
        list.add(46000);
        list.add(17000);

        Integer maisBarato = 0;


        for (int atual = 0; atual <= list.size()-1; atual++){
            if(list.get(atual) < list.get(maisBarato)){
                maisBarato = atual;
            }
        }
        System.out.println(maisBarato);
        System.out.println("O carro mais barato custa "
                + list.get(maisBarato));

    }*/


    public static void main(String[] args) {

        List<Integer> listCarro = new ArrayList<>();

        Student[] produtos = new Student[5];


        listCarro .add(1000000);
        listCarro .add(46000);
        listCarro .add(16000);
        listCarro .add(46000);
        listCarro .add(17000);

        Integer maisBarato = 0;
        Integer maiorSalario = 0;

        for(int atual = 0; atual < listCarro.size()-1; atual++){
            if(listCarro.get(atual) > listCarro.get(maisBarato)){
                maisBarato = atual;
            }
        }
        System.out.println("O Carro mais barato é " + listCarro.get(maisBarato) + "e maior salario é " + listCarro.get(maiorSalario) );

    }


}
