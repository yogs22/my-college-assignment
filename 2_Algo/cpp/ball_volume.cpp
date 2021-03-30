#include <iostream>
using namespace std;

#define Phi 3.14

float calculate_ball_volume(float r) {
    return 4.0/3.0 * Phi * pow(r, 3);
}

int main() {
    float r;

    cout << "Program Menghitung Volume Bola" << endl;
    cout << "------------------------------" << endl;
    cout << "Masukkan jari - jari : "; cin >> r; cout << endl;
    cout << "Volume bola adalah : " << calculate_ball_volume(r) << endl;

    return 0;
}
