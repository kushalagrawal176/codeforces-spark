#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,m;
    cin>>n>>m;
    
    long long time = 0;
    int a[m];
    
    for(int i=0;i<m;i++)
        cin>>a[i];
    
    time = time + a[0];
    
    for(int i=1;i<m;i++)
    {
        if(a[i] > a[i-1])
            time = time + a[i] - a[i-1];
        if(a[i] < a[i-1])
            time = time + n - (a[i-1] - a[i]);
    }
    
    cout<<time-1;
    
    return 0;
}