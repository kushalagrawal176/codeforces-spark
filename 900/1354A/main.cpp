#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        long long a, b, c, d;
        cin>>a>>b>>c>>d;

        if(a <= b)
            cout<<b<<"\n";
        else if(c <= d)
            cout<<-1<<"\n";
        else
        {
            long long remaining = a - b;
            long long cycle = c - d;
            // Ceiling division equivalent to Java's division + modulo check
            long long needed_cycles = (remaining + cycle - 1) / cycle;
            long long s = needed_cycles * c + b;
            
            cout<<s<<"\n";
        }
    }

    return 0;
}