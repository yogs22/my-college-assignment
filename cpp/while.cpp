#include <iostream>
using namespace std;

int main()
{
  int a = 0;
  int b = 5;
  cout << "Nama\t: Yogi Prasetyawan Hadi" << endl;
  cout << "NIM\t: 191110236" << endl;
  cout << "-----------------------------------" << endl;

  while (a < 5) {
    int c = b - a;
    int d = c - 1;
    if (d == 0) {
      cout << "Anak ayam turunlah " << c << " mati satu tinggallah induknya!\n" << endl ;
    } else {
      cout << "Anak ayam turunlah " << c << " mati satu tinggallah " << d << "!\n" << endl ;
    }
    a++;
  }
}
