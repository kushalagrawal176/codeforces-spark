#include <bits/stdc++.h>
using namespace std;

int main() 
{
    string s;
    cin >> s;

    bool flag = false;

    for (int i = 0; i < (int)s.size() - 1; i++) 
    {
        if (s[i] == '0' && flag == false) 
        {
            flag = true;
            continue;
        }
        
        cout << s[i];
    }

    if (flag == true)
        cout << s.back();

    return 0;
}
