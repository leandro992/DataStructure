package com.company.data.structure.ed;

import java.util.LinkedList;
import java.util.List;

public class Queue {


    private List<String> student = new LinkedList<>();

    public void insert(String name){
        this.student.add(name);
    }

    public String remove(){
        return student.remove(0);
    }


    public Boolean empty(){
        return student.size() == 0;
    }


    @Override
    public String toString() {
        return student.toString();
    }
}
