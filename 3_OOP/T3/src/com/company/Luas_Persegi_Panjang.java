package com.company;
import java.util.Scanner;

public class Luas_Persegi_Panjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, luas;

        System.out.println("PROGRAM JAVA MENGHITUNG LUAS PERSEGI PANJANG : ");
        System.out.println("NIM : 191110236");
        System.out.println("NAMA : YOGI PRASETYAWAN HADI");
        System.out.println("-----------------------------------------------");

        System.out.print("Masukan Panjang      : ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar        : ");
        lebar = input.nextInt();

        luas = panjang*lebar;

        System.out.println("Luas Persegi Panjang : "+luas);
    }
}
