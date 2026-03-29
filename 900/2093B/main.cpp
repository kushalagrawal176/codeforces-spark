#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string s;
        cin >> s;

        long long zero = 0;
        long long cnt = 0;

        for (int i = s.size() - 1; i >= 0; i--) 
        {
            if (s[i] == '0' && cnt == 0)
                zero++;
            if (s[i] != '0')
                cnt++;
        }

        cout << cnt + zero - 1 << "\n";
    }

    return 0;
}
