#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int l, r, a;
        cin>>l>>r>> a;

        // Maximum value can be achieved at r itself
        int ans = (r / a) + (r % a);

        // The maximum value could also occur right before the multiple of 'a'
        int m = (r / a) * a - 1;

        // Check if m is within the range [l, r]
        if (m >= l)
            ans = max(ans, (m / a) + (m % a));

        cout << ans << "\n";
    }

    return 0;
}