package com.company;

public class Chow extends AnimalsParent implements ChowInterface {

    @Override
    public void print() {
        System.out.println("Nama Ku \t\t: " + Nama);
        System.out.println("Jumlah Kaki Ku \t: " + Jum_Kaki);
        System.out.println("Bunyi Ku \t\t: " + Bunyi);
        System.out.println("----------------------------");
    }
}
