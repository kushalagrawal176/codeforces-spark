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

        unordered_set<int> s;
        bool flag = false;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;

            if (s.find(a) != s.end())
                flag = true;

            s.insert(a);
        }

        cout << (flag ? "YES" : "NO") << "\n";
    }

    return 0;
}
