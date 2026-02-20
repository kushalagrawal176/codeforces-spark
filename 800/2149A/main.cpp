#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;

        int one = 0, zero = 0, neg = 0;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;
            
            if (a == -1)
                neg++;
            else if (a == 1)
                one++;
            else
                zero++;
        }

        int cnt = 0;
        cnt += zero;

        if (neg % 2 == 1)
            cnt += 2;

        cout << cnt << "\n";
    }

    return 0;
}
