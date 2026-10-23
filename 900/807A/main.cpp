#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    int prev_x = INT_MAX;
    bool rated = false, unrated = false;

    while(t--) 
    {
        int x, y;
        cin>>x>>y;

        // If ratings before and after the contest are different for any participant
        if(x != y)
            rated = true;

        // If the initial ratings are not in non-increasing order
        if(prev_x < x)
            unrated = true;

        prev_x = x;
    }

    if(rated)
        cout<<"rated\n";
    else if(unrated)
        cout<<"unrated\n";
    else
        cout<<"maybe\n";

    return 0;
}