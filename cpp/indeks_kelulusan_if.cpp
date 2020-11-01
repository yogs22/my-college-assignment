#include <iostream>
using namespace std;

int main() {
  int nilai;
  int indeks_nilai;
  string indeks;
  string hasil;

  cout << "Nama\t: Yogi Prasetyawan Hadi" << endl;
  cout << "NIM\t: 191110236" << endl;
  cout << "-----------------------------------" << endl;

  cout << "Masukkan Nilai : ";
  cin >> nilai;

  if (nilai >= 85) {
    indeks = "A";
    indeks_nilai = 1;
  } else if (nilai < 85 && nilai >= 70) {
    indeks = "B";
    indeks_nilai = 2;
  } else if (nilai < 70 && nilai >= 55) {
    indeks = "C";
    indeks_nilai = 3;
  } else if (nilai < 55 && nilai >= 40) {
    indeks = "D";
    indeks_nilai = 4;
  } else {
    indeks = "E";
    indeks_nilai = 5;
  }

  switch (indeks_nilai) {
    case 1:
      hasil = "Luar Biasa!";
      break;
    case 2:
      hasil = "Cukup Bagus!";
      break;
    case 3:
      hasil = "Bagus";
      break;
    case 4:
      hasil = "Kurang";
      break;
    case 5:
      hasil = "Sangat Kurang";
      break;
    default:
      hasil = "Salah";
      break;
  }

  cout << "\nIndeks Kelulusan : " << indeks << endl;
  cout << hasil << endl;
}
