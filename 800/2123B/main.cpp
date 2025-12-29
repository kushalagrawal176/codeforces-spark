#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n,j,k;
        cin>>n>>j>>k;
        
        vector<int> a(n);
        for(int i=0;i<n;i++)
            cin>>a[i];
        
        int num = a[j-1];
        int max_remove = 0;
        int to_remove = n - k;
        
        sort(a.begin(), a.end());
        
        for(int i=0;i<n;i++)
        {
            if(a[i] == num)
            {
                max_remove = i + n-i-1-1;
                if(num == a[n-1])
                    max_remove++;
                break;
            }
        }
        
        if(max_remove < to_remove)
            cout<<"NO"<<endl;
        else
            cout<<"YES"<<endl;
    }
    
    return 0;
}