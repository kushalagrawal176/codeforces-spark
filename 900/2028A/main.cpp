#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) {
        int n, a, b;
        cin >> n >> a >> b;

        string s;
        cin >> s;

        int x = 0, y = 0;
        string ans = "NO";

        for (int i = 0; i < 300; i++) {
            char ch = s[i % n];

            if (ch == 'N') 
                y++;
            else if (ch == 'E') 
                x++;
            else if (ch == 'W') 
                x--;
            else if (ch == 'S') 
                y--;

            if (x == a && y == b) {
                ans = "YES";
            }
        }

        cout << ans << "\n";
    }

    return 0;
}