#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    vector<int> pos, neg, zero;

    for (int i = 0; i < t; i++) 
    {
        int a;
        cin >> a;

        if (a > 0)
            pos.push_back(a);
        else if (a < 0)
            neg.push_back(a);
        else
            zero.push_back(a);
    }

    // First group: one negative number
    cout << 1 << " " << neg.back() << "\n";
    neg.pop_back();

    // Second group: one positive number if available, otherwise two negatives
    if (!pos.empty()) 
    {
        cout << 1 << " " << pos.back() << "\n";
        pos.pop_back();
    } 
    else 
    {
        cout << 2 << " " << neg.back() << " ";
        neg.pop_back();

        cout << neg.back() << "\n";
        neg.pop_back();
    }

    // Third group: rest of the numbers
    cout << (zero.size() + pos.size() + neg.size()) << " ";
    
    for (int x : zero) 
        cout << x << " ";
    for (int x : pos) 
        cout << x << " ";
    for (int x : neg) 
        cout << x << " ";

    cout << "\n";

    return 0;
}
