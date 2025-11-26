#include<bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    
    vector<int> v;
    int maxi = INT_MIN;
    
    while(n--)
    {
        int a;
        cin>>a;
        
        v.push_back(a);
        maxi = max(maxi, a);
    }
    
    int sum = 0;
    
    for(int i=0;i<v.size();i++)
        sum = sum + maxi - v[i];
    
    cout<<sum;
    
    return 0;
}