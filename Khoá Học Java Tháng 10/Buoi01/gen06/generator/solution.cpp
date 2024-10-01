#include<bits/stdc++.h>
using namespace std;

int main()
{
    ifstream cin("input.txt");
    ofstream cout("output.txt");

    int a, b;
    cin >> a >> b;
    cout << "Phan nguyen cua " << a << " / " << b << " la " << a / b << endl;
    cout << "Phan du cua " << a << " / " << b << " la " << a % b << endl;
    if ((a + b) % 2 == 0)
        cout << "Trung binh cong cua " << a << " va " << b << " la " << (a + b) / 2.0 << ".0" << endl;
    else
        cout << "Trung binh cong cua " << a << " va " << b << " la " << (a + b) / 2.0 << endl;
}
