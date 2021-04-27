package com.company;

public class Manager extends Employee {
    private String position;
    private String sallary;

    public Manager(String position, String sallary) {
        this.position = position;
        this.sallary = sallary;
    }

    public void getEmployee() {
        System.out.println("Posisi\t: "+ this.position);
        System.out.println("Gaji\t: "+ this.sallary);
        System.out.println("----------------------");
    }
}
