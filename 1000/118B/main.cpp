#include <iostream>
#include <cmath>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    for(int i = 0; i < 2 * n + 1; i++) 
    {
        int k = 0;
        int j = n - abs(i - n);

        while(k < n - j) {
            cout << "  ";
            k++;
        }

        k = j;
        while(k > -j) 
        {
            cout << j - abs(k) << " ";
            k--;
        }

        cout << "0\n";
    }

    return 0;
}
