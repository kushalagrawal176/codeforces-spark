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

        unordered_set<int> a;

        for (int i = 0; i < n; i++) 
        {
            int x;
            cin >> x;

            a.insert(x);
        }

        if (a.find(-1) != a.end())
            a.erase(-1);

        if (a.empty() || (a.size() == 1 && a.find(0) == a.end())) {
            cout << "YES\n";
        } else {
            cout << "NO\n";
        }
    }

    return 0;
}
