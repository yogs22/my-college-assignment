package com.company;

public class Cat extends AnimalsParent implements CatInterface {

    @Override
    public void print() {
        System.out.println("Nama Ku \t\t: " + Nama);
        System.out.println("Jumlah Kaki Ku \t: " + Jum_Kaki);
        System.out.println("Bunyi Ku \t\t: " + Bunyi);
        System.out.println("----------------------------");
    }
}
