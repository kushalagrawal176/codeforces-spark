#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while(t--) 
    {
        long long w, h;
        cin >> w >> h;

        long long max_area = 0;

        for (int i = 0; i < 4; i++) 
        {
            int q;
            cin >> q;
            
            vector<long long> a(q);
            for (int j = 0; j < q; j++)
                cin >> a[j];

            // Calculate base and height using long long to avoid overflow
            long long base = a[q - 1] - a[0];
            long long height = (i < 2) ? h : w;

            max_area = max(max_area, base * height);
        }

        cout << max_area << "\n";
    }

    return 0;
}