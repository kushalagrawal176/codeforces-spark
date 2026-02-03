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

        string s;
        cin >> s;

        vector<long long> a(n);
        long long sum = 0;

        for (int i = 0; i < n; i++) 
        {
            if (s[i] == 'L') 
            {
                sum += i;
                a[i] = (n - 1 - i) - i;
            } 
            else 
            {
                sum += (n - 1 - i);
                a[i] = i - (n - 1 - i);
            }
        }

        sort(a.begin(), a.end());

        for (int i = n - 1; i >= 0; i--) 
        {
            if (a[i] > 0) 
                sum += a[i];

            cout << sum << " ";
        }
        
        cout << "\n";
    }

    return 0;
}
