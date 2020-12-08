#include <iostream>
using namespace std;

void breakdown(int money) {
  int sheet_1 = 10000;
  int sheet_2 = 5000;
  int sheet_3 = 1000;

  int mod_1 = money % sheet_1;
  int mod_2 = mod_1 % sheet_2;

  int one = money / sheet_1;
  int two = mod_1 / sheet_2;
  int three = mod_2 / sheet_3;

  cout << "<" << (int)one << ", " << (int)two << ", " << (int)three << ">\n";
}

int main (){
  int value;
  cout << "Nama\t: Yogi Prasetyawan Hadi" << endl;
  cout << "NIM\t: 191110236" << endl;
  cout << "-----------------------------------" << endl;

  cout << ">>> ";
  cin >> value;

  breakdown(value);
}
