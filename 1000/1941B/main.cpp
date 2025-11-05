#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() 
{   
    int t;
    cin >> t;
    
    while (t--) 
    {
        int n;
        cin >> n;

        vector<int> a(n);
        
        for (int i = 0; i < n; i++)
            cin >> a[i];
        
        int count = 0;
        for (int i = 0; i < n - 2; i++) 
        {
            int num = a[i];
            if (a[i + 1] >= 2 * num && a[i + 2] >= a[i]) 
            {
                a[i] = 0;
                a[i + 1] -= 2 * num;
                a[i + 2] -= num;
                count++;
            } 
            else
                break;
        }
        
        if (count == n - 2 && a[n - 1] == 0 && a[n - 2] == 0)
            cout << "YES\n";
        else
            cout << "NO\n";
    }
    
    return 0;
}
