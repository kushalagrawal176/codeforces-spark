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

        for (int i = 0; i < n; i++)
        {
            int m;
            cin >> m;

            string str;
            cin >> str;

            int c = 0;
            for (char ch : str) 
            {
                if (ch == 'U') 
                    c--;
                else 
                    c++;
            }

            arr[i] = (arr[i] + c + 10) % 10;  // ensure non-negative modulo
        }

        for (int i = 0; i < n; i++)
            cout << arr[i] << " ";
        
        cout << "\n";
    }

    return 0;
}
