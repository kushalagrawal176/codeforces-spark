#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int q;
    cin>>q;

    while(q--) 
    {
        int n, t;
        cin>>n>>t;
        string s;
        cin>>s;

        while(t--) 
        {
            int l_1, r_1;
            cin>>l_1>>r_1;

            int l = l_1 - 1;
            int r = r_1 - 1;

            // Equivalent to Java's substring and indexOf checks
            bool left_match = s.substr(0, l).find(s[l]) != string::npos;
            bool right_match = s.substr(r + 1).find(s[r]) != string::npos;

            if (left_match || right_match)
                cout<<"YES\n";
            else
                cout<<"NO\n";
        }
    }

    return 0;
}