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
        
        char ch = 'a';
        for (int i = 0; i < s.size(); i++) 
        {
            ch = max(ch, s[i]);
        }
        
        cout << (ch - 'a' + 1) << "\n";
    }
    
    return 0;
}
