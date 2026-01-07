#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int k;
    cin >> k;

    vector<int> a(12);
    for (int i = 0; i < 12; i++)
        cin >> a[i];

    sort(a.begin(), a.end());  // sort ascending

    int sum = 0;
    if (k == 0) 
        cout << 0 << "\n";
    else 
    {
        bool flag = false;
        for (int i = 11; i >= 0; i--) 
        {  
            // take largest months first
            sum += a[i];

            if (sum >= k) 
            {
                flag = true;
                cout << 12 - i << "\n";  // number of months used
                break;
            }
        }
        if (!flag) 
            cout << -1 << "\n";
    }

    return 0;
}
