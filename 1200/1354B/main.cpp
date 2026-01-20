#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string s;
        cin >> s;
        int n = s.size();

        int one = 0, two = 0, three = 0;
        int left = 0, right = 0;
        int len = n + 1; // initially set to something larger than possible

        while (right < n) 
        {
            if (s[right] == '1') 
                one++;
            else if (s[right] == '2') 
                two++;
            else 
                three++;

            while (left <= right && one >= 1 && two >= 1 && three >= 1) 
            {
                len = min(len, right - left + 1);

                if (s[left] == '1') 
                    one--;
                else if (s[left] == '2') 
                    two--;
                else 
                    three--;

                left++;
            }
            right++;
        }

        if (len == n + 1) 
            len = 0;
            
        cout << len << "\n";
    }

    return 0;
}
