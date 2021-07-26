package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree BT = new BinaryTree();
        BT.insert(1);
        BT.insert(2);
        BT.insert(3);
        BT.insert(4);
        BT.insert(5);
        BT.InorderTraversal(BT.root);
    }
}
