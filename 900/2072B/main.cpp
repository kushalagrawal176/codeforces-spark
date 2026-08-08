#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n;
        cin >> n;
        string s;
        cin >> s;

        long long a = 0;
        long long b = 0;

        for(int i = 0; i < n; i++) 
        {
            if(s[i] == '-')
                a++;
            else
                b++;
        }

        long long ans = b * (a / 2) * ((a % 2 == 0) ? (a / 2) : (a / 2 + 1));
        cout << ans << "\n";
    }

    return 0;
}