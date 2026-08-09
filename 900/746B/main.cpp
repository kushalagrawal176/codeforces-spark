#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;
    string s;
    cin >> s;

    string a = "";
    a += s[0];

    for(int i = 1; i < n; i++)
    {
        if((n-i) % 2 == 0)
            a = s[i] + a;
        else
            a = a + s[i];
    }

    cout << a << "\n";

    return 0;
}