#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n, k;
        cin>>n>>k;

        // Map to store the first and last occurrence of each station
        // pos[v][0] = first occurrence, pos[v][1] = last occurrence
        unordered_map<int, int[2]> pos;

        for(int i=1; i<=n; i++) 
        {
            int v;
            cin>>v;

            if(pos.find(v) == pos.end()) 
            {
                pos[v][0] = i;
                pos[v][1] = i;
            } 
            else
                pos[v][1] = i;
        }

        while(k--) 
        {
            int a, b;
            cin>>a>>b;

            // Check if both stations exist and the first occurrence of 'a' 
            // appears at or before the last occurrence of 'b'
            if(pos.find(a) != pos.end() && pos.find(b) != pos.end() && pos[a][0] <= pos[b][1])
                cout << "YES\n";
            else
                cout << "NO\n";
        }
    }

    return 0;
}