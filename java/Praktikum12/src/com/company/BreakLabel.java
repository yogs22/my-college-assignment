package com.company;

public class BreakLabel {
    public static void main(String[] args) {
        int a, b;
        Mulai:
        for (a = 0; a < 2; a++) {
            for (b = 0; b < 3; b++) {
                if (b == 1) break Mulai;
                System.out.println("a = " + a + " ; b = " + b);
            }
        }
    }
}
