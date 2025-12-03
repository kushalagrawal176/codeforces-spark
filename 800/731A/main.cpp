#include <bits/stdc++.h>
using namespace std;

int main() 
{
    string s;
    cin >> s;
    
    int cnt = 0;
    char ch = 'a';
    
    for(char c : s) 
    {
        cnt += min(abs(c - ch), 26 - abs(c - ch));
        ch = c;
    }
    
    cout << cnt << endl;
    return 0;
}
