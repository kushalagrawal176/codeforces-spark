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

        for (int i = 0; i < n - 2; i++) 
        {
            string st = "";
            st += s[i];
            st += s[i + 1];
            st += s[i + 2];

            if (st == "pie") 
            {
                cnt++;
                i += 2; // skip ahead
            }
            else if (st == "map") 
            {
                cnt++;
                i += 2; // skip ahead
            }
        }

        cout << cnt << "\n";
    }

    return 0;
}
