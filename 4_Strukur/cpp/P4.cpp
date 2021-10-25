// YOGI PRASETYAWAN HADI - 191110236
#include <iostream>
#include <string>
using namespace std;

int main() {
    string cars[4] = {"Volvo", "BMW", "Ford", "Mazda"};

    for(int i = 0; i < 4; i++) {
        cout << "Size of " << cars[i] << " is " << sizeof(cars[i]) << "\n";
    }

    return 0;
}
