package com.company;

public class FirstCommonLetter{
    public static void main(String[] args){
      char array1[] = {'a','b','c'};
      char array2[] = {'a','e','c'};

        FirstCommonLetter.checkFirstCommonLetter(array1,array2);
    }

    public static void checkFirstCommonLetter(char[] str1,char[] str2){
        int checker=0;
        for(char ch : str1){
            checker|=1 << (ch-'a');
        }
        for(char ch: str2){
            if((checker & 1 <<(ch-'a'))>0){
                System.out.println("First Common Letter is "+ ch);
                return;
            }
            checker|=1 <<(ch-'a');
        }
    }
}
