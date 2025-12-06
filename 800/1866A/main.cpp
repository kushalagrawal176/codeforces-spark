#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    int mini;
    cin >> mini;
    mini = abs(mini);

    for (int i = 1; i < n; i++) 
    {
        int x;
        cin >> x;
        mini = min(mini, abs(x));
    }

    cout << mini << "\n";

    return 0;
}
