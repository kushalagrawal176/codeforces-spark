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

        string s = "";

        // If n is odd, use '7' (which costs 3 segments) and reduce n by 3
        if(n%2 == 1) 
        {
            s = "7";
            n = n - 3;
        }

        // The remaining segments are even, each '1' costs 2 segments
        cout<<s<<string(n/2, '1')<<"\n";
    }

    return 0;
}