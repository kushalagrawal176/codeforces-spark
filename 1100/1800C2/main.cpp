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

        long long sum = 0;
        priority_queue<int> pq; // max-heap

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;

            if (a > 0)
                pq.push(a);
            else 
            {
                if (!pq.empty()) 
                {
                    sum += pq.top();
                    pq.pop();
                }
            }
        }

        cout << sum << "\n";
    }

    return 0;
}
