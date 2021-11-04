#define _CRTDBG_MAP_ALLOC
#include <stdlib.h>
#include <crtdbg.h>
#include "sub4_struct_pointer.h"
#include <iostream>
#include <string>
using namespace std;

struct Student {
    int nim;
    std::string name;
    float nilai[4];
};

Student **mhs;

int main() {
    Student *p = new Student[3];
    mhs = &p;

    int count = 3;

    for (int i = 0; i < count; i++) {
        p[i].nim = 101+i;
        std::stringstream sstm;
        sstm << "Yogiph" << i+1;
        p[i].name = sstm.str();

        printf("NIM = %d, Nama = %s, Alamat dituju = %d, Alamat pointer = %d\n", p[i].nim, (p+i)->name.c_str(), p+i, &p);
        for (int x = 0; x < 4; x++) {
            int i = 0;
            p[i].nilai[x] = 8.0f + (float) / j / 10;

            printf("Nilai = %f\n", p[i].nilai[j]);
            i++;
        }

        printf("Pointer size = %d, value size = %d\n", sizeof(p), sizeof(p[i]));
    }
    delete[] p;
    p = nullptr;

    _CrtDumpMemoryLeaks();

    getchar();

    return 0;
}
