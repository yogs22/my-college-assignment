package com.company;

public class Staff extends Employee {
    private String position;
    private String sallary;

    public Staff(String position, String sallary) {
        this.position = position;
        this.sallary = sallary;
    }

    public void getEmployee() {
        System.out.println("Posisi\t: "+ this.position);
        System.out.println("Gaji\t: "+ this.sallary);
        System.out.println("----------------------");
    }
}
