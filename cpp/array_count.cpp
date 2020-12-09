#include <iostream>
using namespace std;

int main() {
    int nilai [4];

    nilai[0] = 10;
    nilai[1] = 20;
    nilai[2] = 30;
    nilai[3] = 40;

    int count_arr = nilai[0] + nilai[1] + nilai[2] + nilai[3];
    cout << "Hasil dari \n" << nilai[0] << " + " << nilai[1] << " + " << nilai[2] << " + " << nilai[3] << " = " << count_arr << "\n";

    return 0;
}
