#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;

        vector<int> arr(n);
        for (int i = 0; i < n; i++)
            cin >> arr[i];

        int m;
        cin >> m;
        for (int i = 0; i < m; i++) 
        {
            string s;
            cin >> s;

            // If lengths don't match, it's immediately invalid
            if (s.length() != n) 
            {
                cout << "NO\n";
                continue;
            }

            map<int, char> num_to_char;
            map<char, int> char_to_num;
            bool valid = true;

            for (int j = 0; j < n; j++) 
            {
                int num = arr[j];
                char ch = s[j];

                // Check number -> character mapping
                if (num_to_char.count(num) && num_to_char[num] != ch) 
                {
                    valid = false;
                    break;
                }
                
                // Check character -> number mapping
                if (char_to_num.count(ch) && char_to_num[ch] != num) 
                {
                    valid = false;
                    break;
                }

                // Establish the bidirectional link
                num_to_char[num] = ch;
                char_to_num[ch] = num;
            }

            if (valid)
                cout << "YES\n";
            else
                cout << "NO\n";
        }
    }

    return 0;
}