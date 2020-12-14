package com.company;

public class BreakLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Iterasi ke " + i);
            i++;
            if (i > 10) break;
        }
        while (true);
    }
}
