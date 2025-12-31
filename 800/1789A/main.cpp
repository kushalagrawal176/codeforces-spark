#include <bits/stdc++.h>
using namespace std;

// Function to compute gcd
int gcd(int a, int b) 
{
    if (b == 0) 
        return a;

    return gcd(b, a % b);
}

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

        bool flag = false;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (gcd(arr[i], arr[j]) <= 2) 
                {
                    flag = true;
                    break;
                }
            }
            
            if (flag) 
                break;
        }

        if (flag)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
