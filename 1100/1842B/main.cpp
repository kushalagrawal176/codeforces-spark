#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n, x;
        cin>>n>>x;

        vector<int> a(n);
        int c = 0;

        for(int i=0; i<3; i++) 
        {
            for(int j=0; j<n; j++)
                cin>>a[j];

            for(int j=0; j<n; j++) 
            {
                if((a[j] | x) != x)
                    break;

                c |= a[j];
            }
        }

        if(c == x)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}