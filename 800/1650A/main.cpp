#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string a, b;
        cin >> a >> b;

        int n = a.size();
        bool flag = false;

        for (int i = 0; i < n; i++) 
        {
            if (a[i] == b[0]) 
            {
                if ((i % 2 == 0) && ((n - i - 1) % 2 == 0)) 
                {
                    flag = true;
                    break;
                }
            }
        }

        if (flag)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
