package com.company.data.structure.entity;

public class Node {

    public Node left;
    public Node right;
    public int data;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getData() {
        return data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }
}
