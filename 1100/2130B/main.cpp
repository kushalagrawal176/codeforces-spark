#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, s;
        cin >> n >> s;

        int sum = 0;
        int zero = 0, one = 0, two = 0;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;

            if (a == 0) 
                zero++;
            else if (a == 1) 
                one++;
            else 
                two++;

            sum += a;
        }

        s -= sum;

        if (s == 0 || s > 1)
            cout << "-1\n";
        else 
        {
            while (zero--) 
                cout << "0 ";
            while (two--) 
                cout << "2 ";
            while (one--) 
                cout << "1 ";

            cout << "\n";
        }
    }

    return 0;
}
