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

        long long sum = 0;

        for(int i=0; i<n; i++) 
        {
            long long a;
            cin>>a;

            if(i < n-1) 
            {
                sum += a;
                // If element is 0 and we've already encountered non-zero elements before it
                if(a == 0 && sum != 0)
                    sum++;
            }
        }

        cout<<sum<<"\n";
    }

    return 0;
}