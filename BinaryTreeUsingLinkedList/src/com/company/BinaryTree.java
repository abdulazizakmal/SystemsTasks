package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;
    LinkedList<Node> BT;

     BinaryTree()
    {
        root = null;
        BT = new LinkedList<Node>();
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if(root == null)
        {
            root = newNode;
            return;
        }
        else
        {
            Queue<Node> nodeQueue =BT;
            nodeQueue.add(root);
            Node temp = nodeQueue.peek();
            nodeQueue.remove();

            while(true)
            {
                if(temp.left!=null && temp.right!=null)
                {
                    nodeQueue.add(temp.left);
                    nodeQueue.add(temp.right);

                }
                else{
                    if(temp.left == null)
                    {
                        temp.left=newNode;
                        nodeQueue.add(temp.left);
                    }
                    else
                    {
                        temp.right=newNode;
                        nodeQueue.add(temp.right);
                    }
                    break;
                }
            }

        }


    }
    public void InorderTraversal(Node node)
    {
        if(node==null)
        {
            return;
        }
        InorderTraversal(node.left);
        System.out.println(node.data);
        InorderTraversal(node.right);
    }

}
