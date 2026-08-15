#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while(t--) 
    {
        string r;
        cin>>r;
        long long n = r.length();

        if(n > 1)
            r = r + r;

        long long c = 0;
        long long m = 0;
        bool f = false;

        for(int i = 0; i < r.length(); i++) 
        {
            if(r[i] == '0')
                f = true;

            if(r[i] == '1')
                c++;
            else 
            {
                m = max(c, m);
                c = 0;
            }
        }

        long long x = n * n;
        if(!f)
            cout << x << "\n";
        else
        {
            long long a = m / 2;
            long long z = (m - a) * (1 + a);
            cout << z << "\n";
        }
    }

    return 0;
}