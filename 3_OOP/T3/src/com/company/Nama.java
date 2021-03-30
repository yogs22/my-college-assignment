package com.company;
import java.util.Scanner;

public class Nama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nim, nama;

        System.out.print("Masukan NIM      : ");
        nim = input.nextLine();
        System.out.print("Masukan Nama     : ");
        nama = input.nextLine();

        System.out.println("Saya adalah mahasiswa bernama " + nama + " dengan NIM " + nim);
    }
}
