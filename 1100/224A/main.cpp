#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int a, b, c;
    cin >> a >> b >> c;

    int k = (int) sqrt((1.0 * a * c) / b);

    int side1 = k;
    int side2 = a / k;
    int side3 = (b * k) / a;

    cout << 4 * (side1 + side2 + side3) << "\n";

    return 0;
}
