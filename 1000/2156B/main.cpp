#include <bits/stdc++.h>
using namespace std;

int main() 
{    
    int t;
    cin>>t;

    while (t--) 
    {
        int n, q;
        cin >> n >> q;

        string s;
        cin >> s;

        bool hasB = (s.find('B') != string::npos);

        while (q--) 
        {
            long long a;
            cin >> a;

            long long sec = 0;
            if (!hasB) // If there are no 'B's, each 'A' takes 1 second, so the time is just 'a'.
                sec = a;
            else 
            {
                int idx = 0;
                while (a > 0) 
                {
                    sec++;

                    if (s[idx] == 'A') 
                        a--;
                    else 
                        a /= 2;

                    idx++;
                    if (idx == n) 
                        idx = 0;
                }
            }

            cout << sec << '\n';
        }
    }

    return 0;
}
