#include <stdio.h>
#include <iostream>

struct Mahasiswa {
    int nim;
    std::string nama;
};

Mahasiswa *mhs;

void cetak() {
    std::cout<< sizeof(Mahasiswa) << " byte" << std::endl;
    Mahasiswa wahyu;
    wahyu.nim = 18111001;
    wahyu.nama = "Wahyu";
    mhs = new Mahasiswa[2];
    for(int i = 0; i < 2; i++) {
        mhs[i].nim = 18111002+i;
        mhs[i].nama = "Andi";
    }
    mhs[0] = wahyu;
    for(int i = 0; i < 2; i++) {
        printf("Mhs %d, nim = %d, nama = %s\n", i+1, mhs[i].nim, mhs[i].nama.c_str());
    }
}

int main() {
    cetak();
    std::cout<< sizeof(Mahasiswa) << " byte" << std::endl;
    return 0;
}
