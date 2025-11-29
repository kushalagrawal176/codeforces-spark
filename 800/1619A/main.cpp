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

        if (s.size() % 2 != 0)
            cout << "NO\n";
        else 
        {
            int half = s.size() / 2;
            bool flag = true;

            for (int i = 0; i < half; i++) 
            {
                if (s[i] != s[i + half]) 
                {
                    flag = false;
                    break;
                }
            }
            
            if (flag)
                cout << "YES\n";
            else
                cout << "NO\n";
        }
    }

    return 0;
}
