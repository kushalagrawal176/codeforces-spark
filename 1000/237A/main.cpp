#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    int cnt = 1, c = 1;
    int prev_h, prev_m;
    cin >> prev_h >> prev_m;

    n--;
    while (n--) 
    {
        int h, m;
        cin >> h >> m;

        if (h != prev_h || m != prev_m)
            c = 1;
        else
            c++;

        cnt = max(cnt, c);

        prev_h = h;
        prev_m = m;
    }

    cout << cnt << endl;

    return 0;
}
