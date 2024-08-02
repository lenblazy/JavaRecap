package org.example;

import java.util.Scanner;

public class MyBinaryTree {

    private Node root;

    public MyBinaryTree() {
    }

    public void populate(Scanner scanner){
        System.out.println("Enter the root node");

        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of "+ node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println();
        }

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
}