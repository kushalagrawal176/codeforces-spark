#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n,t;
    cin>>n>>t;
    
    int a[n-1];
    for(int i=0;i<n-1;i++)
        cin>>a[i];
    
    int cnt = 1;
    
    while(cnt < t)
        cnt = cnt + a[cnt-1];
    
    if(cnt == t)
        cout<<"YES";
    else
        cout<<"NO";
    
    return 0;
}