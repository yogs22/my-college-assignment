package com.company;
import java.util.Scanner;

public class Notation {
    public void calc(Integer data) {
        int value = 1;
        for (int i=2; i <= data; i++) {
            value += i;
        }

        int total = value + (2 * value);
        System.out.println("∑"+data+",i=1(x+2i) = "+total);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukkan nilai n");
        int n = myObj.nextInt();

        Notation notation = new Notation();
        notation.calc(n);

        System.out.println("\nCode by Yogi Prasetyawan / 191110236");
    }
}
