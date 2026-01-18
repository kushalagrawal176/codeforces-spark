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
        vector<int> arr(n);

        for (int i = 0; i < n; i++)
            cin >> arr[i];

        bool first = true;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == 1)
                first = !first;
            else 
            {
                first = !first;
                break;
            }
        }

        if (!first)
            cout << "First\n";
        else
            cout << "Second\n";
    }

    return 0;
}
