#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin>>n;

        string s;
        cin>>s;

        string a = "";
        int i = 0;
        while (i < n && s[i] == '0') 
        {
            a.push_back('0');
            i++;
        }

        string b = "";
        int j = n - 1;
        while (j >= 0 && s[j] == '1') 
        {
            b.push_back('1');
            j--;
        }

        if (i < j)
            a.push_back('0'), a += b;
        else
            a += b;

        cout << a << "\n";
    }

    return 0;
}
