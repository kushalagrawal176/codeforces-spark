#include<bits/stdc++.h>
using namespace std;

void solve() 
{
    int n, m;
    cin >> n >> m;

    vector<long long> a(n), b(m);
    for(int i = 0; i < n; i++) 
        cin >> a[i];
    for(int i = 0; i < m; i++) 
        cin >> b[i];

    sort(a.begin(), a.end());
    sort(b.begin(), b.end());

    long long diff = 0;
    int left_a = 0, right_a = n - 1;
    int left_b = 0, right_b = m - 1;

    for(int i = 0; i < n; i++) 
    {
        long long d1 = abs(a[left_a] - b[right_b]);
        long long d2 = abs(a[right_a] - b[left_b]);

        if(d1 > d2) 
        {
            diff += d1;
            left_a++;
            right_b--;
        } 
        else
        {
            diff += d2;
            right_a--;
            left_b++;
        }
    }
    cout << diff << endl;
}

int main() 
{
    int t;
    cin >> t;
    while (t--)
        solve();

    return 0;
}