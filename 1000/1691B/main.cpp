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

        vector<int> ans(n);
        bool ok = true;

        int i = 0, j = 0;
        while (j < n) 
        {
            if (i == j) 
            {
                if (j == n - 1 || arr[i] != arr[i + 1]) 
                {
                    ok = false;
                    break;
                }
            }

            if (j < n - 1 && arr[j] == arr[j + 1]) 
            {
                ans[j] = j + 1;   // shift to next index
                j++;
            } 
            else if (j == n - 1 || arr[j] != arr[j + 1]) 
            {
                ans[j] = i;       // shift back to start of block
                i = j + 1;
                j = i;
            }
        }

        if (!ok) 
        {
            cout << -1 << "\n";
            continue;
        }

        for (int k = 0; k < n; k++)
            cout << ans[k] + 1 << " ";
    
        cout << "\n";
    }

    return 0;
}
