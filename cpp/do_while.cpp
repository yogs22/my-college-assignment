#include <iostream>
using namespace std;

int main() {
  int nilai_awal = 1;
  int nilai_akhir;

  cout << "Nama\t: Yogi Prasetyawan Hadi" << endl;
  cout << "NIM\t: 191110236" << endl;
  cout << "-----------------------------------" << endl;

  cout << "Masukkan Nilai Akhir : ";
  cin >> nilai_akhir;

  do {
    cout << "Nilai ke " << nilai_awal << endl;
    nilai_awal++;
  } while(nilai_awal <= nilai_akhir);

  return 0;
}
