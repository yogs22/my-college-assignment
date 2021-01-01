#include <iostream>
using namespace std;

int main() {
    int bilangan;
    cout << "PROGRAM C++ CEK BILANGAN GANJIL GENAP BY YOGI" << endl;
    cout << "-----------------------------------" << endl;
    cout << "Masukan Bilangan\t: ";
    cin >> bilangan;

    if (bilangan % 2 == 0) {
        cout << "Bilangan " << bilangan << " adalah genap." << endl;
    } else {
        cout << "Bilangan " << bilangan << " adalah ganjil." << endl;
    }

    return 0;
}
