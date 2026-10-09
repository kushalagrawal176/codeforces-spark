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
        bool isSymm = false;

        for(int i=0; i<n; i++) 
        {
            int a, b, c, d;
            cin>>a>>b>>c>>d;

            // Check if the 2x2 tile is symmetric (top-right == bottom-left)
            if(c == b)
                isSymm = true;
        }

        // m must be even, and we need at least one symmetric tile
        if(m % 2 != 0)
            cout<<"NO\n";
        else
            cout<<(isSymm ? "YES\n" : "NO\n");
    }

    return 0;
}