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

        vector<int> arr(n);
        for (int i = 0; i < n; i++)
            cin >> arr[i];

        bool flag = false;
        int index = -1;

        for (int i = 0; i < n; i++) 
        {
            bool check = true;
            for (int j = 0; j < n; j++) 
            {
                if (i == j) 
                    continue;

                if (abs(arr[i] - arr[j]) % k == 0) 
                {
                    check = false;
                    break;
                }
            }

            if (check) 
            {
                flag = true;
                index = i;
                break;
            }
        }

        if (flag)
            cout << "YES\n" << (index + 1) << "\n";
        else
            cout << "NO\n";
    }

    return 0;
}
