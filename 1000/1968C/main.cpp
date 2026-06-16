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

        // Initialize the first element
        int a = 501;
        cout << a << " ";

        for (int i = 1; i < n; i++) 
        {
            int x;
            cin >> x;

            a += x;
            cout << a << " ";
        }

        cout << "\n";
    }

    return 0;
}
