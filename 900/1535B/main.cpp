#include <bits/stdc++.h>
using namespace std;
 
int count_good_pairs(vector<int>& a) 
{
    int n = a.size();
    
    sort(a.begin(), a.end(), [](int x, int y){ // Custom comparator
        return (x % 2 == 0) > (y % 2 == 0); 
    }); // Place even numbers at the beginning

    int count = 0;
 
    for (int i = 0; i < n; ++i) 
    {
        for (int j = i + 1; j < n; ++j) 
        {
            if (gcd(a[i], 2 * a[j]) > 1) 
                count += 1;
        }
    }

    return count;
}
 
int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;

        vector<int> a(n);
        for (int i = 0; i < n; ++i) 
            cin >> a[i];
        
        cout << count_good_pairs(a) << endl;
    }
    
    return 0;
}