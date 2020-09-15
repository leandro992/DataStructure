package com.company;

import com.company.data.structure.ed.LinkedList;

public class ListaLigada {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        System.out.println(list);
        list.addStart("João");
        System.out.println(list);
        list.addStart("Maria");
        System.out.println(list);
        list.addStart("Leandro");
        System.out.println(list);

        list.addEnd("Santos");
        System.out.println(list);

        list.addMiddle(2,"Caique");
        System.out.println(list);

    }

}
