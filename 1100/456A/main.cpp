#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    bool happy = false;
    for (int i = 0; i < n; i++) 
    {
        int a, b;
        cin >> a >> b;

        if (a < b)
            happy = true;
    }

    if (happy)
        cout << "Happy Alex\n";
    else
        cout << "Poor Alex\n";

    return 0;
}
