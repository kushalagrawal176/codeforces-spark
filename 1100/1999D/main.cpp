#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) 
    {
        string s;
        cin >> s;
        string a = s;

        cin >> s;
        string b = s;

        string ans = "";

        int ptr1 = 0, ptr2 = 0;

        while (ptr1 < (int)a.size() && ptr2 < (int)b.size()) {
            if (a[ptr1] == '?') {
                ans.push_back(b[ptr2]);
                ptr1++;
                ptr2++;
                continue;
            } else if (a[ptr1] == b[ptr2]) {
                ptr1++;
                ptr2++;
            } else {
                ptr1++;
            }
            ans.push_back(a[ptr1 - 1]);
        }

        while (ptr1 < (int)a.size()) {
            if (a[ptr1] == '?')
                ans.push_back('a');
            else
                ans.push_back(a[ptr1]);
            ptr1++;
        }

        if (ptr2 == (int)b.size())
            cout << "YES\n" << ans << "\n";
        else
            cout << "NO\n";
    }

    return 0;
}
