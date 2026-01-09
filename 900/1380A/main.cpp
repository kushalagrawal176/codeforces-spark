#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;
        vector<int> arr(n);

        for (int i = 0; i < n; i++) 
            cin >> arr[i];

        int ans = -1;
        for (int i = 1; i < n - 1; i++) 
        {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
            {
                ans = i + 1; // 1-based index
                break;
            }
        }

        if (ans == -1)
            cout << "NO\n";
        else 
        {
            cout << "YES\n";
            cout << ans - 1 << " " << ans << " " << ans + 1 << "\n";
        }
    }
    
    return 0;
}
