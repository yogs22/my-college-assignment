#include <iostream>
using namespace std;

int main() {
  int a = 0;
  int b;
  string star = "";

  cout << "Masukan Bilangan: ";
  cin >> b;
  while (a < b) {
    a++;
    star += "*";
    cout << star << endl;
  }

  return 0;
}
