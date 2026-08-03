#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while(t--) 
    {
        long long n;
        cin >> n;
        
        n = n * 5;

        // If the last digit is 5, add 5
        if (n % 10 == 5)
            n += 5;

        n = n / 2;

        cout << (n >= 15 ? n : 15) << "\n";
    }

    return 0;
}