#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    
    int arr[n];
    
    for(int i=0;i<n;i++)
        cin>>arr[i];
    
    int cnt = 0;
    int ans = 0;
    
    for(int i=0;i<n-1;i++)
    {
        if(arr[i+1] >= arr[i])
        {
            cnt++;
            if(cnt>ans)
                ans = cnt;
        }
        else
        {
            if(cnt>ans)
                ans = cnt;
            cnt = 0;
        }
    }
    
    cout<<ans+1;
    
    return 0;
}