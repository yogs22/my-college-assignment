#include <iostream>
using namespace std;

int main() {
    int i;
    struct Employees {
        char name[100];
        char address[200];
        char role[100];
        int sallary;
    } employee[5];

    // Input Employees
    for(i = 0; i < 5 ; i++)
	{
        cout << "Input data karyawan " << i + 1 << " \n";
        cout << "---------------------------------- \n";
		cout << "Nama   " << i + 1 << "\t: ";
        cin  >> employee[i].name;
        cout << "Alamat " << i + 1 << "\t: ";
		cin  >> employee[i].address;
        cout << "Bagian " << i + 1 << "\t: ";
		cin  >> employee[i].role;
        cout << "Gaji   " << i + 1 << "\t: ";
		cin  >> employee[i].sallary;
	}

    // Show Employees
    cout << "\nOutput Data Karyawan \n";
    cout << "---------------------------------- \n";
    for (i = 0; i < 5; i++) {
        cout << employee[i].name << "," << employee[i].address << "," << employee[i].role << "," << employee[i].sallary << "\n";
    }

    cout << "\n";
    cout << "---------------------------------- \n";
    cout << "Yogi Prasetyawan Hadi / 191110236 \n";

    return 0;
}
