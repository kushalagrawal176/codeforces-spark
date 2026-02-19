#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, a;
        cin >> n >> a;

        vector<int> v(n);
        for (int i = 0; i < n; i++)
            cin >> v[i];

        int cnt1 = 0; // count of elements less than a
        int cnt2 = 0; // count of elements greater than a

        for (int i = 0; i < n; i++) 
        {
            if (v[i] < a) 
                cnt1++;
            if (v[i] > a) 
                cnt2++;
        }

        if (cnt1 > cnt2)
            cout << a - 1 << "\n";
        else
            cout << a + 1 << "\n";
    }

    return 0;
}
