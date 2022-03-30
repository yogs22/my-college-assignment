#include <iostream>
using namespace std;

int main() {
    float luas, phi = 3.14;
    int r;
    cout << "Masukan Jari-jari : ";
    cin >> r;

    luas = phi * r * r;

    cout << "Luas Lingkaran = " << luas << endl;

    return 0;
}
