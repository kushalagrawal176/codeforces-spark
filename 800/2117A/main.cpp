#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n,x;
        cin>>n>>x;
        
        int one = 0;
        vector<int> a(n);
        int index = -1;
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
            if(a[i] == 1)
            {
                if(index == -1)
                    index = i;
            }
        }
        int index1 = -1;
        for(int i=n-1;i>=0;i--)
        {
            if(a[i] == 1)
                index1 = i;
            
            if(index1 != -1)
                break;
        }
        
        if(index == -1 || index1 - index + 1 <= x)
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
    
    return 0;
}