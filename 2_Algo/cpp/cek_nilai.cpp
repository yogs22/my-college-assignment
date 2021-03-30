#include <iostream>
using namespace std;

int main() {
    float nilai;
    cout<<"PROGRAM C++ CEK NILAI KELULUSAN BY YOGI"<<endl;
    cout<<"-----------------------------------"<<endl;
    cout<<"Masukan Nilai\t: ";
    cin>>nilai;
    if (nilai <= 70) {
        cout<<"Maaf anda Gagal!"<<endl;
    } else {
        cout<<"Selamat anda Lulus!"<<endl;
    }
    return 0;
}
