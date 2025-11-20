#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int y;
    cin>>y;

    y++;

    while(true)
    {
        map<int,int> mp;
        
        int t = y;
        
        while(t!=0)
        {
            if(mp[t%10])
                break;
            mp[t%10] = 1;
            t = t/10;
        }
        if(t == 0)
            break;
        y++;
    }
    
    cout<<y;
    return 0;
}