#include <bits/stdc++.h>
using namespace std;

long long solve(const string &s, char c) 
{
    vector<int> a;
    for (int i = 0; i < (int)s.size(); i++) {
        if (s[i] == c) 
            a.push_back(i);
    }

    if (a.empty()) 
        return 0;

    int m = a.size() / 2;
    long long ans = 0;

    for (int i = 0; i < (int)a.size(); i++)
        ans += abs(a[i] - (a[m] + i - m));

    return ans;
}

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        string s;

        cin >> n >> s;

        cout << min(solve(s, 'a'), solve(s, 'b')) << "\n";
    }
    return 0;
}
