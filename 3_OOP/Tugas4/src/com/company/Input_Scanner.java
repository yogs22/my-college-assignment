package com.company;

import java.io.*;
import java.util.*;

public class Input_Scanner {
    public static void main(String[] args) {
        System.out.println("Nama : Yogi Prasetyawan Hadi");
        System.out.println("NIM : 191110236");

        System.out.println("-----------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = scanner.next();
        System.out.println("Your name is: " + name);
    }
}
