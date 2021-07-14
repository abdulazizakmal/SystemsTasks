package com.company;

import utils.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(10);
        linkedList.insert(11);
        linkedList.insert(12);
        linkedList.insert(13);
        linkedList.insert(14);
        linkedList.printList();
        linkedList.deleteElement(12);
        linkedList.printList();
        linkedList.updateElement(10,90);
        linkedList.printList();
        linkedList.insertAfter(11,20);
        linkedList.printList();

    }
}
