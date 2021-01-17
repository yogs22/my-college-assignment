package com.company;

import java.util.Scanner;

public class TahunKabisat {
    // YOGI PRASETYAWAN HADI - 191110236
    public static void main(String[] args) {
        int year;
        boolean validInput = false;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Masukkan tahun (1900 - 2030) : ");
            year = scan.nextInt();

            if (year < 1900) {
                System.out.println("Maaf tahun input dibawah 1900\n");
                validInput = false;
            } else if (year > 2030) {
                System.out.println("Maaf tahun input diatas 2030\n");
                validInput = false;
            } else {
                if (year % 400 == 0) {
                    System.out.println(year + " Merupakan Tahun Kabisat");
                } else if (year % 100 == 0) {
                    System.out.println(year + " Merupakan Tahun Kabisat");
                } else if (year % 4 == 0) {
                    System.out.println(year + " Merupakan Tahun Kabisat");
                } else {
                    System.out.println(year + " Bukan Tahun Kabisat");
                }

                validInput = true;
            }
        } while (!validInput);
    }
}
