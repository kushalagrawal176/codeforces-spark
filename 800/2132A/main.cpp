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

        int l;
        cin >> l;
        string a, b;
        cin >> a >> b;

        for (int i = 0; i < l; i++) 
        {
            if (b[i] == 'V') 
            {
                s = a[i] + s;   // prepend character
            } 
            else 
            {
                s = s + a[i];   // append character
            }
        }

        cout << s << "\n";
    }

    return 0;
}
