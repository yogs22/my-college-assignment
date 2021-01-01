package com.company;

public class WhileCount {
    public static void main(String[] args) {
        int count = 1;
        int i = 0;
        while (i < 9) {
            int j = 0;
            while (j < i + 1) {
                System.out.println(count);
                j++;
            }
            count++;
            System.out.println();
            i++;
        }
    }
}
