#include <curses.h>
#include <stdio.h>

int main() {
    struct mahasiswa {
        char nama[20];
        int nilai[3];
    } nilaiMhs;

    int i; int a = 0;
    float total = 0;
    float rata2 = 0;

    printf("INPUT DATA MAHASISWA\n");
    printf("Nama = "); scanf("%s", nilaiMhs.nama);
    a = 1;
    for (i = 0; i < 3; i++) {
        printf("Nilai ke-%i = ", a);
        scanf("%i",&nilaiMhs.nilai[i]);
        a++;
    }

    printf("Hallo %s, nilai Anda: \n", nilaiMhs.nama);
    for (i = 0; i < 3; i++) {
        printf("%d\n", nilaiMhs.nilai[i]);
        total = total + nilaiMhs.nilai[i];
    }
    rata2 = total / 3;
    printf("Total Nilai = %8.2f", total);
    printf("\nRata-rata Nilai = %8.2f", rata2);
    printf("\n");

    return 0;
}
