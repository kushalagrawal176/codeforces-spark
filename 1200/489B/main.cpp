#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int m;
    cin >> m;
    vector<int> boys(m);

    for (int i = 0; i < m; i++)
        cin >> boys[i];

    int n;
    cin >> n;
    vector<int> girls(n);

    for (int i = 0; i < n; i++)
        cin >> girls[i];

    sort(boys.begin(), boys.end());
    sort(girls.begin(), girls.end());

    int ptr1 = 0, ptr2 = 0;
    int cnt = 0;

    while (ptr1 < m && ptr2 < n) 
    {
        if (abs(boys[ptr1] - girls[ptr2]) <= 1) 
        {
            cnt++;
            ptr1++;
            ptr2++;
        } 
        else if (boys[ptr1] > girls[ptr2])
            ptr2++;
        else
            ptr1++;
    }

    cout << cnt << "\n";
    
    return 0;
}
