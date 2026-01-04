#include<bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n,k;
        cin>>n>>k;
        
        vector<int> arr;
        for(int i=0;i<n;i++)
        {
            int a;
            cin>>a;
            
            arr.push_back(a);
        }
        
        sort(arr.begin(), arr.end());
        
        int cnt = 0;
        int sum = 0;
        
        for(int i=n-1;i>=0;i--)
        {
            sum = sum + arr[i];
            if(sum == k)
                break;
            else
            {
                if(sum > k)
                {
                    cnt = k - sum + arr[i];
                    break;
                }
            }
        }
        
        if(sum < k)
            cout<<k - sum<<endl;
        else
            cout<<cnt<<endl;
    }
    
    return 0;
}