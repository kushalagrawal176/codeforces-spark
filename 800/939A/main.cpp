#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    vector<int> a(n + 1);
    for (int i = 1; i <= n; i++)
        cin >> a[i];

    bool flag = false;
    for (int i = 1; i <= n; i++) 
    {
        if (a[a[a[i]]] == i) 
        {
            flag = true;
            break;
        }
    }

    if (flag)
        cout << "YES\n";
    else
        cout << "NO\n";

    return 0;
}
