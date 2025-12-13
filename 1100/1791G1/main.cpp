#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        long long c;
        cin >> n >> c;

        vector<long long> arr(n);
        for (int i = 0; i < n; i++) 
        {
            int x;
            cin >> x;
            arr[i] = x + i + 1;  // same adjustment as in Java
        }

        sort(arr.begin(), arr.end());

        int cnt = 0;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] <= c) 
            {
                c -= arr[i];
                cnt++;
            } 
            else 
            {
                break;
            }
        }

        cout << cnt << "\n";
    }

    return 0;
}
