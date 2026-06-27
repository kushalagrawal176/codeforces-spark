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

        vector<pair<int,int>> a;
        for (int i = 1; i <= n; i++) 
        {
            int val;
            cin >> val;
            a.push_back({i, val});
        }

        sort(a.begin(), a.end(), [](auto &p1, auto &p2) {
            return p1.second > p2.second;
        });

        vector<int> x(n+1, 0);
        long long total = 0;
        int index = 1;
        bool changeSign = false;

        for (auto &arr : a) 
        {
            x[arr.first] = changeSign ? -index : index;
            total += 2LL * index * arr.second;

            if (changeSign) 
                index++;
            changeSign = !changeSign;
        }

        cout << total << "\n";
        for (int i = 0; i <= n; i++)
            cout << x[i] << " ";
        cout << "\n";
    }

    return 0;
}
