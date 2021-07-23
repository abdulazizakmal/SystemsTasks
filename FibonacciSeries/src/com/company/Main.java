package com.company;

/* Printing first 10 numbers of fibonacci series using Stack
*/

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> fibonacci = new Stack();
        fibonacci.push(0);
        System.out.println(fibonacci.peek());
        fibonacci.push(1);
        System.out.println(fibonacci.peek());
        
        // using for loop to print the series
        for(int i=0;i<10;i++)
        {
            int temp = fibonacci.pop();
            temp = temp+fibonacci.peek();
            fibonacci.push(temp- fibonacci.pop());
            fibonacci.push(temp);
            System.out.println(fibonacci.peek());
        }    }
}
