package com.company;

public class Node {
    int data;
    Node left;
    Node right;

     Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }
}
