#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while(t--) 
    {
        int n;
        cin >> n;

        vector<int> a(n);

        int maxi = -1;
        for(int i = 0; i < n; i++) 
        {
            cin >> a[i];
            maxi = max(maxi, a[i]);
        }

        int idx = -1;
        for(int i = 0; i < n; i++) 
        {
            if(a[i] == maxi) 
            {
                // Check if it has a smaller neighbor to eat
                if ((i > 0 && a[i - 1] < a[i]) || (i + 1 < n && a[i + 1] < a[i])) 
                {
                    idx = i + 1; // 1-based indexing
                    break;
                }
            }
        }

        cout << idx << "\n";
    }

    return 0;
}