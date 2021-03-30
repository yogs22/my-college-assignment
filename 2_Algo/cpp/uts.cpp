#include <stdio.h>
using namespace std;

int main () {
    int i, a = 10, jumlah = 0;
    do {
      jumlah = jumlah + i;
      i++;
    } while(i <= a);

    printf("%d", jumlah);
    return 0;
}
