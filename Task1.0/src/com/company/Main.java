package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
        arrayList.add(5);
        arrayList.add(12);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(8);
        arrayList.add(6);
        arrayList.add(20);

        for(int i=0;i<arrayList.size();i++)
            for(int j=i+1;j< arrayList.size();j++)
            {
              if(arrayList.get(j)<arrayList.get(i))
              {
                  int temp = arrayList.get(j);
                  arrayList.set(j,arrayList.get(i));
                  arrayList.set(i,temp);
              }
            }

        System.out.println(arrayList);
    }
}
