#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, k;
    cin >> n >> k;

    string s;
    cin >> s;

    vector<int> allowed(26, 0);
    for (int i = 0; i < k; i++) 
    {
        char c;
        cin >> c;
        allowed[c - 'a'] = 1;
    }

    long long sum = 0;
    long long ans = 0;

    for (int i = 0; i < n; i++) 
    {
        if (allowed[s[i] - 'a'])
            sum++;
        else 
        {
            ans += (sum * (sum + 1)) / 2;
            sum = 0;
        }
    }

    ans += (sum * (sum + 1)) / 2;
    cout << ans;
}
