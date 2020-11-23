package com.company;

import com.company.data.structure.entity.Node;

import java.util.Scanner;

public class TreeLevelOrderTraversal {

    public static void main(String[] args) {
      /*  Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);*/

        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node2.left = node3;
        node2.right = node4;
        node2.left.left = node5;
        node2.left.left.left = node6;

        levelOrder(node2);

    }


    public static void levelOrder(Node root) {
        StringBuilder text = new StringBuilder();
        if (root == null){
            System.out.println(" ");
        }
        if (root.left != null || root.right != null){
            text.append(" " + root.left.data);
            text.append(" " + root.right.data);
        }

        System.out.println(text);

    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }



}
