#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    int cnt_1 = 0, cnt_2 = 0;

    while (t--) 
    {
        int a, b;
        cin >> a >> b;

        if (a > b) 
            cnt_1++;
        if (a < b) 
            cnt_2++;
    }

    if (cnt_1 > cnt_2)
        cout << "Mishka" << endl;
    else if (cnt_1 < cnt_2)
        cout << "Chris" << endl;
    else
        cout << "Friendship is magic!^^" << endl;

    return 0;
}
