#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while(t--) 
    {
        int n, m;
        cin >> n >> m;

        map<int, int> mp;
        for(int j = 0; j < n; j++) 
        {
            int temp;
            cin >> temp;

            mp[temp] = j;
        }

        int prev = -2;
        int count = 0;

        for(auto const& [key, val] : mp) 
        {
            if(val - prev == 1)
                count++;

            prev = val;
        }

        if(count >= n - m)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}