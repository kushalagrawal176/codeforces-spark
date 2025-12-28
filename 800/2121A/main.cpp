#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n,s;
        cin>>n>>s;
        
        int mini = INT_MAX;
        int maxi = INT_MIN;
        
        vector<int> a(n);
        for(int i=0;i<n;i++)
            cin>>a[i];
        
        if(n == 1)
            cout<<abs(s-a[0])<<endl;
        else if(s <= a[0])
            cout<<abs(a[n-1] - s)<<endl;
        else if(s >= a[n-1])
            cout<<abs(s-a[0])<<endl;
        else
            cout<<min(s-a[0], a[n-1]-s)*2 + max(s-a[0], a[n-1]-s)<<endl;
    }
    
    return 0;
}