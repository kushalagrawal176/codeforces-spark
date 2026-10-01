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
        
        int g = n, sum = -1;
        for(int i=n; i<=m; i++) 
        {
            int mx = 0, mn = 9;
            int j = i;
            
            while(j > 0) 
            {
                int r = j % 10;
                mx = max(mx, r);
                mn = min(mn, r);
                j = j / 10;
            }
        
            int a = mx - mn;
            
            if(a > sum) 
            {
                sum = a;
                g = i;
            }
            
            if(sum == 9)
                break;
        }

        cout<<g<<"\n";
    }

    return 0;
}