package com.company;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        int awal = 1;
        int tengah = 2;
        int akhir = 3;
        queue.masuk(awal);
        queue.masuk(tengah);
        queue.masuk(akhir);
        queue.tampilkan();
        queue.keluar();
        queue.tampilkan();
        queue.keluar();
        queue.tampilkan();
        queue.keluar();
        queue.tampilkan();
    }
}
