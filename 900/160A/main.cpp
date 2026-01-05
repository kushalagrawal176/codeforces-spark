#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    
    vector<int> v;
    int sum = 0;
    
    while(n--)
    {
        int a;
        cin>>a;
        
        v.push_back(a);
        sum = sum + a;
    }
    
    int cnt = 0;
    
    sort(v.begin(), v.end());

    int s = 0;
    int i = v.size()-1;
    
    while(s <= sum/2)
    {
        s = s + v[i];
        cnt++;
        i--;
    }
    
    cout<<cnt;
    
    return 0;
}