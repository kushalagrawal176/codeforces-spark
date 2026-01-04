#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n;
        cin>>n;
        
        int cnt = 0;
        
        while(n != 1)
        {
            cnt++;
            n = n/2;
        }
        
        cout<<(cnt+1)*2 + 1<<endl;
    }
    
    return 0;
}