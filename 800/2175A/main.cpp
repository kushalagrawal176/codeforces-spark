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
        vector<int> a(n);

        for (int i = 0; i < n; i++)
            cin >> a[i];

        sort(a.begin(), a.end());

        int cnt = 0;
        for (int i = 1; i < n; i++) 
        {
            if (a[i] == a[i - 1]) 
                continue;

            cnt++;
        }
        cnt++; // include the first distinct element

        int ans = cnt;
        for (int i = 0; i < n; i++) 
        {
            if (a[i] < cnt) 
                continue;

            ans = a[i];
            break;
        }

        cout << ans << "\n";
    }

    return 0;
}

// solution 2
// #include <bits/stdc++.h>
// using namespace std;

// int main() 
// {
//     int t;
//     cin >> t;

//     while (t--) 
//     {
//         int n;
//         cin >> n;
//         unordered_map<int, int> mp;

//         for (int i = 0; i < n; i++) 
//         {
//             int x;
//             cin >> x;
//             mp[x]++;
//         }

//         int val = mp.size(); // number of distinct elements

//         while (mp.find(val) == mp.end())
//             val++;

//         cout << val << "\n";
//     }
//     return 0;
// }
