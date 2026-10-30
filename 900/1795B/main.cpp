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

        int p = -1, z = 0;

        while(n--) 
        {
            int a, b;
            cin>>a>>b;

            if(a == k) 
                p = 1;
            if(b == k) 
                z = 1;
        }

        if(p == 1 && z == 1) 
            cout << "YES\n";
        else 
            cout << "NO\n";
    }

    return 0;
}