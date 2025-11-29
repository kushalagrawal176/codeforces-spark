#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int a, b, c, d;
    cin >> a >> b >> c >> d;

    string s;
    cin >> s;

    long long sum = 0;
    for (char ch : s) 
    {
        if (ch == '1') 
            sum += a;
        else if (ch == '2') 
            sum += b;
        else if (ch == '3') 
            sum += c;
        else if (ch == '4') 
            sum += d;
    }

    cout << sum << "\n";
    return 0;
}
