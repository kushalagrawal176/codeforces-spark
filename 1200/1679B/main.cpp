#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, q;
    cin >> n >> q;

    vector<long long> lastVal(n + 1);
    vector<int> lastTime(n + 1, 0);

    long long sum = 0;
    for (int i = 1; i <= n; i++) 
    {
        cin >> lastVal[i];
        sum += lastVal[i];
    }

    long long globalVal = 0;
    int globalTime = 0;

    for (int t = 1; t <= q; t++) 
    {
        int type;
        cin >> type;

        if (type == 1) 
        {
            int idx;
            long long x;
            cin >> idx >> x;

            long long oldVal;
            if (lastTime[idx] >= globalTime)
                oldVal = lastVal[idx];
            else
                oldVal = globalVal;

            sum = sum - oldVal + x;
            lastVal[idx] = x;
            lastTime[idx] = t;
        } 
        else 
        {
            long long x;
            cin >> x;
            globalVal = x;
            globalTime = t;
            sum = 1LL * n * x;
        }

        cout << sum << "\n";
    }

    return 0;
}
