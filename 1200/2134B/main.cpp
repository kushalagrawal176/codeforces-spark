#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, k;
        cin >> n >> k;

        vector<long long> arr(n);
        for (int i = 0; i < n; i++)
            cin >> arr[i];

        for (int i = 0; i < n; i++)
            arr[i] += 1LL * k * (arr[i] % (k + 1));

        for (int i = 0; i < n; i++)
            cout << arr[i] << " ";
            
        cout << "\n";
    }

    return 0;
}
