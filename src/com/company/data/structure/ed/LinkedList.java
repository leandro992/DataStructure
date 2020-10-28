package com.company.data.structure.ed;

import com.company.data.structure.entity.Cell;

public class LinkedList {

    private Cell fist = null;
    private Cell last = null;
    private int totalElement = 0;

    public void addStart(Object element) {
        if (this.totalElement == 0) {
            Cell newCell = new Cell(element);
            this.fist = newCell;
            this.last = newCell;
        } else {
            Cell newCell = new Cell(element, this.fist);
            this.fist.setPrevious(newCell);
            this.fist = newCell;
        }
        this.totalElement++;
    }

    public void addEnd(Object element) {

        if (this.totalElement == 0) {
            addStart(element);
        } else {
            Cell newCell = new Cell(element);
            this.last.setNext(newCell);
            newCell.setPrevious(this.last);
            this.last = newCell;
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
            Cell next = previous.getNext();

            Cell newCell = new Cell(element, previous.getNext());
            newCell.setPrevious(previous);
            previous.setNext(newCell);
            next.setPrevious(newCell);
            this.totalElement++;
        }
    }

    public Object get(int position) {
        return this.getCell(position).getElement();
    }


    public void removeStart() {

        if (this.totalElement == 0) {
            throw new IllegalArgumentException("Lista vazia");
        }
        this.fist = this.fist.getNext();
        this.totalElement--;

        if (this.totalElement == 0) {
            this.last = null;
        }
    }

    public void removeEnd() {
        if (this.totalElement == 1) {
            this.removeStart();
        } else {
            Cell penultimate = this.last.getPrevious();
            penultimate.setNext(null);
            this.last = penultimate;
            this.totalElement--;
        }
    }

    public void remove(int position) {
        if (position == 0) {
            this.removeStart();
        } else if (position == this.totalElement - 1) {
            this.removeEnd();
        } else {
            Cell previous = this.getCell(position - 1);
            Cell actual = previous.getNext();
            Cell next = actual.getNext();
            previous.setNext(next);
            next.setPrevious(previous);
            this.totalElement--;
        }

    }


    public int size() {
        return this.totalElement;
    }

    public Boolean contains(Object element) {
        Cell actual = this.fist;
        while (actual != null) {
            if (actual.getElement().equals(element)) {
                return true;
            }
            actual = actual.getNext();
        }
        return false;
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
