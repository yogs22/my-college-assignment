package com.company;

public class Switch {
    public static void main(String args[]) {
        showName();
        int bulan = 4;
        switch (bulan) {
            case 1:
                System.out.println("Kuartal 1");
                break;
            case 2:
                System.out.println("Kuartal 2");
                break;
            case 3:
                System.out.println("Kuartal 3");
                break;
            default:
                System.out.println("Kuartal 4");
        }
    }

    private static void showName() {
        System.out.println("Nama : Yogi Prasetyawan Hadi");
        System.out.println("NIM : 191110236");
        System.out.println("----------------------");
    }
}
