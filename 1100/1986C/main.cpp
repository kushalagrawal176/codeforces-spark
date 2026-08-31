#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--)
    {
        int n, m;
        cin>>n>>m;

        string s;
        cin>>s;

        set<int> indices;
        for(int i = 0; i < m; i++) 
        {
            int idx;
            cin>>idx;
            indices.insert(idx - 1);
        }

        string c;
        cin>>c;
        sort(c.begin(), c.end());

        int l = 0;
        for (int idx : indices)
            s[idx] = c[l++];

        cout<<s<<"\n";
    }

    return 0;
}