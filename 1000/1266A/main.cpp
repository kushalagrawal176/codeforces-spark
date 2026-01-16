#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    while (n--) 
    {
        string a;
        cin >> a;

        int even = 0, zero = 0;
        long long sum = 0;

        for (char ch : a) 
        {
            int digit = ch - '0';
            if (digit == 0) 
                zero++;
            if (digit % 2 == 0) 
                even++;
            sum += digit;
        }

        if (zero > 0 && even >= 2 && sum % 3 == 0)
            cout << "red\n";
        else
            cout << "cyan\n";
    }

    return 0;
}
