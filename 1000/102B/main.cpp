#include<bits/stdc++.h>
using namespace std;

int main() 
{
    string s;
    cin>>s;

    int cnt = 0;

    while (s.length() > 1) 
    {
        cnt++;
        long long sum = 0;

        for (size_t i = 0; i < s.length(); i++)
            sum += s[i] - '0';

        s = to_string(sum);
    }

    cout << cnt << "\n";

    return 0;
}