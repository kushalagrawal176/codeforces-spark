#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;  // number of test cases

    while (t--) 
    {
        int n;
        cin >> n;

        unordered_set<int> st;  // to track unique elements
        bool flag = true;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;
            if (st.find(a) != st.end()) 
            {
                flag = false;  // duplicate found
            }
            st.insert(a);
        }

        if (flag)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
