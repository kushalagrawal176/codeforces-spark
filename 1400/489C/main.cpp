#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int m, s;
    cin >> m >> s;

    int s1 = s - 1;

    // Impossible cases
    if ((s == 0 && m != 1) || (m * 9 < s)) 
    {
        cout << "-1 -1\n";
        return 0;
    }

    string ans1 = "", ans2 = "";

    // Construct maximum number (ans1)
    int temp = s;
    for (int i = 0; i < m; i++) 
    {
        int digit = min(9, temp);
        ans1 += char('0' + digit);
        temp -= digit;
    }

    // Construct minimum number (ans2)
    temp = s1;
    for (int i = 0; i < m - 1; i++) 
    {
        int digit = min(9, temp);
        ans2 = char('0' + digit) + ans2;
        temp -= digit;
    }
    
    ans2 = char('0' + (temp + 1)) + ans2;

    cout << ans2 << " " << ans1 << "\n";
    return 0;
}
