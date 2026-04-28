#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long coins = 0;
        long long n;
        cin >> n;

        int count = 19;
        while (n != 0) 
        {
            long long num = (long long)pow(3, count);
            if (n >= num) 
            {
                coins += ( (long long)pow(3, count + 1) + count * (long long)pow(3, count - 1) );
                n -= num;
            } 
            else
                count--;
        }

        cout << coins << "\n";
    }

    return 0;
}
