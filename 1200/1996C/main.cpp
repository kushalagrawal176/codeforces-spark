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
        
        int q;
        cin>>q;
        
        string a,b;
        cin>>a>>b;
        
        vector<vector<int>> mp1(n, vector<int>(26, 0));
        vector<vector<int>> mp2(n, vector<int>(26, 0));
        
        mp1[0][a[0]-'a']++;
        mp2[0][b[0]-'a']++;
        
        for(int i=1;i<n;i++)
        {
            mp1[i] = mp1[i-1];
            mp1[i][a[i]-'a']++;
            
            mp2[i] = mp2[i-1];
            mp2[i][b[i]-'a']++;
        }
        
        while(q--)
        {
            int l,r;
            cin>>l>>r;
            
            l--;
            r--;
            
            int cnt = 0;
            vector<int> f1(26, 0);
            vector<int> f2(26, 0);
            
            for(int i=0;i<26;i++)
            {
                if(l-1 >= 0)
                {
                    f1[i] = mp1[r][i] - mp1[l-1][i];
                    f2[i] = mp2[r][i] - mp2[l-1][i];
                }
                else
                {
                    f1[i] = mp1[r][i];
                    f2[i] = mp2[r][i];
                }
            }
            
            for(int i=0;i<26;i++)
            {
                if(f1[i] == f2[i])
                    continue;
                
                cnt += abs(f1[i]-f2[i]);
            }
            
            cout<<cnt/2<<endl;
        }
    }
    
    return 0;
}