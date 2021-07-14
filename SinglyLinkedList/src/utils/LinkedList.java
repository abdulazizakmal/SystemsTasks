package utils;

public class LinkedList {
    Node head;

    public void insert(int data)
    {
        Node newNode= new Node(data);
        newNode.next=null;

        // in case the list is empty
        if(head==null)
        {
            head=newNode;
        }
        // else insert ii in the end
        else
        {
            Node lastNode = head;
            while(lastNode.next!=null)
            {
                lastNode=lastNode.next;
            }

            lastNode.next=newNode;
        }
    }
    public void printList()
    {
        Node currentNode = head;
        System.out.println("LinkedList: " );

        while(currentNode!= null)
        {
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
    }

    public void deleteElement(int data)
    {
        Node currNode = head;
        Node prev = null;

        //case 1 if node itself holds the data

        if(currNode!=null && currNode.data == data)
        {
            head = head.next;
            System.out.println(data + "found and deleted");
        }

        // case 2 if the data is found at some other place

        while(currNode!= null && currNode.data != data)
        {
            prev=currNode;
            currNode=currNode.next;
        }

        if(currNode!=null)
        {
            prev.next = currNode.next;

            System.out.println(data + "deleted");
        }

        //case 3 data not found in the linked list
        if(currNode== null)
        {
            System.out.println(data +"not found");
        }
    }


    public void updateElement(int currentData, int newData)
    {
        Node currentNode = head;

        while(currentNode!= null && currentNode.data!=currentData)
        {
            currentNode=currentNode.next;
        }

        currentNode.data=newData;

    }

    public void insertAfter(int value,int data)
    {
        Node currentNode = head;
        Node prevNode=null;
        while(currentNode!= null && currentNode.data!=value)
        {
            prevNode=currentNode;
            currentNode=currentNode.next;
        }
        Node newNode= new Node(data);
        prevNode=prevNode.next;
        currentNode=currentNode.next;
        prevNode.next=newNode;
        newNode.next=currentNode;
    }
}
