#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    long long sumA = 0, sumB = 0, sumC = 0;

    // Read n numbers
    for (int i = 0; i < n; i++) 
    {
        long long x;
        cin >> x;
        sumA += x;
    }

    // Read n-1 numbers
    for (int i = 0; i < n - 1; i++) 
    {
        long long x;
        cin >> x;
        sumB += x;
    }

    cout << (sumA - sumB) << endl;

    // Read n-2 numbers
    for (int i = 0; i < n - 2; i++) 
    {
        long long x;
        cin >> x;
        sumC += x;
    }

    cout << (sumB - sumC) << endl;

    return 0;
}
