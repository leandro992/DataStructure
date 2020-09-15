package com.company;

import com.company.data.structure.ed.Vector;
import com.company.data.structure.entity.Student;

public class Main {

    public static void main(String[] args) {

        Student a1 = new Student("João");
        Student a2 = new Student("Maria");
        Student a3 = new Student("Raquel");
        Student a4 = new Student("Samuel");

        Vector list = new Vector();
        list.add(a1);
        list.add(a2);
        list.add(a4);
        list.add(a3);
        list.add(a2,0);
        System.out.println(list.contains(a3));
        System.out.println(list);
        System.out.println("Text");
        System.out.println(list.takes(200));

    }


}
