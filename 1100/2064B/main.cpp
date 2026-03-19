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

        vector<int> a(n + 1);
        vector<int> freq(n + 1, 0);

        for (int i = 1; i <= n; i++) 
        {
            cin >> a[i];
            freq[a[i]]++;
        }

        int curL = 0, finalL = 0;
        int curR = 0, finalR = 0;
        int maxi = 0;

        for (int i = 1; i <= n; i++) 
        {
            if (freq[a[i]] == 1)
                curR++;
            else
            {
                if (curR - curL > maxi) 
                {
                    finalL = curL;
                    finalR = curR;
                    maxi = curR - curL;
                }

                curL = i;
                curR = i;
            }
        }

        if (curR - curL > maxi) 
        {
            finalL = curL;
            finalR = curR;
            maxi = curR - curL;
        }

        if (finalL == finalR)
            cout << 0 << "\n";
        else
            cout << finalL + 1 << " " << finalR << "\n";
    }

    return 0;
}
