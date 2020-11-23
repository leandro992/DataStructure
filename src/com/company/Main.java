package com.company;

import com.company.data.structure.entity.Node;

public class Main {

    public static void main(String[] args) {

       /* Student a1 = new Student("João");
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
        System.out.println(list.takes(200));*/

        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node2.left = node3;
        node2.right = node4;
        node2.left.left = node5;

    }

}
