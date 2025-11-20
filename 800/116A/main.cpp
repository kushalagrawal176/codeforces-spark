#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    
    int maxi = INT_MIN;
    int pass = 0;
    
    for(int i=0;i<n;i++)
    {
        int a,b;
        cin>>a>>b;
        
        maxi = max(maxi, pass-a+b);
        pass = pass-a+b;
    }
    
    cout<<maxi;
    return 0;
}