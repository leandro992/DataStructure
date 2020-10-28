package com.company.data.structure.ed;

import com.company.data.structure.entity.Student;

import java.util.Arrays;

public class Vector {

    private Student[] students = new Student[100];
    private int totalStudent = 0;

    public void add(Student student) {
        this.students[totalStudent] = student;
        this.totalStudent++;
    }
    
    private Boolean invalidPosition(int position) {
        return position >= 0 && position <= totalStudent;
    }

    public void add(Student student, int position) {
        if (!invalidPosition(position)) {throw new IllegalArgumentException("invalid value."); }

        for (int i = totalStudent - 1; i >= position; ) { students[i + 1] = students[i]; }

        students[position] = student;
        totalStudent++;
    }

    private Boolean occupiedPosition(int takes) {
        return takes >= 0 && takes < totalStudent;
    }

    public Student takes(int takes) {
        if (!occupiedPosition(takes)) {
            throw new IllegalArgumentException("invalid value.");
        }
        return students[takes];
    }

    public void remove(int position) {
        for (int i = position; i < this.totalStudent; i++) {
            this.students[i] = this.students[i + 1];
        }
    }

    public boolean contains(Student student) {
        for (int i = 0; i < totalStudent; i++) {
            if (student.equals(students[i])) {
                return true;
            }
        }
        return true;
    }

    public int size() {
        return totalStudent;
    }

    @Override
    public String toString() {
        return Arrays.toString(students);
    }
}
