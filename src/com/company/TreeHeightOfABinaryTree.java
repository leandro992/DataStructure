package com.company;

import com.company.data.structure.entity.Node;

import java.util.Scanner;

public class TreeHeightOfABinaryTree {

    public static void main(String[] args) {
     /*   Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);*/
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node2.left = node3;
        node2.right = node4;
        node2.left.left = node5;

        int height = height(node2);
        System.out.println("Number " + height);
    }


    public static int height(Node root) {
        if(root == null)
        {
            return  -1;
        }
        int lefte = height(root.left);
        int right = height(root.right);
        int total = Math.max(right,lefte) + 1;
        return total;
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
