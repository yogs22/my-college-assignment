package com.company;

import java.util.Scanner;

public class CetakHurufAwal {
    // YOGI PRASETYAWAN HADI - 191110236
    public static void main(String[] args) {
        Boolean cond = true;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan huruf kapital awal nama anda : ");
            String alphabet = input.nextLine();

            String name  = "";
            String ext   = " pasti";

            cond = false;

            switch (alphabet) {
                case "A":
                    name = "Andi";
                    break;
                case "B":
                    name = "Budi";
                    break;
                case "C":
                    name = "Caca";
                    break;
                case "D":
                    name = "Dodi";
                    break;
                case "E":
                    name = "Eri";
                    break;
                case "F":
                    name = "Feri";
                    break;
                case "G":
                    name = "Geo";
                    break;
                case "H":
                    name = "Heru";
                    break;
                case "I":
                    name = "Ilham";
                    break;
                case "J":
                    name = "Jaka";
                    break;
                default:
                    name = "tidak terdaftar";
                    ext  = "";
                    cond = true;
                    break;
            }

            System.out.println("Nama anda" + ext + " " + name + "\n");
        }
        while (cond == true);
    }
}
