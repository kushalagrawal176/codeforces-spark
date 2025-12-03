#include <bits/stdc++.h>
using namespace std;

vector<pair<int, int>> getTopThree(vector<int>& arr) 
{
    vector<pair<int, int>> list;
    for (int i = 0; i < arr.size(); i++) 
    {
        list.emplace_back(arr[i], i);
    }

    sort(list.rbegin(), list.rend());  // Descending order (value first)
    return vector<pair<int, int>>(list.begin(), list.begin() + min(3, (int)list.size()));
}

int main() 
{    
    int t;
    cin >> t;
    
    while (t--) 
    {
        int n;
        cin >> n;
        
        vector<int> a(n), b(n), c(n);

        for (int i = 0; i < n; i++) 
            cin >> a[i];
        for (int i = 0; i < n; i++) 
            cin >> b[i];
        for (int i = 0; i < n; i++) 
            cin >> c[i];
        
        auto topA = getTopThree(a);
        auto topB = getTopThree(b);
        auto topC = getTopThree(c);
        
        long long maxSum = -1;
        
        for (auto& pa : topA) 
        {
            for (auto& pb : topB) 
            {
                for (auto& pc : topC) 
                {
                    int dayA = pa.second, dayB = pb.second, dayC = pc.second;
                    
                    if (dayA != dayB && dayA != dayC && dayB != dayC) 
                    {
                        long long sum = (long long)pa.first + pb.first + pc.first;
                        if (sum > maxSum) 
                            maxSum = sum;
                    }
                }
            }
        }
        
        cout << maxSum << '\n';
    }
    return 0;
}
