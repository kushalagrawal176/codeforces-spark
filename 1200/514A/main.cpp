#include <bits/stdc++.h>
using namespace std;

int main()
{
    string a;
    cin >> a;

    for (int i = 0; i < (int)a.size(); i++) 
    {
        if (a[i] > '4')
            a[i] = '9' - a[i] + '0';  // transform digit

        if (i == 0 && a[i] == '0')
            a[i] = '9';  // first digit should not be zero
    }

    cout << a << endl;
    
    return 0;
}
