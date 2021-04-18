package com.company;

public class Manusia extends MakhlukHidup {
    private String Kaki;

    public Manusia(String Kaki) {
        this.Kaki = Kaki;
    }

    public void tegak() {
        System.out.println("Manusia tegak dengan : " + Kaki);
    }
}
