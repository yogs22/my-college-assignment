package com.company;

public class MakhlukHidupMain {
    public void cekMakhlukHidup (MakhlukHidup mh){
        mh.tegak();
        mh.kebutuhan();
        mh.berkembang();
    }

    private static void mahasiswa() {
        System.out.println("NIM: 191110236");
        System.out.println("Nama: Yogi Prasetyawan Hadi");
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        mahasiswa();
        MakhlukHidupMain mh_index = new MakhlukHidupMain();
        mh_index.cekMakhlukHidup(new Manusia("Dua Kaki"));
        mh_index.cekMakhlukHidup(new Tumbuhan ("Akar"));
    }
}
