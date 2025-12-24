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

        int sum = 0;
        int negative = 0;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;
            if (a < 0) 
                negative++;
        
            sum += a;
        }

        int cnt = 0;

        if (sum < 0) 
            cnt = (-sum + 1) / 2;

        if (((cnt & 1) ^ (negative & 1)) == 1) 
            cnt++;

        cout << cnt << "\n";
    }

    return 0;
}
