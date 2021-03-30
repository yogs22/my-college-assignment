#include <iostream>
using namespace std;

// KELILING TRAPESIUM # PRAKTIKUM ALGORITMA MODUL 8

int calculate_circumference_trapezoid(int a, int b, int c, int d) {
    return a + b + c + d;
}

int main(int argc, char const *argv[]) {
    int a, b, c, d;

    cout << "Nama\t: Yogi Prasetyawan Hadi" << endl;
    cout << "NIM\t: 191110236" << endl;

    cout << "-----------------------------------" << endl;
    cout << "Menghitung Keliling Trapesium" << endl;
    cout << "-----------------------------------" << endl;

    cout << "Sisi sejajar A \t : ";
    cin  >> a;
    cout << "Sisi sejajar B \t : ";
    cin  >> b;
    cout << "Sisi miring C \t : ";
    cin  >> c;
    cout << "Sisi miring D \t : ";
    cin  >> d;

    cout << "\nHasil Keliling \t : " << calculate_circumference_trapezoid(a, b, c, d) << endl;

    return 0;
}
