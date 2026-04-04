#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, x;
        cin >> n >> x;

        vector<int> arr(n);
        for (int i = 0; i < n; i++)
            cin >> arr[i];

        sort(arr.begin(), arr.end());

        int l = 0, r = n - 1;
        long long res = 0, cur = 0;
        vector<int> list;

        while (l <= r) 
        {
            if (cur + arr[r] >= x) 
            {
                cur += arr[r];
                res += arr[r];

                list.push_back(arr[r]);

                r--;
                cur = cur % x;
            } 
            else 
            {
                cur += arr[l];
                list.push_back(arr[l]);
                l++;
            }
        }

        cout << res << "\n";
        for (int ele : list)
            cout << ele << " ";
        cout << "\n";
    }

    return 0;
}
