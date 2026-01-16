#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, k;
    cin >> n >> k;

    vector<int> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[i];

    long long sum = 0;
    for (int i = 0; i < k; i++)
        sum += a[i];

    long long mini = sum;
    int index = 0;

    for (int i = k; i < n; i++) 
    {
        sum += a[i] - a[i - k];
        if (sum < mini) 
        {
            mini = sum;
            index = i - k + 1;
        }
    }

    cout << index + 1 << "\n";

    return 0;
}
