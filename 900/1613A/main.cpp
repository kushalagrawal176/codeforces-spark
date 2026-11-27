#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        long long x1, p1, x2, p2;
        cin>>x1>>p1>>x2>>p2;

        long long mn = min(p1, p2);
        p1 -= mn;
        p2 -= mn;

        // If the exponent difference is large, the larger exponent dominates
        // (since x1, x2 <= 10^6 in the problem constraints).
        if(p1 >= 7) 
        {
            cout<<">\n";
            continue;
        }

        if(p2 >= 7) 
        {
            cout<<"<\n";
            continue;
        }

        for(int i=0; i<p1; i++) 
            x1 *= 10;

        for(int i=0; i<p2; i++) 
            x2 *= 10;

        if(x1 > x2)
            cout<<">\n";
        else if(x1 < x2)
            cout<<"<\n";
        else
            cout<<"=\n";
    }

    return 0;
}