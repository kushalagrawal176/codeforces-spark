#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;
    
    string s;
    cin >> s;

    int cnt = 0;
    int x = 0;

    for (int i = 0; i < n; i++) 
    {
        if (s[i] == 'x')
            x++;
        else 
        {
            if (x >= 3)
                cnt += x - 2; // remove extra 'x' beyond 2
    
            x = 0;
        }
    }

    if (x >= 3)
        cnt += x - 2;

    cout << cnt << "\n";

    return 0;
}
