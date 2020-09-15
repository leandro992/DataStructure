package com.company.data.structure.ed;

import com.company.data.structure.entity.Cell;

public class LinkedList {

    private Cell fist = null;
    private Cell end = null;
    private int totalElement = 0;

    public void addStart(Object element) {
        Cell nova = new Cell(element, fist);
        this.fist = nova;

        if (this.totalElement == 0) {
            this.end = this.fist;
        }

        this.totalElement++;
    }

    public void addEnd(Object element) {

        if (this.totalElement == 0) {
            addStart(element);
        } else {
            Cell newCell = new Cell(element, null);
            this.end.setNext(newCell);
            this.end = newCell;
            this.totalElement++;
        }
    }

    private Boolean occupiedPosition(int position) {
        return position >= 0 && position < this.totalElement;
    }

    private Cell getCell(int position) {
        if (!occupiedPosition(position)) {
            throw new IllegalArgumentException("Posição inexistente");
        }
        Cell actual = fist;
        for (int i = 0; i < position; i++) {
            actual = actual.getNext();
        }
        return actual;
    }

    public void addMiddle(int position, Object element) {

        if (position == 0) {
            addStart(element);
        } else if (position == this.totalElement) {
            addEnd(element);
        } else {
            Cell previous = this.getCell(position - 1);
            Cell newCell = new Cell(element, previous.getNext());
            previous.setNext(newCell);
            this.totalElement++;
        }
    }

    public Object get(int position) {
        return this.getCell(position).getElement();
    }


    public void removeStart(int position) {

        if (this.totalElement == 0) {
            throw new IllegalArgumentException("Lista vazia");
        }
        this.fist = this.fist.getNext();
        this.totalElement--;

        if (this.totalElement == 0) {
            this.end = null;
        }
    }

    public void remove(int position) {
    }

    public int size() {
        return this.totalElement;
    }

    public Boolean contains(Object o) {
        return true;
    }


    @Override
    public String toString() {
        if (this.totalElement == 0) {
            return "[]";
        }
        Cell actual = this.fist;
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < totalElement; i++) {
            builder.append(actual.getElement());
            builder.append(",");
            actual = actual.getNext();
        }
        builder.append("]");
        return builder.toString();
    }
}
