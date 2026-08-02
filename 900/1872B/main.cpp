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

        int minTime = INT_MAX;
        while(n--) 
        {
            int d, s;
            cin>>d>>s;

            // Equivalent expression for max safe room threshold
            minTime = min(minTime, d + (s - 1) / 2);
        }

        cout<<minTime<<"\n";
    }

    return 0;
}