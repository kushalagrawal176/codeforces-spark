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

        int px, py, qx, qy;
        cin >> px >> py >> qx >> qy;

        double mx, sum;
        mx = sum = sqrt(pow(px - qx, 2) + pow(py - qy, 2));

        for (int i = 0; i < n; ++i) 
        {
            int x;
            cin >> x;

            mx = max(mx, (double)x);
            sum += x;
        }

        cout << (mx <= sum - mx ? "Yes" : "No") << "\n";
    }

    return 0;
}
