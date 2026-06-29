#include <iostream>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    int l = 0;
    while ((l + 1) * (l + 2) * (l + 3) / 6 <= n)
        l++;

    cout << l << endl;
    return 0;
}
