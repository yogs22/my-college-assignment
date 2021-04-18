package com.company;

public class Tumbuhan extends MakhlukHidup {
    private String Akar;

    public Tumbuhan (String Akar) {
        this.Akar = Akar;
    }

    public void tegak() {
        System.out.println("Tumbuhan tegak dengan : " + Akar);
    }
}
