package com.company;

public class ForCount {

    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.println(count);
            }
            count++;
            System.out.println();
        }
    }
}
