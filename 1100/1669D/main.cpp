#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n;
        string s;

        cin>>n>>s;

        bool possible = true;

        int hasR = 0, hasB = 0;

        for(char c : s) 
        {
            if(c == 'W') 
            {
                // The previous colored segment must contain both R and B.
                if ((hasR ^ hasB) != 0)
                    possible = false;

                // Start a new segment.
                hasR = hasB = 0;
            }
            else if(c == 'R')
                hasR = 1;
            else // c == 'B'
                hasB = 1;
        }

        // Check the last segment.
        if((hasR ^ hasB) != 0)
            possible = false;

        cout<<(possible ? "YES\n" : "NO\n");
    }

    return 0;
}
