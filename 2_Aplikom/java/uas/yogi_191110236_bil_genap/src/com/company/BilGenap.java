package com.company;

public class BilGenap {
    // YOGI PRASETYAWAN HADI - 191110236
    public static void main(String[] args) {
        for (int i = 2; i <= 20;i++){
            if (i % 2 == 0 && i % 6 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
