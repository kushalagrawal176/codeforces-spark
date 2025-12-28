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
        
        vector<int> a(n);
        for(int i=0;i<n;i++)
            cin>>a[i];
        
        int cnt = 0;
        int curr = 0;
        
        for(int i=0;i<n;i++)
        {
            if(a[i] == 1)
            {
                curr = 0;
            }
            else
            {
                curr++;
                if(curr == k)
                {
                    cnt++;
                    i++;
                    curr = 0;
                }
            }
        }
        
        cout<<cnt<<endl;
    }
    
    return 0;
}