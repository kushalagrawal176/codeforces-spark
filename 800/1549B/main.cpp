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
        
        string a, b;
        cin >> a >> b;

        vector<char> ch(a.begin(), a.end());
        int cnt = 0;

        for (int i = 0; i < n; i++) 
        {
            if (b[i] == '1') 
            {
                if (ch[i] == '0')
                    cnt++;
                else if (i - 1 >= 0 && ch[i - 1] == '1') 
                {
                    cnt++;
                    ch[i - 1] = '2'; // mark as used
                } 
                else if (i + 1 < n && ch[i + 1] == '1') 
                {
                    cnt++;
                    ch[i + 1] = '2'; // mark as used
                }
            }
        }

        cout << cnt << "\n";
    }

    return 0;
}
