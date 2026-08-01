#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n, k;
    cin>>n>>k;

    int maxJoy = INT_MIN;

    while(n--) 
    {
        int f, t;
        cin >> f >> t;

        int joy = (t > k) ? (f - (t - k)) : f;
        maxJoy = max(maxJoy, joy);
    }

    cout << maxJoy << "\n";

    return 0;
}