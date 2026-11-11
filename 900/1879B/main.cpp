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

        long long sumA = 0;
        long long minA = LLONG_MAX;

        for(int i=0; i<n; i++) 
        {
            long long val;
            cin>>val;

            sumA += val;
            minA = min(minA, val);
        }

        long long sumB = 0;
        long long minB = LLONG_MAX;

        for(int i=0; i<n; i++) 
        {
            long long val;
            cin>>val;

            sumB += val;
            minB = min(minB, val);
        }

        long long option1 = sumA + (long long)n * minB;
        long long option2 = (long long)n * minA + sumB;
        long long ans = min(option1, option2);

        cout<<ans<<"\n";
    }

    return 0;
}