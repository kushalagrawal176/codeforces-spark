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

        int cnt = 0;
        int curr = 0;

        for (int i = 0; i < n; i++) 
        {
            int x;
            cin >> x;
            if (x == 0) 
            {
                if (curr > 0) 
                    cnt++;
                
                curr = 0;
            } else 
                curr++;
        }

        if (curr > 0) 
            cnt++;

        cout << min(2, cnt) << "\n";
    }

    return 0;
}
