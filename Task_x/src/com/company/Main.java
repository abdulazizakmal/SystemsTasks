package com.company;

import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        //System.out.println(UniqueStringUsingBitVector.isUnique("helo"));
        Main.isUnique("abcdef","abcxyz");
    }

    public static void isUnique(String str1,String str2){
        int checker=0;
        for(int i=0;i<str1.length();i++){
            int charBitVector1= 1 << (str1.charAt(i)-'a');
            if((checker & charBitVector1)>0){
                continue;
            }
            checker|=charBitVector1;
        }
        for(int i=0;i<str2.length();i++){
            int charBitVector2=1 <<(str2.charAt(i)-'a');
            if((checker & charBitVector2)>0){
                System.out.println(str2.charAt(i));
            }
            checker|=charBitVector2;
        }
    }
}