package com.company;

public class For {
    public static void main(String args[]) {
        showName();
        int n;
        for(n = 0; n < 5; n++){
            System.out.println("Nilai n : "+n);
            System.out.println("Setelah for");
        }
    }

    private static void showName() {
        System.out.println("Nama : Yogi Prasetyawan Hadi");
        System.out.println("NIM : 191110236");
        System.out.println("----------------------");
    }
}
