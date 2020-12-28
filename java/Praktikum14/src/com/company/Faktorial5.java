package com.company;

public class Faktorial5 {
    public void test(int data) {
        int nilai = 1;
        if (data == 0 || data == 1) {
            nilai = 1;
        } else {
            for (int i=1; i <= data; i++) {
                nilai *= i;
            }
        }
        System.out.println(data + "! = " + nilai);
    }

    public static void main(String[] args) {
        Faktorial5 f5 = new Faktorial5();
        f5.test(4);
        f5.test(5);
    }
}
