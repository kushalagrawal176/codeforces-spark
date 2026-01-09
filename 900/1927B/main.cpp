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

        // Array to track counts for each index
        vector<int> a(200001, 0);

        for (int i = 0; i < n; i++) 
        {
            int c;
            cin >> c;

            cout << char('a' + a[c]);
            a[c]++;
        }
        
        cout << "\n";
    }
    return 0;
}
