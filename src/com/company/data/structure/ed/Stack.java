package com.company.data.structure.ed;

import java.util.LinkedList;
import java.util.List;

public class Stack {

    private List<String> names = new LinkedList<>();

    /**
     *
     * @param nome
     * Add na lista um parametro no começo
     *
     *
     */
    public void push(String nome){
            names.add(nome);
    }

    /**
     *
     * @return O ultimo elemento add na lista, removendo ele da lista
     */
    public  String pop(){
        return names.remove(names.size()-1);
    }


    public Boolean empty(){
        return names.isEmpty();
    }

    @Override
    public String toString() {
        return names.toString();
    }

    java.util.Stack<Integer> pilha = new java.util.Stack<Integer>();


}
