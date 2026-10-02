#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n, m;
    cin>>n>>m;

    // Vector of pairs to store matches (boxes, matches_per_box)
    // We store as {matches_per_box, number_of_boxes} so that sorting 
    // sorts primarily by matches_per_box in descending order.
    vector<pair<int, int>> boxes(m);

    for(int i=0; i<m; i++)
        cin>>boxes[i].second>>boxes[i].first; // input: boxes, matches

    // Sort in descending order based on matches per box (first element of pair)
    sort(boxes.rbegin(), boxes.rend());

    long long ans = 0; // Use long long to avoid any potential overflow

    for(int i=0; i<m; i++) 
    {
        if(n <= 0) 
            break;

        int take = min(n, boxes[i].second);
        n -= take;
        ans += (long long)take * boxes[i].first;
    }

    cout<<ans<<"\n";

    return 0;
}