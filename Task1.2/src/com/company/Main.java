package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        a = (int[])resizeableArray(a, 5);
        a[3] = 5;
        a[4] = 4;

        for(int i=0;i< a.length;i++)
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        for (int i=0; i<a.length; i++)
            System.out.println(a[i]);
    }
    private static Object resizeableArray (Object arr, int newSize) {
        int oldSize = java.lang.reflect.Array.getLength(arr);
        Class elementType = arr.getClass().getComponentType();
        Object updatedArray = java.lang.reflect.Array.newInstance(elementType, newSize);
        int len = Math.min(oldSize, newSize);
        if (len > 0)
            System.arraycopy(arr, 0, updatedArray, 0, len);
        return updatedArray;
    }
}
