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

        int cnt = 0;
        int zero = 1;

        for (int i = 0; i < n; i++) 
        {
            if (s[i] == '1') 
            {
                cnt++;
                cnt += zero / 3;
                zero = 0;
            } 
            else
                zero++;
        }

        zero++;
        cnt += zero / 3;

        cout << cnt << "\n";
    }

    return 0;
}
