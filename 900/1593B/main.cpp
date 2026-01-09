#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int w;
    cin >> w;

    while (w--) 
    {
        string s;
        cin >> s;

        int cnt = (int)s.size() + 1;

        // Check all pairs of digits (j, i) with j < i
        for (int i = (int)s.size() - 1; i >= 0; i--) 
        {
            for (int j = i - 1; j >= 0; j--) 
            {
                int num = (s[j] - '0') * 10 + (s[i] - '0');
                if (num % 25 == 0) 
                    cnt = min(cnt, (int)s.size() - j - 2);
            }
        }

        cout << cnt << "\n";
    }
    
    return 0;
}
