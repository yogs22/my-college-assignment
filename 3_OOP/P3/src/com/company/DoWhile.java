package com.company;

public class DoWhile {
    public static void main(String args[]) {
        showName();
        int n = 10;
        do{
            System.out.println("Nilai n:"+n);
            n--;
        } while(n >= 1);
    }

    private static void showName() {
        System.out.println("Nama : Yogi Prasetyawan Hadi");
        System.out.println("NIM : 191110236");
        System.out.println("----------------------");
    }
}
