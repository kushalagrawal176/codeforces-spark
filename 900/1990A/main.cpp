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

        vector<int> arr(51, 0);

        for (int i = 0; i < n; i++) 
        {
            int x;
            cin >> x;

            arr[x]++;
        }

        int i = 50;
        while (i >= 0 && (arr[i] % 2 == 0))
            i--;

        cout << (i >= 0 ? "YES" : "NO") << "\n";
    }

    return 0;
}
