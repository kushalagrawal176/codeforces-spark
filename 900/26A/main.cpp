#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    int cnt = 0;

    for (int i = 2; i <= n; i++) 
    {
        int j = i;
        int k = 0;
        int d = 2;

        while (j > 1) 
        {
            if (j % d == 0) 
            {
                k++;
                j /= d;

                while (j % d == 0) 
                    j /= d;
            }
            d++;
        }

        if (k == 2)
            cnt++;
    }

    cout << cnt << "\n";

    return 0;
}
