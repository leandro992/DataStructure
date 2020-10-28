package com.company;

import com.company.data.structure.ed.Queue;

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

        
        //----------------- Test class Stack --------------------------------------------


     /*   Stack stack = new Stack();

        stack.push("São Paulo");
        System.out.println(stack);
        stack.push("Santos");
        System.out.println(stack);

        String r1 = stack.pop();
        System.out.println(r1);
        String r2 = stack.pop();
        System.out.println(r2);

        System.out.println(stack);*/


        //---------------------- TestQueue ---------------------------------------

        Queue queue = new Queue();

        String nome = "Santos ";
        nome.hashCode();

        queue.insert("João");
        System.out.println(queue);

        queue.insert("Marcelo");
        System.out.println(queue);



    }


}
