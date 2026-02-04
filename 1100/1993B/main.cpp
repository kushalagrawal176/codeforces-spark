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
        vector<int> a(n);

        long long max_odd = LLONG_MIN;
        int odd = 0;

        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            if (a[i] % 2 != 0) 
            {
                max_odd = max(max_odd, (long long)a[i]);
                odd++;
            }
        }

        if (max_odd == LLONG_MIN || odd == n)
            cout << 0 << "\n";
        else 
        {
            sort(a.begin(), a.end());
            int count = 0, temp = 0;
            for (int i = 0; i < n; i++) 
            {
                if (a[i] % 2 == 0) 
                {
                    if (a[i] > max_odd)
                        temp = 1;

                    max_odd += a[i];
                    count++;
                }
            }
            
            cout << count + temp << "\n";
        }
    }

    return 0;
}
