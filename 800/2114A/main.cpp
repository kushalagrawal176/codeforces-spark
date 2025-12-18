#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n;
        cin >> n;

        long long root = sqrt(n);
        if (root * root == n) 
        {
            cout << 0 << " " << root << "\n";
        } 
        else 
        {
            cout << -1 << "\n";
        }
    }

    return 0;
}
