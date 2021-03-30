package com.company;

public class CopyArray {
    public static void main(String[] args) {
        int[] array1 = {7, 4, 8, 1, 4, 1, 4};
        int[] array2 = new int[3];
        System.arraycopy(array1, 0, array2, 0, 3);

        System.out.println("Array1 : ");
        for (int i = 0; i < array1.length; i++)
            System.out.println(array1[i] + " ");
        System.out.println();

        System.out.println("Array2 : ");
        for (int i = 0; i < array2.length; i++)
            System.out.println(array2[i] + " ");
    }
}
