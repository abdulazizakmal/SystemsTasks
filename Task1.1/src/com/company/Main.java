package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isPalindrome = true;
        StringBuffer sb =new StringBuffer("Madam");
        int size=sb.length()-1;
        for(int i=0;i<sb.length()/2+((sb.length()%2==0)?0:1);i++)
        {
            if(Character.toLowerCase(sb.charAt(i))!=Character.toLowerCase(sb.charAt(size)))
            {
                isPalindrome=false;
                break;
            }
            size--;
        }
        System.out.println(isPalindrome);
    }
}
