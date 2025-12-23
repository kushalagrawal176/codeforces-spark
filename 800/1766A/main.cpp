#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string n;
        cin >> n;

        // Formula: (length - 1) * 9 + first digit
        int result = (n.size() - 1) * 9 + (n[0] - '0');
        cout << result << "\n";
    }

    return 0;
}
