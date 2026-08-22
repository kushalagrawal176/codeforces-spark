#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n, m;
        cin>>n>>m;

        unordered_set<int> r;
        unordered_set<int> c;

        for(int i = 0; i < n; i++) 
        {
            for(int j = 0; j < m; j++) 
            {
                int val;
                cin>>val;

                if(val == 1) 
                {
                    r.insert(i);
                    c.insert(j);
                }
            }
        }

        int ur = n - r.size();
        int uc = m - c.size();

        int ans = min(ur, uc);
        
        if (ans % 2 != 0)
            cout << "Ashish\n";
        else
            cout << "Vivek\n";
    }

    return 0;
}