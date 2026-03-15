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

        for (int i = 1; i < n; i++) 
        {
            string a;
            cin >> a;

            if (s + a > a + s)
                s = a + s;
            else
                s = s + a;
        }

        cout << s << "\n";
    }

    return 0;
}
