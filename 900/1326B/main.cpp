#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    long long max_val = 0;
    for(int i=0; i<n; i++) 
    {
        long long a_i;
        cin>>a_i;

        long long temp = a_i + max_val;
        max_val = max(max_val, temp);

        cout<<temp<<" ";
    }

    cout<<"\n";

    return 0;
}