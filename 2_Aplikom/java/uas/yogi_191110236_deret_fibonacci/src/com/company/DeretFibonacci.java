package com.company;

import java.util.Scanner;

public class DeretFibonacci {
    // YOGI PRASETYAWAN HADI - 191110236
    public static void main(String[] args) {
	    int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Banyak Bilangan Yang Ditampilkan : ");
        int limit = input.nextInt();
        int f = 1;
        int f2 = 1;
        int fib = 1;
        System.out.print(limit + " Deret Fibonacci = ");
        for (i = 1; i <= limit; i++) {
            System.out.print(f2 + " ");
            fib = f + f2;
            f = f2;
            f2 = fib;
        }
    }
}
