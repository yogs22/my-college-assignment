package com.company;
import java.util.*;

public class Array_1 {
    public static void main(String[] args) {
        int array[] = new int [3];
        for (int i = 3; i > 0; i--)
            array[3 - i] = i;
        Arrays.sort(array);
        for (int i = 0; i < 3; ++i)
            System.out.print(array[i]);;
    }
}
